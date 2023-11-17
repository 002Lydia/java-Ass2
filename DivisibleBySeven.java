// A Java program that prints all integers divisible by 7 in the range 200 to 800
public class DivisibleBySeven {

    public static void main(String[] args) {
        // Loop from 200 to 800
        for (int i = 200; i <= 800; i++) {
            
            if (i % 7 == 0) {
               
                System.out.println(i);
            }
        }
    }
}
