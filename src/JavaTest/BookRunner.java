package JavaTest;

public class BookRunner {

    public static void main(String[] args) {
        JavaTest.Book artOfComputerPrograming = new JavaTest.Book();
        JavaTest.Book effectiveJava = new JavaTest.Book();
        JavaTest.Book clearCode = new JavaTest.Book();

        artOfComputerPrograming.setNoOfCopies(20);
        effectiveJava.setNoOfCopies(15);
        clearCode.setNoOfCopies(60);
    }
}
