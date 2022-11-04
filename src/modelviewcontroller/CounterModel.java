package modelviewcontroller;

public class CounterModel {
	
	private int counter;
	
	
		public CounterModel(int initialValue ) {
			this.counter = initialValue;
		}
		
		
		public void increment() {
			this.counter += 1;
			
			CounterView.display(this.counter);
			
		}


		public int getCounter() {
			return counter;
		}


		public void setCounter(int counter) {
			this.counter = counter;
		}

		
}
