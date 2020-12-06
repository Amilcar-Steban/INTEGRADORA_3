package model;
public class MainCoach extends Coach{

	private int numberTeams;
	private int championshipWon;
        
	public MainCoach(String name, String id, double salary, boolean state, int expYears, int numberTeams, int championshipWon) {
		super(name, id, salary, state, expYears);
		this.numberTeams = numberTeams;
		this.championshipWon = championshipWon;
	}
	public MainCoach() {
		super();
		numberTeams = 0;
		championshipWon = 0;
	}
	//Setters and Getters

	public int getNumberTeams() {
		return numberTeams;
	}
	public void setNumberTeams(int numberTeams) {
		this.numberTeams = numberTeams;
	}
	public int getChampionshipWon() {
		return championshipWon;
	}
	public void setChampionshipWon(int championshipWon) {
		this.championshipWon = championshipWon;
	}
	public double mainCoachPrice() {
		double value = 0;
		value = ((super.getSalary()*10) + (championshipWon*50));
		return value;
	}
	public double starLevelMainCoach() {
		double value = 0;
		value = (5 + (championshipWon/10));
		return value;
	}
        @Override
	public String showInfo(){
		String msg = super.showInfo() + "**Numero de equipos: " + numberTeams + "\n" + "**Campeonatos ganados: " + championshipWon + "\n" +"\n***********************************";
                return msg;
	}
}
