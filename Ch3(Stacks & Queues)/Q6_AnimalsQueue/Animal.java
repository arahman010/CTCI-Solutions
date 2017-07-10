// Animal abstract class

abstract class Animal {
	private int order;
	protected String name;

	public Animal(String n){
		this.name = n;
	}

	public void setOrder(int ord){
		this.order = ord;
	}

	public int getOrder(){
		return this.order;
	}

	public boolean isOlderThan(Animal a){
		return this.order < a.getOrder();
	}
	public String toString(){
		return this.name;
	}
}



