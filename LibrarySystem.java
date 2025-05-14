package may14;

public class LibrarySystem {
	public static void main(String[] args) {
		System.out.println(LibraryMember.totalMembers);
		LibraryMember obj1=new LibraryMember("sanjay");
		LibraryMember obj2=new LibraryMember("ruban");
		obj1.showMemberDetails();
		obj2.showMemberDetails();
		System.out.println(LibraryMember.totalMembers);
	}
}
