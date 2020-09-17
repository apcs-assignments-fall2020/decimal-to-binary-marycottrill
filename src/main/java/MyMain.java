import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int secondbinary = Integer.parseInt(binary);
        double counter = 0;
        int x = 0;
        int y = 0;
        while(secondbinary > 0){
            x = secondbinary % 2;
            y += x * Math.pow(2.0, counter);
            secondbinary = secondbinary / 10;
            counter++;
        }
        System.out.println("This is equal to the decimal value " + y);
        return y;

    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format:"); 
        String binary = scan.nextLine(); 
        binaryToDecimal(binary);
        scan.close();
    }
}

