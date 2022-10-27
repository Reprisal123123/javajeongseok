package Exception;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // ArithmeticException 예외 발생
            System.out.println(4); // 실행되지 않음
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) // true
                System.out.println("true"); // true이므로 출력된다
            System.out.println("ArithmeticException"); // 출력
        } catch (Exception e) { // 모든 예외의 최고조상이므로 모든 예외 처리 가능
            System.out.println("Exception"); // 위에서 catch 블럭 만났으므로 pass
        }

        System.out.println(6);
    }
}
