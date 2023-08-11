import java.util.Scanner;
public class percentage {
    public static void main(String args[])
    {
        float sociology,economics,evs,contracts,familylaw;
        double total, average, percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of sociology subjects:");
        sociology=op.nextFloat();
        System.out.print("Enter marks of economics subjects:");
       economics=op.nextFloat();
        System.out.print("Enter marks of evs subjects:");
       evs=op.nextFloat();
        System.out.print("Enter marks of contracts subjects:");
       contracts=op.nextFloat();
        System.out.print("Enter marks of familylaw subjects:");
       familylaw=op.nextFloat();

        /* Calculate total, average and percentage */
        total = sociology+economics+evs+contracts+familylaw;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;

        /* Print all results */
        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);

    }
}

