package model;
public class Player extends Employee{

	private final static int PORTERO = 1;
	private final static int DEFENSOR = 2;
	private final static int VOLANTE = 3;
	private final static int DELANTERO = 4;

	private int shirtNumber;
	private int goals;
	private double averageScore;
	private int num;
        
	public Player(String name, String id, double salary, boolean state, int shirtNumber, int goals, double averageScore, int num) {
		super(name, id, salary, state);
		this.shirtNumber = shirtNumber;
		this.goals = goals;
		this.averageScore = averageScore;
		this.num = num;
	}
	public Player() {
		super();
		shirtNumber = 0;
		goals = 0;
		averageScore = 0;
		num = 0;
	}
	//Setters and Getters
	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public double playerPrice() {
		double value = 0;
		if ( num == PORTERO) {
			value = ((super.getSalary()*12) + (averageScore*150));
		}
		else if ( num == DEFENSOR) {
			value = ((super.getSalary()*13) + (averageScore*125) + (goals*100));
		}
		else if ( num == VOLANTE) {
			value = ((super.getSalary()*14) + (averageScore*135) + (goals*125));
		}
		else if ( num == DELANTERO) {
			value = ((super.getSalary()*15) + (averageScore*145) + (goals*150));
		}
		return value;
	}
	public double starLevelPlayer() {
		double value = 0;
		if ( num == PORTERO) {
			value = averageScore*0.9;
		}
		else if ( num == DEFENSOR) {
			value = ((averageScore*0.9) + (goals/100));
		}
		else if ( num == VOLANTE) {
			value = ((averageScore*0.9) + (goals/90));
		}
		else if ( num == DELANTERO) {
			value = ((averageScore*0.9) + (goals/80));
		}
		return value;
	}
        @Override
	public String showInfo(){
            String msg = super.showInfo() + "**Numero de camisa: " + shirtNumber + "\n" +"**Goles: " + goals + "\n" + "**Calificacion: " + averageScore + "\n";
            if ( num == PORTERO) {
                msg = msg + "**Posicion: Portero" + "\n" +
                        "\n***********************************";
            }
            else if(num == DEFENSOR) {
                msg = msg + "**Posicion: Defensor"+ "\n" +
                        "\n***********************************";
            }
            else if(num == VOLANTE) {
                msg = msg + "**Posicion: Volante"+ "\n" +
                        "\n***********************************";
            }
            else if(num == DELANTERO) {
                msg = msg + "**Posicion: Delantero"+ "\n" +
                        "\n***********************************";
            }
            return msg;
        }
}
