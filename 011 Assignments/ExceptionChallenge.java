public class ExceptionChallenge {
    static int methodA() throws CustomException {
        try {
            throw new CustomException("Custom exception from methodA");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            throw e; // Re-throw the exception
        }
    }

    static void methodB() throws CustomException {
        int result = methodA();
        if (result == 0) {
            System.out.println("MethodB: result is zero.");
        } else {
            System.out.println("MethodB: result is " + result);
            try {
                throw new CustomException("Exception from else clause in methodB");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                throw e; // Re-throw the exception
            }
        }
    }

    static boolean methodC(boolean value) {
        if (!value) {
            throw new RuntimeException("Exception in methodC");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            ExceptionChallenge.methodC(false);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            try {
                ExceptionChallenge.methodB();
            } catch (CustomException e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
