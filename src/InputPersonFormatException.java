public class InputPersonFormatException extends Exception {
    public InputPersonFormatException(String message) {
        super("Ошибка введенных данных: " + message);
    }
}
