package Test01ObjectClone;

public class AggregationClass implements Cloneable{
	protected String str;
	protected BaseTypeClass baseTypeClass;
	protected BaseTypeClassWithout baseTypeClassWithout;
	protected AggrClassWithout aggrClassWithout;
	
	public AggregationClass(String str, BaseTypeClass baseTypeClass, BaseTypeClassWithout baseTypeClassWithout) {
		super();
		this.str = str;
		this.baseTypeClass = baseTypeClass;
		this.baseTypeClassWithout = baseTypeClassWithout;
		this.aggrClassWithout = new AggrClassWithout();
		this.aggrClassWithout.setClassWithout(this.baseTypeClassWithout);
		try {
			this.aggrClassWithout.setBaseTypeClass((BaseTypeClass) this.baseTypeClass.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public BaseTypeClass getBaseTypeClass() {
		return baseTypeClass;
	}
	public void setBaseTypeClass(BaseTypeClass baseTypeClass) {
		this.baseTypeClass = baseTypeClass;
	}

	public BaseTypeClassWithout getBaseTypeClassWithout() {
		return baseTypeClassWithout;
	}

	public void setBaseTypeClassWithout(BaseTypeClassWithout baseTypeClassWithout) {
		this.baseTypeClassWithout = baseTypeClassWithout;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "agr.str - " + str + ", baseTypeClass = " + baseTypeClass.toString() 
				+ ", baseTypeClassWithout = " + baseTypeClassWithout.toString()
				+ ", aggrClassWithout.classWithout = " + aggrClassWithout.getClassWithout().toString()
				+ ", aggrClassWithout.baseTypeClass = " + aggrClassWithout.getBaseTypeClass().toString();
	}
	
	
}
