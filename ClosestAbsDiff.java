import java.util.*;
public class ClosestAbsDiff{
   public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no.of values:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
     int k=sc.nextInt();
     int ans=arr[0];
     for(int i=1;i<n;i++){
        int diff1=Math.abs(arr[i]-k);
        int diff2=Math.abs(ans-k);
         if(diff1<diff2){
          ans=arr[i];
          }
          else if(diff1==diff2 && arr[i]>ans){
             ans=arr[i];
           }
         }
            System.out.println(ans);

}
}


     