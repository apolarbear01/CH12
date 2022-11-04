package modelviewcontroller;

public class CounterController {
	
	private int startValue;
	private int endValue;
	
	
		public CounterController(int startValue, int endValue ) {
			
			this.setEndValue(endValue);
			this.setStartValue(startValue);
			
		}


		public int getStartValue() {
			return startValue;
		}


		public void setStartValue(int startValue) {
			this.startValue = startValue;
		}


		public int getEndValue() {
			return endValue;
		}


		public void setEndValue(int endValue) {
			this.endValue = endValue;
		}



		public void start() {
			
			CounterModel model = new CounterModel(this.startValue);
			
			
				for (int i = startValue; i < endValue; i++) {
					model.increment();
							
							try {
								Thread.sleep(1000);
							}
							catch(Exception e ) {
								System.out.println("Illegal argument or thread exception");
							}
				
				}
		
		}

}
