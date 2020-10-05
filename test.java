package cse360assignment02;

public class test {
    public static void main(String args[]){
        AddingMachine adder = new AddingMachine();
        adder.add(3);
        adder.subtract(2);
        adder.add(5);
        System.out.println(adder);
        adder.clear();
        System.out.println(adder);
    }
}
