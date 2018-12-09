import java.util.HashMap;
import java.util.Map;

public class PESELValidate implements ValidateInterface {
    static private int[] tableWithDefinedValue = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

    @Override
    public boolean validation(String documentNumber) {

        if (documentNumber == null) {
            throw new IllegalArgumentException("Wrong number of document");
        }

        int sum = 0;
        char[] tableOfCharFromDocument = documentNumber.toCharArray();
        int[] tableOfIntFromDocument = new int[11];

        if (!documentNumber.matches("\\d{11}") || tableOfCharFromDocument.length != 11) {
            throw new IllegalArgumentException("Wrong number of document");
        }
        for (int i = 0; i < tableWithDefinedValue.length; i++) {
            tableOfIntFromDocument[i] = mapOfAscii(tableOfCharFromDocument[i]);
            sum += tableOfIntFromDocument[i] * tableWithDefinedValue[i];
        }
        return sum % 10 == 0;
    }

    private static int mapOfAscii(char inputChar) {

        Map<Character, Integer> mapOfAsciiCod = new HashMap<>();
        mapOfAsciiCod.put('1', 1);
        mapOfAsciiCod.put('2', 2);
        mapOfAsciiCod.put('3', 3);
        mapOfAsciiCod.put('4', 4);
        mapOfAsciiCod.put('5', 5);
        mapOfAsciiCod.put('6', 6);
        mapOfAsciiCod.put('7', 7);
        mapOfAsciiCod.put('8', 8);
        mapOfAsciiCod.put('9', 9);
        mapOfAsciiCod.put('0', 0);

        return mapOfAsciiCod.get(inputChar);
    }

}
