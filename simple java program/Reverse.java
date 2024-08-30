class Reverse
{
    public static void main(String [] args)
    {
        int num=543;
        int dup=num;
        int rev=0;

        int rem=num%10;
        System.out.println(rem);
        rev=(rev*10)+rem;
          System.out.println(rev);
        num=num/10;
          System.out.println(num);
        rem=num%10;
          System.out.println(rem);
        rev=(rev*10)+rem;
          System.out.println(rev);
        num=num/10;
          System.out.println(num);
        rem=num%10;
          System.out.println(rem);
        rev=(rev*10)+rem;
        System.out.println("rev no"+ dup +"is"+ rev);
    }
}