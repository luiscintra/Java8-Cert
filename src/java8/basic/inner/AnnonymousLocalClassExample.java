package java8.basic.inner;

public class AnnonymousLocalClassExample {
	
	interface Annonymous {
		void doit();
	}
	
	public static void main(String[] args) {
		
		Annonymous none = new Annonymous() {
			@Override
			public void doit() {
				System.out.println("Let's do it.");
			}
		};
		
		none.doit();
		
	}

}
