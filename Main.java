

 import java.math.*;
 
 import java.util.*; 
 import java.io.*;

 class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String[] nums = sc.nextLine().split(" ");
            if(nums[0].equals("0") && nums[1].equals("0")){
                break;
            }
            long one = Long.parseLong(nums[0]);
            long two = Long.parseLong(nums[1]);
            long totalCarry = 0;
            long carry = 0;
            while(one!=0 || two!=0){
                long a = one%10;
                long b = two%10;
                long result = a+b+carry;
                if(result > 9) carry = 1;
                if(result <= 9) carry = 0;
                totalCarry += carry;
                two = two/10;
                one = one/10;
            }
            if(totalCarry==0) print("No carry operation.\n");
            if(totalCarry==1) print("1 carry operation.\n");
            if(totalCarry > 1) print(totalCarry+" carry operations.\n");
        }
    }

    public static void print(Object item){
        System.out.print(item);
    }

    public static void print(int item){
        System.out.print(item);
    }
}