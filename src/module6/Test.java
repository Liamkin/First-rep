package module6;

/**
 * Created by miroslavlyamkin on 03.02.16.
 */
class Test {
    public static void main(String... args) throws getOutOfProcrastinationException {
        TestingExceptions smp = new TestingExceptions();
        System.out.println("Получилось! Когда-нибудь я буду ездить на:");
        System.out.println(smp.getMyCar());

        throw new getOutOfProcrastinationException();
    }
}