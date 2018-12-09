import java.util.HashMap;
import java.util.Map;

public class IdValidate implements ValidateInterface {
    static private int[] tableWithDefinedValue = {7, 3, 1, 9, 7, 3, 1, 7, 3};


    public boolean validation(String documentNumber) {

        if (documentNumber == null) {
            throw new IllegalArgumentException("Wrong number of document");
        }

        int sum = 0;
        documentNumber = documentNumber.toLowerCase();
        char[] tableOfCharFromDocument = documentNumber.toCharArray();
        int[] tableOfIntFromDocument = new int[9];

        if (!documentNumber.matches("\\w{3}\\d{6}") || tableOfCharFromDocument.length != 9) {
            throw new IllegalArgumentException("Wrong number of document");
        }


        for (int i = 0; i < 9; i++) {
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
        mapOfAsciiCod.put('a', 10);
        mapOfAsciiCod.put('b', 11);
        mapOfAsciiCod.put('c', 12);
        mapOfAsciiCod.put('d', 13);
        mapOfAsciiCod.put('e', 14);
        mapOfAsciiCod.put('f', 15);
        mapOfAsciiCod.put('g', 16);
        mapOfAsciiCod.put('h', 17);
        mapOfAsciiCod.put('i', 18);
        mapOfAsciiCod.put('j', 19);
        mapOfAsciiCod.put('k', 20);
        mapOfAsciiCod.put('l', 21);
        mapOfAsciiCod.put('m', 22);
        mapOfAsciiCod.put('n', 23);
        mapOfAsciiCod.put('o', 24);
        mapOfAsciiCod.put('p', 25);
        mapOfAsciiCod.put('q', 26);
        mapOfAsciiCod.put('r', 27);
        mapOfAsciiCod.put('s', 28);
        mapOfAsciiCod.put('t', 29);
        mapOfAsciiCod.put('u', 30);
        mapOfAsciiCod.put('v', 31);
        mapOfAsciiCod.put('w', 32);
        mapOfAsciiCod.put('x', 33);
        mapOfAsciiCod.put('y', 34);
        mapOfAsciiCod.put('z', 35);

        return mapOfAsciiCod.get(inputChar);
    }

}
