import javax.swing.*;

public class identicalArrays
{
    public static void main(String[] args)
    {
        // Get array length from user and cast into an integer
        String array_length_string = JOptionPane.showInputDialog("Enter preferred size of the arrays: ");
        int array_length = Integer.parseInt(array_length_string);

        // Declare arrays and set length, Declare test boolean and set to true
        int[] array1 = new int[array_length];
        int[] array2 = new int[array_length];
        boolean test = true;

        // User input values for first array and it is saved in corresponding positions in array1
        System.out.println("Enter "+array_length+ " integers values for the first array: ");
        for(int x=0; x<array_length; x++)
        {
            String value = JOptionPane.showInputDialog("Enter value "+(x+1)+" for array1:");
            int int_value = Integer.parseInt(value);
            array1[x] = int_value;
        }

        // User input values for second array and it is saved in corresponding positions in array2
        System.out.println("Enter "+array_length+ " integers values for the second array: ");
        for(int x=0; x<array_length; x++)
        {
            String value = JOptionPane.showInputDialog("Enter value "+(x+1)+" for array2:");
            int int_value = Integer.parseInt(value);
            array2[x] = int_value;
        }

        // Test if array1 is equal to array2
        for(int x=0; x<array_length; x++)
            if (array1[x] != array2[x])
            {
                test = false;
                break;
            }

        // Print out result
        if (test)
            System.out.println("The two arrays are identical.");
        else
            System.out.println("The two arrays are not identical.");

    }
}
