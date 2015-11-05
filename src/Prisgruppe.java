import java.util.ArrayList;

public class Prisgruppe
{
	private char bilType;
	private double depositum;
	private boolean skalVæreOver25;
	private ArrayList<Bil> biler;
	private double dagspris;
	
	
	public Prisgruppe (char bilType, double depositum, boolean skalVæreOver25, double dagspris, ArrayList<Bil> biler)
	{
		this.dagspris = dagspris;
		this.bilType = bilType;
		this.depositum = depositum;
		this.skalVæreOver25 = skalVæreOver25;
		this.biler = new ArrayList<Bil>(biler);
	}

	public Prisgruppe (char bilType, double depositum, boolean skalVæreOver25, double dagspris)
	{
		this.dagspris = dagspris;
		this.bilType = bilType;
		this.depositum = depositum;
		this.skalVæreOver25 = skalVæreOver25;
		biler = new ArrayList<Bil>();
	}
	
	public void addBil(Bil bil)
	{
		biler.add(bil);
	}

	public void removeBil(Bil bil)
	{
		biler.remove(bil);
	}

	private ArrayList<Bil> getBiler()
	{
		return new ArrayList<Bil>(biler);
	}

	public char getBilType() {
		return bilType;
	}

	public double getDepositum() {
		return depositum;
	}

	public void setDepositum(double depositum) {
		this.depositum = depositum;
	}

	public boolean getSkalVæreOver25() {
		return skalVæreOver25;
	}

	public void setSkalVæreOver25(boolean skalVæreOver25) {
		this.skalVæreOver25 = skalVæreOver25;
	}

	public Bil opretBil(String mærke, String model, String brændstof)
	{
		Bil newCar = new Bil(this, mærke, model, brændstof);
		biler.add(newCar);
		return newCar;
	}
}
