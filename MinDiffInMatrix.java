import java.util.Scanner;
public class MinDiffInMatrix
{
    public static void main(String args[])
    {
        int i, j;
        int[][] a = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                a[i][j] = s.nextInt();
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                System.out.print(a[i][j]+" ");
            System.out.println("\n");
        int curr, min=0, temp, diff;
        int e1=0, e2=0;
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                curr = a[i][j];
                for (i=0; i<3; i++)
                {
                    for (j=0; j<3; j++)
                    {
                        temp = a[i][j];
                        diff = curr - temp;
                        if (diff < min)
                        {
                            min = diff;
                            e1 = curr;
                            e2 = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Minimum difference is " + min + " between " + e1 + " and " + e2);
    }
}