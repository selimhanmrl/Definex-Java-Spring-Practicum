package type;

import java.util.ArrayList;
import java.util.Random;

public class All_Buildings implements Methods {
	private House houses[];
	private Villa villas[];
	private Summerhouse summerhouses[];
	
	
	public All_Buildings() {
		super();
		this.houses = new House[3];
		this.villas = new Villa[3];
		this.summerhouses = new Summerhouse[3];
		
		Random rand = new Random();
        
        
        for(int i=0 ; i<3; i++) {
        	int room = rand.nextInt(5) + 1;
            int saloon = rand.nextInt(2) + 1;
            int size = rand.nextInt(200) + 100;
            int price = rand.nextInt(500)  + 150;
        	
        	houses[i] = new House(room, saloon, size, price);
        	villas[i] = new Villa(room*2, saloon*2, size*2, price*3);
        	summerhouses[i] = new Summerhouse(room, saloon, size, price);
        	
        }
	}
	
	public House[] getHouses() {
		return houses;
	}

	public void setHouses(House[] houses) {
		this.houses = houses;
	}

	public Villa[] getVillas() {
		return villas;
	}

	public void setVillas(Villa[] villas) {
		this.villas = villas;
	}

	public Summerhouse[] getSummerhouses() {
		return summerhouses;
	}

	public void setSummerhouses(Summerhouse[] summerhouses) {
		this.summerhouses = summerhouses;
	}

	@Override
	public int total_price_houses() {
		int sum = 0;
		for(int i=0 ; i<3; i++) {
			sum += this.houses[i].getPrice();
		}
		return sum;
	}
	@Override
	public int total_price_villas() {
		int sum = 0;
		for(int i=0 ; i<3; i++) {
			sum += this.villas[i].getPrice();
		}
		return sum;
	}

	@Override
	public int total_price_summerhouses() {
		int sum = 0;
		for(int i=0 ; i<3; i++) {
			sum += this.summerhouses[i].getPrice();
		}
		return sum;
	}

	@Override
	public int total_price_all() {
		int sum = 0;
		for(int i=0 ; i<3; i++) {
			sum += this.houses[i].getPrice();
			sum += this.villas[i].getPrice();
			sum += this.summerhouses[i].getPrice();

		}
		return sum;
	}

	@Override
	public int average_squaremeter_houses() {
		int avg = 0;
		for(int i=0 ; i<3; i++) {
			avg += this.houses[i].getSize();
		}		
		return avg/3;
	}

	@Override
	public int average_squaremeter_villas() {
		int avg = 0;
		for(int i=0 ; i<3; i++) {
			avg += this.villas[i].getSize();
		}		
		return avg/3;
	}

	@Override
	public int average_squaremeter_summehouses() {
		int avg = 0;
		for(int i=0 ; i<3; i++) {
			avg += this.summerhouses[i].getSize();
		}		
		return avg/3;
	}

	@Override
	public int average_squaremeter_all() {
		int avg = 0;
		for(int i=0 ; i<3; i++) {
			avg += this.houses[i].getSize();
			avg += this.summerhouses[i].getSize();
			avg += this.villas[i].getSize();

		}		
		return avg/9;
	}

	@Override
	public ArrayList<Object> filter(int room, int saloon) {
		ArrayList<Object> all = new ArrayList<Object>();
		
		for(int i=0 ; i<3; i++) {
			if(room == houses[i].getRoom() && saloon == houses[i].getSaloon()) {
				all.add(houses[i]);

			}
			if(room*2 == villas[i].getRoom() && saloon*2 == villas[i].getSaloon()) {
				all.add(villas[i]);
			}
			if(room == summerhouses[i].getRoom() && saloon == summerhouses[i].getSaloon()) {
				all.add(summerhouses[i]);
			}
		}
		if (all.isEmpty()){
			System.out.println("Not Founded Any Building with Given Criteria");
		}
		return all;

	}

}
