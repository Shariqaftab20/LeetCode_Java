import java.util.*;
public class Distinct_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elments: ");
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            arr[i]=a;
        }
        if(isDistinct(arr)==true)
        System.out.println("Fuck yeaaaah");
        else
        System.out.println("Fuck nooooooo");
    }
    public static boolean isDistinct(int[] arr){
        HashSet<Integer> dist = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(dist.contains(arr[i]))
                return false;
            dist.add(arr[i]);
        }
        return true;
    }
}
