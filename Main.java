

 import java.math.*;
 
 import java.util.*; 
 import java.io.*;

 class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            line = line.replaceAll("\\s+","");
            if(line.equals("0")) break;
            BigInteger num = new BigInteger(line);
            num.mod(BigInteger.valueOf(11));
            if(num.mod(BigInteger.valueOf(11))==BigInteger.valueOf(0)){
                print(line+" is a multiple of 11.\n");
            }
            else {
                print(line+" is not a multiple of 11.\n");
            }
        }
    }

    public static void print(Object item){
        System.out.print(item);
    }

    public static void print(int item){
        System.out.print(item);
    }
}