public class ExceptionExample {
    int methodA() {
        try {
            throw new RuntimeException("Runtime exception from methodA");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After catch block");
        return 0;
    }

    void methodB() {
        int result = methodA();
        if (result == 0) {
            System.out.println("MethodB: result is zero.");
        } else {
            System.out.println("MethodB: result is " + result);
            try {
                throw new RuntimeException("Exception from else clause in methodB");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        return;
    }

    boolean methodC(boolean value) {
        if (!value) {
            throw new RuntimeException("Exception in methodC");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            ExceptionExample instance = new ExceptionExample();
            instance.methodC(false);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            try {
                ExceptionExample instance2 = new ExceptionExample();
                instance2.methodB();
            } catch (RuntimeException e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
}
