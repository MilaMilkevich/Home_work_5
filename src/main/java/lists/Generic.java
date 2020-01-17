package main.java.lists;

public class Generic {
    public void printValue() {
        MyList<Integer> element = new MyList<>();
        element.addElement(25);
        element.addElement(87);
        element.addElement(68);
        element.addElement(5);
        element.addElement(-10);

        System.out.println("Largest value is: " + element.getBiggestValue());
        System.out.println("Smallest value is: " + element.getSmallestValue());
    }
}
