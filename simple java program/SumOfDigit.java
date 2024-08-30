class SumOfDigit
{
    public static void main(String [] args)
    {
        int num=543;
        int dup=num;
        int sum=0;

        int rem=num%10;
        System.out.println(rem);
        sum=sum+rem;
          System.out.println(sum);
        num=num/10;
          System.out.println(num);
        rem=num%10;
          System.out.println(rem);
        sum=sum+rem;
          System.out.println(sum);
        num=num/10;
          System.out.println(num);
        rem=num%10;
          System.out.println(rem);
        sum=sum+rem;
        System.out.println("sum of"+ dup +"is"+ sum);
    }
}