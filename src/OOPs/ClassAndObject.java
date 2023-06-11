package OOPs;

public class ClassAndObject {

	public static void main(String[] args) {

//		HumanDetials humans = new HumanDetials();
//		humans.printHuman("krab", 21, "darkWhite", 65465);
//		humans.printHuman("shabe", 65, "White", 77855);
//		humans.printHuman("seel", 47, "dark", 47987);
//		humans.printHuman("zer", 87, "brown", 57894)

		HumanDetials human1 = new HumanDetials("krab", 21, "darkWhite", 65465);
		HumanDetials human2 = new HumanDetials("seel", 47, "dark", 47987);
		HumanDetials human3 = new HumanDetials("shabe", 65, "White", 77855);
		HumanDetials human4 = new HumanDetials("zer", 87, "brown", 57894);
	}
}

class HumanDetials {
	String name;
	int age;
	String color;
	int income;

	//Constructor
	public HumanDetials(String nam, int ag, String colo, int incom) {
		this.name = nam;
		this.age = ag;
		this.color = colo;
		this.income = incom;

		System.out.println("Your Human Details are Listed Below" + "\n" + "Name = " + name + "\n" + "Age = " + age + "\n"
				+ "Color = " + color + "\n" + "Income = " + income + "\n");
	}

//	public void printHuman() {
//		System.out.print("Your Human Details are Listed Below" + "\n" + "Name = " + name + "\n" + "Age = " + age + "\n"
//				+ "Color = " + color + "\n" + "Income = " + income);
//	}

}
