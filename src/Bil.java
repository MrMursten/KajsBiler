import java.util.ArrayList;

public class Bil
{
	private boolean ledig;
	private Prisgruppe prisGruppe;
	private double distance;
	private String mærke;
	private String model;
	private String brændstof;
	private ArrayList<Udlejning> udlejninger;
	

	public Bil (Prisgruppe prisGruppe, String mærke, String model, String brændstof)
	{
		this.prisGruppe = prisGruppe;
		this.mærke = mærke;
		this.model = model;
		this.brændstof = brændstof;
		ledig = true;
		distance = 0;
		udlejninger = new ArrayList<>();
	}

	public void addUdlejning(Udlejning udlejning)
	{
		udlejninger.add(udlejning);
	}

	public void removeUdlejning(Udlejning udlejning)
	{
		udlejninger.remove(udlejning);
	}

	public ArrayList<Udlejning> getUdlejninger()
	{
		return new ArrayList<Udlejning>(udlejninger);
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getMærke() {
		return mærke;
	}


	public String getModel() {
		return model;
	}

	public String getBrændstof() {
		return brændstof;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
