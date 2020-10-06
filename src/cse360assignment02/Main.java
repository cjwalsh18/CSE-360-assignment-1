package cse360assignment02;

public class Main {

    public static void main(String[] args) {
	int num = 5;
	int num2 = 10;
	int num3 = 3;
	AddingMachine myCalc = new AddingMachine();
	myCalc.add(5);
	myCalc.add(num2);
	myCalc.subtract(num3);

	System.out.println(myCalc.toString());
	System.out.println(myCalc.getTotal());
	myCalc.clear();
	System.out.println(myCalc.toString());
	System.out.println(myCalc.getTotal());
    }
}
