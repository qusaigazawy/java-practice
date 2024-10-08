class Main {
    public static void test1() {
        try {
            int x = 10/0;
            System.out.println(x);
        } catch (Exception e) {
            throw new Error("You can not divide by zero in test1! " + e);
        }
    }

    public static void test2() {
        test1();
    }

    public static void main(String[] args) {

            test2();
            System.out.println("Contunue in main...");
    }
}

