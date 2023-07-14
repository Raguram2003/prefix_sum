import java.util.Arrays;
import java.util.Scanner;



public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array element : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array Element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] p =new int[size];
        int i=0;
        while(i<size){
            if(i==0){
                p[0] = arr[i];
            }
            else {
                p[i] = p[i-1]+arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(p));
    }
}
