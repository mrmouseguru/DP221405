package buoi2.depedency;

public class A {

    //field
    private String name;//instance=> Heap

    //function, method
    //bRemote: local => Stack
    A(B bRemote){//function constructor
        bRemote.printName();;
    }

    //method
    public void print() {
        B bRemote = new B();
        bRemote.printName();//A message to B
    }

}
