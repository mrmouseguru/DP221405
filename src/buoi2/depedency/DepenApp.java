package buoi2.depedency;

public class DepenApp {

    public static void main(String[] args) {

        B bRemote = new B();

        A aRemote = new A(bRemote);
        //main() message to A
        aRemote.print();
        
    }

}
