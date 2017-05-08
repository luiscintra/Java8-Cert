package java8.basic.inner;

import java8.basic.inner.NestedClassesExample.One.Two;
import java8.basic.inner.NestedClassesExample.One.Two.Three;

public class NestedClassesExample {

	class One {
		
		void doit() {
			System.out.println("One did");
		}
		
		class Two {
			
			void doit() {
				System.out.println("Two did");
			}

			
			class Three {
				
				void doit() {
					System.out.println("Three did");
				}

				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		NestedClassesExample example = new NestedClassesExample();
		
		One one = example.new One();
		one.doit();
		
		Two two = one.new Two();
		two.doit();
		
		Three three = two.new Three();
		three.doit();
		
		// ----- another way --------
		
		NestedClassesExample.One anotherOne = example.new One();
		anotherOne.doit();
		
		NestedClassesExample.One.Two anotherTwo = anotherOne.new Two();
		anotherTwo.doit();
		
		NestedClassesExample.One.Two.Three anotherThree = anotherTwo.new Three();
		anotherThree.doit();
		
	}
	
}
