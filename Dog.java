class Dog extends Animal{
	public String name;
	Dog(String stuff, int leg){
		legs = leg;
		name = stuff;
	}
	public String toString() {
		return name;
	}
}
