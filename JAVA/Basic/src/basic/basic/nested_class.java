package basic;

public class nested_class {
    public int publicA;
    protected int protectedA;
    int defaultA;
    private int privateA;

    public nested_class(){
        privateA=0;
    }

    public void printPrivate(){
        System.out.printf("Private member: %d", privateA);
    }

    class LocalA{
        public LocalA(){
            nested_class B = new nested_class();
            B.publicA=1;
            B.privateA=2;
            B.defaultA=3;
            B.privateA=4;
        }
    }
}
