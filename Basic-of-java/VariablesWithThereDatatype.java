/* A Variable is container that holds data wihich can be changes during program executon 
 * 
 *      Syntax: to declear 
 *          dataType variableName = value; 
*/

public class VariablesWithThereDatatype {
    public static void main(String[] args) {

        // primitive data type
        byte b = 100; //1 byte: -128 to 127
        short s = 30000; //2 bytes
        int i = 1000000; //4 bytes
        long l = 2000000000; //8 byte 
        float f = 10.10f; //4 bytes
        double d = 123.23456; //8 bytes
        char c = 'A' ; //2 bytes (unicode)
        boolean bool = true; //1 bit (true/false)

        // output of valus
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
        
        
        

    }

    
}