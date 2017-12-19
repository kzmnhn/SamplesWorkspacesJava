package Test01ObjectClone;

public class BaseTypeClassWithout {
	protected String str;

	public BaseTypeClassWithout(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "without.str - " + str;
	}
	
	
}
