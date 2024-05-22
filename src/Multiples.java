public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int countThree = 0;
        int countFive = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                countThree++;
            }
            if (i % 5 == 0) {
                countFive++;
            }
            i++;
        }
        System.out.println(countThree + " Multiples of 3 and " + countFive + " Multiples of 5 git");
    }
}
