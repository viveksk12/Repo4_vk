package ClassAssignmentPKG;

class A1 {
    public void displayA1() {
        System.out.println("This is class A1");
    }
}

class B1 {
    public void displayB1() {
        System.out.println("This is class B1");
    }

    public static void main(String[] args) {
        A1 objA = new A1();
        objA.displayA1();

        B1 objB = new B1();
        objB.displayB1();
    }
}