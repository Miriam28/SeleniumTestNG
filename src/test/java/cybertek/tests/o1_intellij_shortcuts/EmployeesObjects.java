package cybertek.tests.o1_intellij_shortcuts;

public class EmployeesObjects {

    public static void main(String[] args) {

        createPersonOne("Rahwa", "007", 123456, "CEO", 200000);

        createPersonOne("Madina", "607487", 4532671, "SDET", 50000);
        printOne();

        createPersonOne("Madina", "607487", 4532671, "SDET", 50000);

        printOne();

    }

    private static void createPersonOne(String rahwa, String s, int i, String ceo, int i2) {
        Person humanBeing = new Person(rahwa, s, 20, i, ceo, i2);
        humanBeing.getInfo();
    }

    private static void printOne() {
        for (int i = 0; i < 100; i++) {
            System.out.print(1);
        }
    }

}