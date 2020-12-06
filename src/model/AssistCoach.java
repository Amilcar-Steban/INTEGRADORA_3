package model;
public class AssistCoach extends Coach{
	private final static int OFENSIVO = 1;
	private final static int DEFENSIVO = 2;
	private final static int POSESION = 3;
	private final static int JUGADAS_DE_LABORATORIO = 4;
	private boolean explayer;
	private int num;

	public AssistCoach(String name, String id, double salary, boolean state, int expYears,boolean explayer, int num) {
		super(name, id, salary, state, expYears);
		this.explayer = explayer;
		this.num = num;
	}
	public AssistCoach() {
		super();
		explayer=false;
		num = 0;
	}
	//Setters and Getters
	public boolean isExplayer() {
		return explayer;
	}
	public void setExplayer(boolean explayer) {
		this.explayer = explayer;
	}
	 public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
        
        @Override
	public String showInfo(){
		String msg = super.showInfo();
			if (explayer == false) {
				msg = msg + "**Fue jugador profesional: No" + "\n";
			}
			else{
				msg = msg + "**Fue jugador profesional: Si" + "\n";
			}
			if(num == OFENSIVO) {
				msg = msg + "**Experticia: Ofensivo";
			}
			else if(num == DEFENSIVO) {
				msg = msg + "**Experticia: Defensivo";
			}
			else if(num == POSESION) {
				msg = msg + "**Experticia: Posesion";
			}
			else if(num == JUGADAS_DE_LABORATORIO) {
				msg = msg + "**Experticia: Jugadas de laboratorio";
			}
			msg = "\n***********************************";
				return msg;
	}
	
}
