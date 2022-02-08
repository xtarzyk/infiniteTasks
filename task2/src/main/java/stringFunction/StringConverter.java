package stringFunction;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class StringConverter {

    public String convertString(String givenString) {
        char lastChar = givenString.charAt(givenString.length() - 1);
        if (lastChar == '-' || lastChar == '+' || lastChar == '/' || lastChar == '*') {
            givenString = givenString.substring(0, givenString.length() - 1);
        }

        String[] separatedNums = givenString.split("[,.;]");

        int result = 0;
        double divisionResult = 0;

        if (lastChar == '-') {
            return valueOf(subtractAll(separatedNums, result));
        } else if (lastChar == '+') {
            return valueOf(addAll(separatedNums, result));
        } else if (lastChar == '/') {
            return valueOf(divisionAll(separatedNums, divisionResult));
        } else if (lastChar == '*') {
            return valueOf(multiplyAll(separatedNums, result));
        }
        return Arrays.toString(separatedNums);
    }

    public int subtractAll(String[] separatedNums, int result) {
        for (String num : separatedNums) {
            int number = Integer.parseInt(num);
            result -= number;
            System.out.println(result);
        }
        return result;
    }

    public int addAll(String[] separatedNums, int result) {
        for (String num : separatedNums) {
            int number = Integer.parseInt(num);
            result += number;
            System.out.println(result);
        }
        return result;
    }

    public int multiplyAll(String[] separatedNums, int result) {
        for (String num : separatedNums) {
            int number = Integer.parseInt(num);
            if (result == 0) {
                result = number;
                continue;
            }
            result *= number;
            System.out.println(result);
        }
        return result;
    }

    public double divisionAll(String[] separatedNums, double divisionResult) {
        for (String num : separatedNums) {
            double number = Double.parseDouble(num);
            if (divisionResult == 0) {
                divisionResult = number;
                continue;
            }
            divisionResult /= number;
            System.out.println(divisionResult);
        }
        return divisionResult;
    }
}
