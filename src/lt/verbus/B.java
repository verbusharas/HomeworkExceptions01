package lt.verbus;

public class B {
    public void methodB() throws CustomEx {
        System.out.println("Method B of class B called.");
        new C().methodC();
    }
}
