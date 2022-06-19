public class N6_Varargs {
    //simple
     public void test(String[] words){
     }

     // varargs
     public void test2(String... words ){
     }

    public static void main(String[] args) {
        N6_Varargs m1 = new N6_Varargs();

        //simple
        m1.test(new String[] {"one","two"});
        // or
        String[] words = new String[] {"three","four"};
        m1.test(words);

        // varargs
        m1.test2("one","two","three");



    }
}
