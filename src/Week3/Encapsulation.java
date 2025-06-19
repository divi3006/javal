package Week3;

public class Encapsulation {
	
static class StudentMarksheet{
	private String Name;
	private int Mark;
public void setName(String newName) {
	Name= newName;
}
	public String getName() {
		return Name;
	}
		public void setMark(int newMark) {
		Mark= newMark;
		}
		public int getMark() {
			return Mark;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMarksheet s=new StudentMarksheet();
s.setName("Divya");
System.out.println("Student Name:"+s.getName());
s.setMark(80);
System.out.println("Student Mark:"+s.getMark());
	}
}
