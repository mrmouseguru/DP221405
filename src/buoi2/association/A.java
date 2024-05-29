package buoi2.association;

public class A {

    //field
    private B bRemote;//instance=> Heap

    //function, method
    //bRemote: local => Stack
    A(B bRemote){//function constructor
        this.bRemote = bRemote;
    }

    A(){}

    //method
    public void print() {
        bRemote.printName();//A message to B
    }

    public void setBRemote(B bRemote) {
        this.bRemote = bRemote;
    }

}
