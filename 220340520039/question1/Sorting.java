import java.util.*;
class Sorting
{
static void insertionSort(int n,int a[])
{
	for(int i=1;i<n;i++)
	{
		int k=a[i];
		int j=i-1;
		while(j>=0 && a[j]> k)
		{
			a[j+1]=a[j];
			j=j-1;
			print(a);
		}
		a[j+1]=k;
	}
}
 static void print(int a[])
 {
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+ " ");
	 }
	 System.out.println();
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 insertionSort(n,a);
	 print(a);
 }
}