class MainStudent{
	String name;
	String address;
	String university;
	int age;
	int rollno;
	public void goesto()
	{
		System.out.println(name+"goesto"+university+"age"+age+"address"+address+"rollno"+rollno);

	}
	
}
class Student{
	public static void main(String args[]){
		MainStudent std;
		std=new MainStudent();
		std.name="Ansharah";
		std.address="City Gate";
		std.age=19;
		std.university="MUET";
		std.rollno=132;
		std.goesto();
	}
}