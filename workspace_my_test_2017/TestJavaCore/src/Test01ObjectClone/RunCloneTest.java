package Test01ObjectClone;

public class RunCloneTest {

	//https://habrahabr.ru/post/246993/
	
	public static void main(String[] args){
		
		// простые классы
		BaseTypeClass baseClass = new BaseTypeClass("123", 456);
		
		try {
			BaseTypeClass baseClassClone = (BaseTypeClass) baseClass.clone();
			System.out.println("baseClassClone - " + baseClassClone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// агрегация
		AggregationClass agrClass = new AggregationClass("456", baseClass, new BaseTypeClassWithout("987"));
		try {
			AggregationClass agrClassClone = (AggregationClass) agrClass.clone();
			System.out.println("agrClassClone - " + agrClassClone);
			agrClassClone.getBaseTypeClassWithout().setStr("888");
			agrClassClone.getBaseTypeClass().setStr("999");
			System.out.println("agrClassClone - " + agrClassClone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		SIZE size = SIZE.meduim;
		System.out.println("SIZE hashCode(): ");
		for(SIZE ss: SIZE.values()){
			System.out.println(ss.hashCode() + ", calc(): " + ss.calc(5) + ", test(): " + ss.test());
		}
		
		
	}
}
