package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void addTwoNumbers(){
        ArrayList<Integer> firstNumber = new ArrayList<Integer>();
            firstNumber.add(0, 7);
            firstNumber.add(1, 1);
            firstNumber.add(2, 3);

        ArrayList<Integer> secondNumber = new ArrayList<Integer>();
            secondNumber.add(0, 3);
            secondNumber.add(1, 8);

        TwoNumbersSum sumTwoNumbers = new TwoNumbersSum();
        ArrayList<Integer> result = sumTwoNumbers.addTwoNumbers(firstNumber, secondNumber);

        String firstStringNumber = "";
        for (int i = 0; i < firstNumber.size(); i++){
            firstStringNumber = firstNumber.get(i).toString() + firstStringNumber;
        }

        String secondStringNumber = "";
        for (int i = 0; i < secondNumber.size(); i++){
            secondStringNumber = secondNumber.get(i).toString() + secondStringNumber;
        }

        String resultStringNumber = "";
        for (int i = 0; i < result.size(); i++){
            resultStringNumber += result.get(i).toString();
        }

        System.out.println(firstStringNumber + " + " + secondStringNumber + " = " + resultStringNumber);
        Assertions.assertEquals("751", resultStringNumber);
    }

    @ParameterizedTest
//    @CsvSource({"'7,1,3', '3,9'", "'1,3,4,5', '5,4,3'", "'7,6,5', '7,6,5,6'"})
    @CsvSource({
            "713, 39, 752",
            "1345, 543, 1888",
            "765, 7656, 8421",
            "000, 999, 999",
            "8008, 0, 8008",
            "111, 999, 1110",
            "8008, 1, 8009"
            })
    public void addTwoNumbers(String num1, String num2, String expectedStringNumber){
        ArrayList<Integer> firstNumber = new ArrayList<Integer>();
        for (int i = 0; i < num1.length(); i++){
            firstNumber.add(i, Character.getNumericValue(num1.charAt(i)));
        }

        ArrayList<Integer> secondNumber = new ArrayList<Integer>();
        for (int i = 0; i < num2.length(); i++){
            secondNumber.add(i, Character.getNumericValue(num2.charAt(i)));
        }

        TwoNumbersSum sumTwoNumbers = new TwoNumbersSum();
        ArrayList<Integer> result = sumTwoNumbers.addTwoNumbers(firstNumber, secondNumber);

        String firstStringNumber = "";
        for (int i = 0; i < firstNumber.size(); i++){
            firstStringNumber = firstNumber.get(i).toString() + firstStringNumber;
        }

        String secondStringNumber = "";
        for (int i = 0; i < secondNumber.size(); i++){
            secondStringNumber = secondNumber.get(i).toString() + secondStringNumber;
        }

        String resultStringNumber = "";
        for (int i = 0; i < result.size(); i++){
            resultStringNumber += result.get(i).toString();
        }

        System.out.println(firstStringNumber + " + " + secondStringNumber + " = " + resultStringNumber);
        Assertions.assertEquals(expectedStringNumber, resultStringNumber);
    }
}
