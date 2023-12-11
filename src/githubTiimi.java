
public class githubTiimi {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
				
		// Auto-tehtävän kohta 4.
		auto1.merkki = "Volkswagen";
		auto1.malli = "Passat";
		auto1.bensanMaara = 20;
		auto1.NaytaTiedot();
		auto1.Kiihdyta();
		System.out.println();
		
		// Auto-tehtävän kohta 8.
		Auto auto2 = new Auto("Mini", "Countryman", 0);
		auto2.NaytaTiedot();
		auto2.Kiihdyta();
	}

}

class Auto{
	
	
	// tässä on tehty public attribuutit
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	// oletusmuodostin
	public Auto()
	{
		merkki = "";
		malli = "";
		bensanMaara = 0;
	}
	// parametrinen muodostin
	public Auto(String merkki, String malli, int bensanMaara)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.bensanMaara = bensanMaara;
	}
	
	// metodit
	public void Jarruta()
	{
		System.out.println("Auto jarruttaa.");
	}
	
	public void Kiihdyta()
	{
		if (bensanMaara > 0) 
		{
			System.out.println("Auto kiihtyy.");
			bensanMaara --;
		}
		else
		{
			System.out.println("Bensa loppu!");
		}
	}
	
	public void NaytaTiedot()
	{
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Tankissa bensaa: " + bensanMaara);
	}
		
	
}

