package model;

public class Coach extends Employee{
	
	//Attributes
	private int expYears;
	public Coach(String name, String id, double salary, boolean state, int expYears) {
		super(name, id, salary, state);
		this.expYears = expYears;
	}
	public Coach() {
		super();
		expYears = 0;
	}
	//Setters and Getters
	public int getExpYears() {
		return expYears;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}
        @Override
	public String showInfo(){
		String msg = super.showInfo() + "**A�os de experiencia: " + expYears + "\n";
				return msg;
	}

}
