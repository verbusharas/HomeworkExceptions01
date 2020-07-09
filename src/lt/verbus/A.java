package lt.verbus;

public class A {
    public A (){
        try {
            new B().methodB();
        } catch (CustomEx customEx) {
            System.out.println(customEx.getErrorMessage());
        }
    }
}
