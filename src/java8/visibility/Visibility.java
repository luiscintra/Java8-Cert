package java8.visibility;

public class Visibility {
	
	void xoops() {
		
	}

}

class Child extends Visibility {
	
	// default visibility is accessible through inheritance here because they live in the same package
	// however, this would not be true, if they lived in different packages (even given inheritance)
	@Override
	void xoops() {
		
	}
	
}
