public class N5_Methods {
    private String firstName = "youcef"; // global value

    public void sayHello() { // void => no data return
        System.out.println("hello");
    }

    public void saySomething(String text) {
        System.out.println(text);
    }

    public char getFirstCharOfName() {
        return firstName.charAt(0);
    }

    public int addTowNumber(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        N5_Methods nameOfMethod = new N5_Methods();
        nameOfMethod.sayHello();
        nameOfMethod.saySomething("value of text");
        char myFirstCharOfName = nameOfMethod.getFirstCharOfName(); // local value
        System.out.println(myFirstCharOfName);
        System.out.println(nameOfMethod.addTowNumber(4,5));
    }
}
