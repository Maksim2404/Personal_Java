public class newK {


    public static void printFizzBuzz(int n3) {

        for (int i = 0; i <= n3; i++) {
            if (i % 3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 ==0) {
                System.out.println("Fizz");
            } else if (i % 5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }




    public static void main(String[] args) {
        printFizzBuzz(3);
    }
}

