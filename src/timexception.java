import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    SecException(String msg) {
        super(msg);
    }
}

class Time {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours:");
        int h = sc.nextInt();

        System.out.println("Enter minutes:");
        int m = sc.nextInt();

        System.out.println("Enter seconds:");
        int s = sc.nextInt();

        boolean error = false;

        try {
            if (h > 24 || h < 0) {
                error = true;
                throw new HrsException("InvalidHourException:hour is greater than 24");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            if (m > 60 || m < 0) {
                error = true;
                throw new MinException("InvalidMinuteException:minute is greater than 60");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            if (s > 60 || s < 0) {
                error = true;
                throw new SecException("InvalidSecondException:second is greater than 60");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        if (!error) {
            System.out.println("Correct Time-> " + h + ":" + m + ":" + s);
        } else {
            System.out.println("Caught the exception");
        }
    }
}