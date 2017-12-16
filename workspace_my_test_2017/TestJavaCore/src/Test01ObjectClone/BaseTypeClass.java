package Test01ObjectClone;

public class BaseTypeClass implements Cloneable{
	protected String str;
	protected Integer intValue;
	
	public BaseTypeClass(String str, Integer intValue) {
		super();
		this.str = str;
		this.intValue = intValue;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public Integer getIntValue() {
		return intValue;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "str - " + str + ", intValue - " + intValue;
	}
	
	
}
