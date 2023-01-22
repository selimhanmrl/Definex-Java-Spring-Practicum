package type;

public class House {
	private int room;
	private int saloon;
	private int size;
	private int price;
	
	
	
	public House(int room, int saloon, int size, int price) {
		super();
		this.room = room;
		this.saloon = saloon;
		this.size = size;
		this.price = price;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getSaloon() {
		return saloon;
	}
	public void setSaloon(int saloon) {
		this.saloon = saloon;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House " +
				"room=" + room +
				", saloon=" + saloon +
				", size=" + size +
				", price=" + price*1000 + " java tokens";
	}
}
