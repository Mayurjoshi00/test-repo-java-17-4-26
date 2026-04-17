class flower1{
public flower1(){
    System.out.println("this is flower1 from constructor of class flower1");
}
void plant(){
    System.out.println("plant method from flower1");
}
}
class flower2 extends flower1{
    public flower2(){
        super();
        System.out.println("flower2 class constructor");
    }
    void tree(){
        System.out.println("tree method from flower2");
    }
        }

class flower3 extends flower2{
    public flower3(){
        super();
        System.out.println("flower3 class constructor");
    }
    void root(){
        System.out.println("root method from flower3");
    }
}

public class flower {
    public static void main(String[] args) {

        flower3 f3=new flower3();
        f3.plant();
        f3.tree();
        f3.root();
    }
    }
