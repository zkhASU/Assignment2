package cse360assign2;

public class AddingMachine {
	

		private int total;
		private String b = " 0 ";
		
		
		public AddingMachine () {
			total = 0;  // not needed - included for clarity
		}
		
		public int getTotal() {
			return total;
		}
		
		public void add (int value) {
			
			total = total + value; 
			
			b = b +" + " + value;
			
		}

		public void subtract (int value) {
			
			total = total - value;
			
			b = b +" - " + value;
		}
			
		public String toString () {
			return b;
		}

		public void clear() {
			
		}
	}


