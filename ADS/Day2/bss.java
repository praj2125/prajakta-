class bss
{
	public static int Bin(int arr[], int l,int r,int x)
	{
	 if(r>=l)
	 {
		int mid =(l+(r-l))/2;
		if(arr[mid]==x)
		return mid;
		if(arr[mid]>x)
		 return Bin(arr,l,x,mid-1);
		  return Bin(arr,r,x,mid+1);
	    }
		return -1;
	}
		

	public static void main(String args[])
	{
	int arr[]={10,20,30,40,50,60,70,80,90};
	int n=arr.length;
	int x= 80;
	
	int result = Bin(arr,0,n-1,x);
	
	if (result == -1)
	System.out.println("Element Not Found");
	else
	System.out.println("Element  Found");
	}
}