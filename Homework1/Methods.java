package type;

import java.util.ArrayList;

public interface Methods {
	public int total_price_houses();
	public int total_price_villas();
	public int total_price_summerhouses();
	public int total_price_all();

	public int average_squaremeter_houses();
	public int average_squaremeter_villas();
	public int average_squaremeter_summehouses();
	public int average_squaremeter_all();
	
	public ArrayList<Object> filter(int room, int saloon);


}
