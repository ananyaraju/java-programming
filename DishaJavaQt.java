import java.util.Scanner;
public class DishaJavaQt
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[4][];
        int counts[] = new int[4];
        for (int i=0; i<4; i++)
            counts[i] = s.nextInt();
        int temp, j, quo;
        for (int i=0; i<4; i++)
        {
            j=0;
            temp = counts[i];
            quo = temp/4;
            if (temp%4 == 0)
                arr[i] = new int[quo];
            else
                arr[i] = new int[quo+1];
            while (temp>0)
            {
                if (temp<4)
                    arr[i][j] = temp;
                else
                    arr[i][j] = 4;
                temp=temp-4;
                j++;
            }
            j=0;
        }
        System.out.println("\nPrinting results: ");
        for (int[] row: arr)
        {
            for (int x: row)
            {
                System.out.print(x + " ");
            }
            System.out.print("\n");
        }
        s.close();
    }
}