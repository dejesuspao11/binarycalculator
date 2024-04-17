package calculadora;

	import java.util.Scanner;

public class BinaryCalculator {
    // addition method
    public static String addBinary(String binary1, String binary2) {
        // converts binary to decimal to do the addition 
    	// the number 2 specifies the string is a binary number
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        // adds the decimal numbers
        int sum = num1 + num2;
        // converts the result sum back to binary
        return Integer.toBinaryString(sum);
    }

    // subtraction method
    public static String subtractBinary(String binary1, String binary2) {
        // converts binary to decimal
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        // subtraction 
        int diff = num1 - num2;
        // converts back to binary
        return Integer.toBinaryString(diff);
    }

    // Method to convert a number to binary
    public static String toBinary(float number) {
        // Convert float to binary string
        return Integer.toBinaryString(Float.floatToIntBits(number));
    }

    // Method to get the hexadecimal representation of a number
    public static String toHex(float number) {
        // Convert float to hexadecimal string
        return Float.toHexString(number);
    }

    // Method to get the octal representation of a number
    public static String toOctal(float number) {
        // Convert float to octal string
        return Integer.toOctalString(Float.floatToIntBits(number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu
        System.out.println("1. Add Binary Numbers");
        System.out.println("2. Subtract Binary Numbers");
        System.out.println("3. Convert Number to Binary");
        System.out.println("4. Get Hexadecimal Representation");
        System.out.println("5. Get Octal Representation");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter first binary number: ");
                String binary1 = scanner.nextLine();
                System.out.print("Enter second binary number: ");
                String binary2 = scanner.nextLine();
                System.out.println("Result: " + addBinary(binary1, binary2));
                break;
            case 2:
                System.out.print("Enter first binary number: ");
                String binary3 = scanner.nextLine();
                System.out.print("Enter second binary number: ");
                String binary4 = scanner.nextLine();
                System.out.println("Result: " + subtractBinary(binary3, binary4));
                break;
            case 3:
                System.out.print("Enter a number: ");
                float number = scanner.nextFloat();
                System.out.println("Binary representation: " + toBinary(number));
                break;
            case 4:
                System.out.print("Enter a number: ");
                float number2 = scanner.nextFloat();
                System.out.println("Hexadecimal representation: " + toHex(number2));
                break;
            case 5:
                System.out.print("Enter a number: ");
                float number3 = scanner.nextFloat();
                System.out.println("Octal representation: " + toOctal(number3));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

