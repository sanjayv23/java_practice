package may14;

public class LibraryMember {
	static int totalMembers;
	String name;
	int memberId;
	static {
		System.out.println("Library Management System");
	}
	{
		System.out.println("Creating a new LibraryMember object...");
	}

	public LibraryMember(String name) {
		this.name=name;
		totalMembers++;
		memberId=totalMembers;
		System.out.println("Member registered: "+name+" , ID: "+memberId);
	}
	static int getTotalMembers() {
		return totalMembers;
	}
	void showMemberDetails() {
		System.out.println(this.name);
		System.out.println(this.memberId);
	}
}
