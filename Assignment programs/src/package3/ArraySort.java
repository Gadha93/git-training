package package3;

public class ArraySort {

	public static void main(String[] args) {
		
		int arr[]= {10,25,15,99,85,55};
		int i;
		System.out.println("Array Elements before sorting");
		for(i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array elements after sorting");
		int temp=0;
		int j;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);// TODO Auto-generated method stub

		}
		
	}

}
