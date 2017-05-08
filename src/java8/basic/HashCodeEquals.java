package java8.basic;

import java.security.InvalidParameterException;

public class HashCodeEquals {
	
	class Element {
		
		String name;
		
		Integer id;
		
		Integer categoryID;
		
		@Override
		public boolean equals(Object obj) {
			
			//Objects.deepEquals(obj, this);
			
			if (obj == null || !(obj instanceof Element)) {
				return false;
			}
			
			Element e = (Element)obj;
			
			if (this.id == null || e.id == null) {
				throw new InvalidParameterException();
			}
			
			return this.id.equals(e.id);
			
		}
		
		@Override
		public int hashCode() {
		
			//return Objects.hash(id, categoryID);
			
			int result = 1;
			int prime = 31;
			
			result = prime * result + (id == null ? 0 : id.hashCode());
			result = prime * result + (categoryID == null ? 0 : categoryID.hashCode());
			
			return result;
			
		}
		
	}

}
