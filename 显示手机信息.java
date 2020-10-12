class Test {
    public static void main(String[] args) {
        Phone phone = new MobilePhone("HUAWEI", "13899999999", "130111111111111111");
        phone.display();
    }
}

class MobilePhone extends Phone {
    private final String brand, ownerId;

    public MobilePhone(String brand, String code, String ownerId) {
        super(code);
        this.brand = brand;
        this.ownerId = ownerId;
    }

    public void display() {
        super.display();
        System.out.printf("Brand=%s\nOwnerId=%s", this.brand, this.ownerId);
    }
}