class LargestSmallestNumber
{
	public static void main(String [] args)
	{
		int num1=13;
		int num2=5;
		int largest=(num1>num2)?(num1):(num2);
		System.out.println("largest number among"+num1+","+num2+" is :"+largest);
		int smallest=(num1<num2)?(num1):(num2);
		System.out.println("smallest number among"+num1+","+num2+" is :"+smallest);

	}
}