/*
    Data Types and therebytes 
    1 int - Integer type - 4 bytes
    2 float - Floating point type - 4 bytes
    3 double - Decimal type  - 8 bytes
    4 char - Character type - 2 bytes
    5 boolean - True/False type - 1 byte
 */

public class Variables02{
    public static void main(String[] args){
        // Declare and initialize variables
        int age = 25; // Integer type
        float height = 5.9f; // Floating point type
        double weight = 70.5; // Decimal type
        char initial = 'A'; // Character type
        boolean isStudent = true; // True/False type

        // Print the variables
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Initial: " + initial);
        System.out.println("Is Student: " + isStudent);
    }
}