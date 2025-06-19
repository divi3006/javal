package week2;

public class Test {
		void show(int a) { System.out.println("int");
		}

		void show(Integer a) { System.out.println("Integer");
		}

		public static void main(String[] args) { Test t = new Test();
		t.show(null);

		}

		}
