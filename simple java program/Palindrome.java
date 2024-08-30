class Palindrome
{
    public static void main(String [] args)
    {
        int num=121;
        int dup=num;
        int rev=0;

        int rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
        rem=num%10;
        rev=(rev*10)+rem;

        if(dup==rev)
        {
            System.out.println("palindrome no"+dup);
        }
        else{
            System.out.println("not palindrome no"+dup);
        }

    }
}