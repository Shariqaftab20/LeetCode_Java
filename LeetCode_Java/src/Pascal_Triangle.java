import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        PascalPrint(n);
    }
    public static void PascalPrint(int n){
        if(n==0) return;
        List<List<Integer>> triangle = new ArrayList<>(); 
        List<Integer> first_Row = new ArrayList<>();
        first_Row.add(1);
        triangle.add(first_Row);
        for(int i=1;i<n;i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            for(int j=1;j<i;j++)
            {
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            curr_row.add(1);
            triangle.add(curr_row);
        } 
        for(int i=0;i<n;i++)
        {
            for(int sp=0;sp<n-i-1;sp++)
                System.out.print(" ");
            List<Integer> curr_row=triangle.get(i);
            for(int j=0;j<curr_row.size();j++)
            {
                System.out.print(curr_row.get(j)+" ");
            }
            System.out.println();
        }      
    }
    
}
