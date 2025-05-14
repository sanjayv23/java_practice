package may13;

public class Book {
	String title;
	int price;
	public Book(String a,int b) {
		// TODO Auto-generated constructor stub
		title=a;
		price=b;
	}
	public static void main(String[] args) {
		Book obj=new Book("atomic habit",200);
//		obj.price=200;
//		obj.title="Atomic Habit";
		System.out.println(obj.price+" "+obj.title);
		//display();
	}
	public void display() {
		System.out.println("display");
	}
}
