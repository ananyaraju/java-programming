import java.util.*;
class exceptions
{
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in);) {
            
            System.out.println("execution starts");
            int x[]=new int[3];
            x[1]=s.nextInt();
            System.out.println(x[-1]);
        }
        catch(InputMismatchException e) {
            System.out.println(e);
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("exception 2");
        }
        finally {
            System.out.println("execution completed");
        }

    }
}