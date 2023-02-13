import java.util.Scanner;

class Num_to_Wrd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 0-9999: ");
        String num = s.next();
        convertToWords(num);
    }
    public static void convertToWords(String num) {
    int length = num.length();

    // Base cases
    if (length == 0) {
        System.out.println("empty string");
        return;
    }
    if (length > 4) {
        System.out.println("Length more than 4 is not supported");
        return;
    }

    String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    String[] twoDigits = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    String[] tensMultiples = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    String[] tensPower = {"hundred", "thousand"};

    System.out.print(num + ": ");

    if (length == 1) {
        int digit = num.charAt(0) - 48;
        System.out.println(singleDigit[digit]);
        return;
    }

    int x = 0;
    while (x < length) {
        if (length >= 3) {
            int digit = num.charAt(x) - 48;
            if (digit != 0) {
                System.out.print(singleDigit[digit] + " ");
                System.out.print(tensPower[length - 3] + " ");
            }
            length--;
        } else {
            int digit1 = num.charAt(x) - 48;
            if (digit1 == 1) {
                int sum = digit1 + num.charAt(x + 1) - 48;
                System.out.println(twoDigits[sum]);
                return;
            } else if (digit1 == 2 && num.charAt(x + 1) - 48 == 0) {
                System.out.println("twenty");
                return;
            } else {
                if (digit1 > 0) {
                    System.out.print(tensMultiples[digit1] + " ");
                } else {
                    System.out.print("");
                }
                x++;
                int digit2 = num.charAt(x) - 48;
                if (digit2 != 0) {
                    System.out.println(singleDigit[digit2]);
                }
            }
        }
        x++;
    }
}
}
