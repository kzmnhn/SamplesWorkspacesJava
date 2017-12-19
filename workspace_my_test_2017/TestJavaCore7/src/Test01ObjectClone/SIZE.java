package Test01ObjectClone;

public enum SIZE implements Cloneable{
	small {
		@Override
		public int calc(int in) {
			return in;
		}
	}, 
	meduim {
		@Override
		public int calc(int in) {
			return in*2;
		}

		@Override
		public String test() {
			return "OverridedMeduim";
		}
		
	}, 
	large {
		@Override
		public int calc(int in) {
			return in*5;
		}
	};
	
	public abstract int calc(int in);
	public String test(){
		return this.name();
	}
	
	/*
	 * java.lang.Enum.clone() метод гарантирует , что перечислений никогда не клонировали, 
	 * который необходим , чтобы сохранить их "singleton" статус.
	 * 
	 * protected final Object clone() throws CloneNotSupportedException
	 */
//	@Override
//	protected Enum<SIZE> clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	
}
