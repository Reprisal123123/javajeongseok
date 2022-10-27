package Exception;

public class Ex8_7 {
    public static void main(String[] args) {
        try { // Exception과 그 자손은 반드시 예외처리를 해줘야 한다.
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일은 가능하다.
        throw new RuntimeException();
    }
}
