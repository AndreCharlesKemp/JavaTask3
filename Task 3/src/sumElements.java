import javax.swing.*;

public class sumElements
{
    public static void main(String[] args)
    {
        // Declare array for input and for sum of columns
        int[][] num_array = new int[3][4];
        int[] column_sum = new int[4];

        // User input values for num_array, calculate sum of columns and store in column_sum
        System.out.println("Enter values for 3x4 array: ");
        for(int x=0; x<3; x++)
            for(int y=0; y<4; y++)
            {
                String string_value = JOptionPane.showInputDialog("Enter value for row"+(x+1)+" column"+(y+1));
                int value = Integer.parseInt(string_value);
                num_array[x][y] = value;
                column_sum[y] = column_sum[y] + num_array[x][y];
            }

        // Print out the sum of the columns
        System.out.println("The sum of the columns\n**********************");
        for(int y=0; y<4; y++)
            System.out.println("\tColumn "+(y+1)+": "+column_sum[y]);

    }
}
