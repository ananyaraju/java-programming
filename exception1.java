import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        int number1=0, number2=0;  
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            System.out.println("Enter the number-1: ");
            number1 = sc.nextInt();
            System.out.println("Enter the number-2: ");
            number2 = sc.nextInt();  
            System.out.println("Division=>"+(number1/number2));

        }catch(Exception e){
            System.out.println("Division=>Inf");
        }
        System.out.println("Addition=>"+(number1+number2));
    }
}