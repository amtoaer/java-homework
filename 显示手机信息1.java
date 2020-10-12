public class Test {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.display();
    }
}

class MobilePhone {
    private String brand = "Apple";
    private String code = "13800000000";

    public void display() {
        System.out.printf("Brand:%s\nCode:%s", this.brand, this.code);
    }
}