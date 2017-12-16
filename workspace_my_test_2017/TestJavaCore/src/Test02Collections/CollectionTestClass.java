package Test02Collections;

public class CollectionTestClass implements Comparable<CollectionTestClass>{
	private String str;
	private Integer intValue;
	
	public CollectionTestClass(String str, Integer intValue) {
		super();
		this.str = str;
		this.intValue = intValue;
	}
	public String getStr() {
		return str;
	}
	public Integer getIntValue() {
		return intValue;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		// нарушается правило симметричности
//		if(!(obj instanceof CollectionTestClass)){
//			return false;
//		}
		if(getClass() != obj.getClass()){
			return false;
		}
		CollectionTestClass typedObj = (CollectionTestClass) obj;
		return str.equals(typedObj.str) 
				&& intValue.equals(typedObj.intValue);
	}
	@Override
	public int hashCode() {
		return str.hashCode() * 31 + intValue.hashCode();
	}
	@Override
	public String toString() {
		return "{str=" + str + ", intValue=" + intValue + "}";
	}
	@Override
	public int compareTo(CollectionTestClass o) {
		CollectionTestClass typedObj = (CollectionTestClass) o;
		if(str.compareTo(typedObj.str) != 0){
			return str.compareTo(typedObj.str);
		}
		return intValue.compareTo(typedObj.intValue);
	}
	
	
}
