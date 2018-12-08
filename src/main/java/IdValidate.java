public class IdValidate implements ValidateInterface {

    private String document;

    public IdValidate(String documentNumber) {
        this.document = documentNumber;
    }

    public IdValidate() {
    }

    @Override
    public boolean validation(String documentNumber) {

        return false;
    }


    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
