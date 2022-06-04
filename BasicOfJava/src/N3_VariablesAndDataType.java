import N2_Package.NewsAngency;
import N2_Package.Business.Company;

public class N3_VariablesAndDataType {
    private final double PI = 3.14;
    private final String MY_CONSTANT = "CONSTANT";
    private String firstName = "Youcef";
    private int age;
    private long id;
    private char middleInitial = 'Y';
    private byte myByte;
    private NewsAngency agency;
    static private Company company1 = new Company();
    static private Company company2 = new Company();


    public static void main(String[] args) {
        System.out.println(company1);
        System.out.println(company2);
    }
}