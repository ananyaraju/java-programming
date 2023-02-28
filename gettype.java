public class gettype
{
    public static void main(String[] arg)
    {
 
        String input = "56.73";
        String dataType = null;
 
        if (input.matches("\\d+"))
        {
            dataType = "java.lang.Integer";
        }
 
        else if (input.matches("\\d*[.]\\d+"))
        {
            dataType = "java.lang.Double";
        }
 
        else
        {
            dataType = "java.lang.String";
        }
 
        System.out.println("The datatype is: " + dataType);
    }
}