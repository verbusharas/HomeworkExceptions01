package lt.verbus;

public class CustomEx extends Exception {
    private String errorMessage;

    public CustomEx (String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
