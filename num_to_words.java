import java.util.Scanner;

class Num_to_Wrd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 0-9999: ");
        int num = s.nextInt();
        if (num < 0 || num > 9999) {
            System.out.println("Number out of range");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            String result = convertToWords(num);
            System.out.println(num + ": " + result);
        }
    }

    public static String convertToWords(int num) {
        String[] singleDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tensMultiples = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num < 20) {
            return singleDigit[num];
        } else if (num < 100) {
            return tensMultiples[num / 10] + ((num % 10 != 0) ? " " + singleDigit[num % 10] : "");
        } else if (num < 1000) {
            return singleDigit[num / 100] + " hundred" + ((num % 100 != 0) ? " and " + convertToWords(num % 100) : "");
        } else {
            return convertToWords(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " + convertToWords(num % 1000) : "");
        }
    }
}
