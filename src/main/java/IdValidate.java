public class IdValidate implements ValidateInterface {

    @Override
    public boolean validation(String documentNumber) {
        if (documentNumber == null) {
            throw new IllegalArgumentException("Wrong number of document");
        }
        if (!documentNumber.contains("\\w{3}\\d{6}")) {
            throw new IllegalArgumentException("Wrong number of document");

        }

        char[] tableOfCharFromDocument = documentNumber.toCharArray();

        if (tableOfCharFromDocument.length != 9) {
            throw new IllegalArgumentException("Wrong number of document");
        }
        int ascii = 48;
        int sum = 1;
        int[] tableOfIntFromDocument = new int[9];
        for (int i = 0; i < 9; i++) {
            tableOfIntFromDocument[i] = documentNumber.charAt(i)-ascii;
            sum += sum * tableOfIntFromDocument[i];
        }
        if (sum % 10 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        IdValidate idValidate = new IdValidate();
        System.out.println(idValidate.validation(null));
    }
}
