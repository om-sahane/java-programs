class UppercaseLowercase
{
    public static void main(String [] args)
    {
        char c='%';
        String op=
        ((c>=65 && c<=90)||(c>=90 && c<=122))?
        ((c>=65 && c<=90)?(c+"is a uppercase alphabet"):(c+"is a lowercase alphabet")):
        ((c>=48 && c<=57)?(c+"is a digit"):(c+"is a special character"));
        System.out.println(op);
        
    }
}