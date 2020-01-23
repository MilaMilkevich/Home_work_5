package main.java.hw5.lists;

public class Generic {
    public void printValue() {
        MyList<Integer> element = new MyList<>();
        element.addElement(25);
        element.addElement(7);
        element.addElement(68);
        element.addElement(155);
        element.addElement(10);

        System.out.println("Largest value is: " + element.getBiggestValue());
        System.out.println("Smallest value is: " + element.getSmallestValue());
    }
}
