package Week3;

import java.util.Arrays;

enum Department{
	ENGINEERING,
	MEDICAL,
	ARTS
}

public class En {

	public static void main(String[] args) {
		Department d=Department.valueOf("ENGINEERING");
		// TODO Auto-generated method stub
System.out.println(d);
System.out.println(Arrays.toString(Department.values()));
	}

}
