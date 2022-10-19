public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String[] array = new String[end - start + 1];
        if (start <= end) {
            for (int i = 0;i < array.length && start <= end;i++) {
                if (start % 15 == 0) {
                    array[i] = "FizzBuzz";
                }else if (start % 3 == 0) {
                    array[i] = "Fizz";
                } else if (start % 5 == 0) {
                    array[i] = "Buzz";
                }else {
                    array[i] = String.valueOf(start);
                }
                start++;
            }
            return array;
        }
        return new String[0];
    }

}
