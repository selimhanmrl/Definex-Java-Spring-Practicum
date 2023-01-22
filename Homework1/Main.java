package type;

import java.util.ArrayList;
import java.util.Random;

class Main {
	public static void main(String args[]) {

	All_Buildings all = new All_Buildings();
	System.out.println("-------- Total Price ----------");
	System.out.println("Total House Price is = " +  all.total_price_houses()*1000 + " java token");
	System.out.println("Total Summerhouse Price is = " +  all.total_price_summerhouses()*1000+ " java token");
	System.out.println("Total Villa Price is = " +  all.total_price_villas()*1000+ " java token");
	System.out.println("Total Price of all buildings is = " +  all.total_price_all()*1000+ " java token");
	System.out.println("\n-------- Average square metres ----------");
	System.out.println("Average square metres of Houses is = " +  all.average_squaremeter_houses() + " m2");
	System.out.println("Average square metres of Villas is = " +  all.average_squaremeter_villas() + " m2");
	System.out.println("Average square metres of Summerhouses is = " +  all.average_squaremeter_summehouses() + " m2");
	System.out.println("Average square metres of all buildings is = " +  all.average_squaremeter_all() + " m2");

	System.out.println("\n-------- Filter ----------");
	Random rand = new Random();
	int room = rand.nextInt(5) + 1;
	int saloon = rand.nextInt(2) + 1;
	System.out.println("Filtered All Buildings as " + room + " Room " + saloon + " saloon");

	ArrayList<Object> filtered = all.filter(room,saloon);
		for (int i = 0; i < filtered.size(); i++) {
			System.out.println(filtered.get(i).toString());

		}

	}
}
