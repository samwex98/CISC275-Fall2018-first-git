public abstract class Animal implements Comparable<Animal>{
	int legs;
	int getLegs() {
		return legs;
	}
	public int compareTo(Animal anima) {
		return Integer.compare(this.getLegs(), anima.getLegs());
	}

	
}
