class LeapYear
{
    public static void main(String [] args)
    {
        int year=2024;
        String op=
        ((year%4==0)&&((year%400==0)||(year%100!=0)))?
        (year+"is a leap year"):(year+"is not a leap year");
        System.out.println(op);
    }
}