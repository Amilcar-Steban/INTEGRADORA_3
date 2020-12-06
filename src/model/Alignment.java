package model;
public class Alignment {

	private final static int MAX_ROWS = 10;
	private final static int MAX_COLS = 7;
	private final static int POSESION = 1;
	private final static int CONTRAATAQUE = 2;
	private final static int ALTA_PRESION = 3;
	private final static int POR_DEFECTO = 4;

	private String date;
	private String formation;
	private String tactic;
	private int num;
	private int[][] formationView;

	public Alignment(String date, String formation, int num) {
		this.date = date;
		this.formation = formation;
        initFormation();
        this.num = num;
	}

	public Alignment() {
		date = new String();
		formation = new String();
		num = 0;
	    initFormation();
	}
	
	//Setters and Getters
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTraining() {
		return formation;
	}
	public void setTraining(String training) {
		this.formation = training;
	}
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public String getTactic() {
		return tactic;
	}
	public void setTactic(String tactic) {
		this.tactic = tactic;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int[][] getFormationView() {
		return formationView;
	}
	public void setFormationView(int[][] formationView) {
		this.formationView = formationView;
	}

	private void initFormation() {
		formationView = new int [10][7];
			for(int i = 0; i < MAX_ROWS; i++) {
				for(int j = 0; j < MAX_COLS; j++) {
					formationView[i][j] = 0;
				}
			}
	}
	public int[] formatFormation() {
		
		String [] rawData = formation.split("-");
 		int [] intData = new int[rawData.length];
 			for(int i = 0; i < intData.length ; i++) {
 				intData [i] = Integer.parseInt(rawData[i]);	
 			}//End for
 			
		return intData;	
	}
	public void createFormation() {
		int formationInt[] = formatFormation();
		int cont = 0;
			for( int i = 0; i < formationInt.length ;  i++) {
				cont += formationInt[i];
			}//End for
			if (cont < 11) {
			for(int i = 0; i < formationInt.length; i++) {
				if (i == 0) {
				configurateLine(8, formationInt[i]);		
				}//End if
				else if (i == 1) {
				configurateLine(5, formationInt[i]);		
				}//End else if
				else if (i == 2) {
				configurateLine(2, formationInt[i]);		
				}
			}
		}
	}
	private void configurateLine(int row, int players) {
		
		if(players == 1) {
			formationView[row][3] = 1;
		}
		else if (players == 2) {
			formationView[row][2] = 1;
			formationView[row][4] = 1;
		}
		else if (players == 3) {
			formationView[row][2] = 1;
			formationView[row][4] = 1;
			formationView[row][3] = 1;
		}
		else if (players == 4) {
			formationView[row][1] = 1;
			formationView[row][2] = 1;
			formationView[row][4] = 1;
			formationView[row][5] = 1;
		}
		else if (players == 5) {
			formationView[row][1] = 1;
			formationView[row][2] = 1;
			formationView[row][3] = 1;
			formationView[row][4] = 1;
			formationView[row][5] = 1;
		}
		else if (players == 6) {
			formationView[row][0] = 1;
			formationView[row][1] = 1;
			formationView[row][2] = 1;
			formationView[row][4] = 1;
			formationView[row][5] = 1;
			formationView[row][6] = 1;
		}
	}
	public String showInfo() {
		
		String msg = "";
		
		for (int i = 0; i<MAX_ROWS; i++) {
			for( int x = 0 ; x<MAX_COLS; x++) {
				msg = msg + formationView[i][x] + " ";
			}
			msg = msg + "\n";
		}
		msg = msg + "\n";
		if (num == POSESION) {
			msg = msg + "TACTICA : POSESION";
		}
		else if(num == CONTRAATAQUE) {
			msg = msg + "TACTICA : CONTRATAQUE";
		}
		else if(num == ALTA_PRESION) {
			msg = msg + "TACTICA : ALTA PRESION";
		}
		else if(num == POR_DEFECTO) {
			msg = msg + "TACTICA : POR DEFECTO";
		}
		return msg;
	}
	
}


