import java.util.Scanner;
public class A1Q7 {
          public static void main(String[]args) {
        	  Scanner sc = new Scanner(System.in);
        	  System.out.print("Enter the number of elements in Array : ");
        	  int n = sc.nextInt();
        	  int []A = new int [n];
        	  for(int i=0;i<n;i++) {
        		  A[i]=sc.nextInt();
        		  
        	  }
        	  int l = A[0],cl=0,posL=-1;
        	  int s = A[n-1],cS=0,posS=-1;
        	  
        	  for(int i=0;i<n;i++) {
        		  if(A[i]>l) {
        			  l= A[i];
        			  posL=i+1;
        			 
        		  }
        	  }
        	  
        	  for(int i=n-2;i>0;i--) {
        		  if(A[i]<s) {
        			  s = A[i];
        			  posS=n-i;
        			
        		  }
        	  }
        	  
        	  for(int i=0;i<n;i++) {
        		  if(A[i]==l) {        			      			  
        			  cl++;
        		  }
        	  }
        	  for(int i=0;i<n;i++) {
        		  if(A[i]==s) {        			         			
        			  cS++;
        		  }
        	  }
        	  System.out.println("The maximum number in the array is "+l+" and it occur "+cl+" times ");
        	  System.out.println("The Position of maximum from the begining : "+posL);
        	  System.out.println("The minimum number in the array is "+s+" and it occur "+cS+" times ");
        	  System.out.println("Position of minimum from the end  : "+posS);
          }
}
