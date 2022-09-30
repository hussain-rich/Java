package assignment02;

public class NestedSwitchCase {

	public static void main(String[] args) {
		int tech=2,course=2;
		switch(tech) {
		case 1:
			System.out.println("python");
			break;
		
		case 2:
			switch(course) {
			case 1:
				System.out.println("j2ee");
			    break;
			case 2:
				System.out.println("java");
			}
		}
	}
}
