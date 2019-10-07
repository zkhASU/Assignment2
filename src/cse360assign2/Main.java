package cse360assign2;

public class Main {
	public static void main(String[] args)
		{
			AddingMachine a = new AddingMachine();
			
			a.add(4);
			a.subtract(2);
			a.add(5);
			
			System.out.println(a.getTotal());
			System.out.println(a.toString() + '\n');
			
			
			
		}
	}


