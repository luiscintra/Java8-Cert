package java8.visibility;

public class Concrete implements Interface {

	@Override
	public Integer doit() {
		return null;
	}

}

class Subclass extends Concrete {
	
}
