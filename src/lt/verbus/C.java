package lt.verbus;

public class C {
    public void methodC() throws CustomEx {
        System.out.println("Method C of class C called.");
        throw new CustomEx("ERROR: Exception from class C methodC thrown");
    }
}
