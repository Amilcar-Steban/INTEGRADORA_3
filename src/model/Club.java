package model;

import java.util.ArrayList;

public class Club {

	private final static int TEAMS = 2;
	private final static int A_ROWS = 7;
	private final static int A_COLS = 6;	
	private final static int B_ROWS = 7;
	private final static int B_COLS = 7;
	private final static int OFFICE_ROWS = 6;
	private final static int OFFICE_COLS = 6;

	private String name;
	private String nit;
	private String date;
	private int cont;

	private Team teams[] ;
	private Player [][] dressingRoomTeamA;
	private Player [][] dreassingRoomTeamB;
	private Object [][] office;

	public Club(String name, String nit, String date) {
		this.name = name;
		this.nit = nit;
		this.date = date;
		teams = new Team [TEAMS]; 
		initTeams();
		initArrays();
	}
	public Club() {
		name = new String();
		nit = new String();
		date = new String();
		initTeams();
		initArrays();
	}
	//Setters and Getters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public Team[] getTeams() {
		return teams;
	}

	public void setTeams(Team[] teams) {
		this.teams = teams;
	}

	public Player[][] getDressingRoomTeamA() {
		return dressingRoomTeamA;
	}

	public void setDressingRoomTeamA(Player[][] dressingRoomTeamA) {
		this.dressingRoomTeamA = dressingRoomTeamA;
	}

	public Player[][] getDreassingRoomTeamB() {
		return dreassingRoomTeamB;
	}

	public void setDreassingRoomTeamB(Player[][] dreassingRoomTeamB) {
		this.dreassingRoomTeamB = dreassingRoomTeamB;
	}

	public Object[][] getOffice() {
		return office;
	}

	public void setOffice(Object[][] office) {
		this.office = office;
	}
	public void initTeams() {
		
		teams = new Team [TEAMS]; 
		teams[0] = new Team("A");
		teams[1] = new Team("B");
		
	}
	private void initArrays() {
		
		dressingRoomTeamA = new Player [A_ROWS][A_COLS];
		dreassingRoomTeamB = new Player [B_ROWS][B_COLS];
		office = new Object [OFFICE_ROWS][OFFICE_COLS];
		
	}
	public String hideEmployeePLayer(Team team, Player player) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].addPlayer(player);
			msg = "Jugador contratado en el equipo A";
		}
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].addPlayer(player);
			msg = "Jugador contratado en el equipo B";
		}
		
		return msg;
	}
	public String hideEmployeeMainCoach(Team team, MainCoach mainCoach) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].addCoach(mainCoach);
			msg = "Entrenador principal contratado en el equipo A";
		}
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].addCoach(mainCoach);
			msg = "Entrenador principal contratado en el equipo B";
		}
		
		return msg;
	}
	public String hideEmployeeAssistCoach(Team team, AssistCoach assistCoach) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].addAssistCoach(assistCoach);
			msg = "Entrenador asistente contratado en el equipo A";
		}
		
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].addAssistCoach(assistCoach);
			msg = "Entrenador assistPlayer contratado en el equipo B";
		}
		
		return msg;
	}
	public String fireEmployeePLayer(Team team, String name) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].deletePlayer(name);
			msg = "Jugador despedido en el equipo A";
		}
		
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].deletePlayer(name);
			msg = "Jugador despedido en el equipo B";
		}
		
		return msg;
	}
	public String fireEmployeeMainCoach(Team team, String name) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].deleteCoach(name);
			msg = "Entrenador principal despedido en el equipo A";
		}
		
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].deleteCoach(name);
			msg = "Entrenador principal despedido en el equipo B";
		}
		
		return msg;
	}
	public String fireEmployeeAssistCoach(Team team, String name) {
		String msg = "Equipo no existente";		
		
		if(team.getName().compareToIgnoreCase(teams[0].getName()) == 0) {
			teams[0].deleteAssistCoach(name);
			msg = "Entrenador asistente despedido en el equipo A";
		}
		
		else if(team.getName().compareToIgnoreCase(teams[1].getName()) == 0) {
			teams[1].deleteAssistCoach(name);
			msg = "Entrenador asistente despedido en el equipo B";
		}
		
		return msg;
	}
	public void accomodateTeamsDessingRoomA() {
		
		ArrayList<Player> playersList = teams[0].getPlayers();
		int indexPlayer = 0;
		for (int i = 0; i < A_ROWS; i++) {	
			for (int x = 0; x < A_COLS; x = x+2) {
				if( indexPlayer < playersList.size()) {
				dressingRoomTeamA [i][x] = playersList.get(i);
				indexPlayer++;
				}
			}
		}
	}
	public void accomodateTeamsDessingRoomB() {
		ArrayList<Player> playersList = teams[1].getPlayers();
		int indexPlayer = 0;
		for (int i = 0; i < B_ROWS; i++) {	
			for (int x = 0; x < B_COLS; x = x+2) {
				if( indexPlayer < playersList.size()) {
				dreassingRoomTeamB [i][x] = playersList.get(i);
				indexPlayer++;
				}
			}
		}
	}
	public void accomodateMainCoachDessingRoom() {
		
		ArrayList<MainCoach> mainCoachA = teams[0].getCoaches();
		ArrayList<MainCoach> mainCoachB = teams[1].getCoaches();
		ArrayList<AssistCoach> assistCoachA = teams[0].getAssistCoaches();
		ArrayList<AssistCoach> assistCoachB = teams[1].getAssistCoaches();

		int indexCoachA = 0;
		int indexCoachB = 0;
		int indexACoachA = 0;
		int indexACoachB = 0;
		
		for (int i = 0; i < OFFICE_ROWS; i++) {	
			
			for (int x = 0; x < OFFICE_COLS; x = x+2) {
				
				if( indexCoachA < mainCoachA.size()) {
					
					office [i][x] = mainCoachA.get(i);
					indexCoachA++;
				}
				
				else if( indexCoachB < mainCoachB.size()) {
					
					office [i][x] = mainCoachB.get(i);
					indexCoachB++;
				}
				
				else if( indexACoachA < assistCoachA.size()) {
					
					office [i][x] = assistCoachA.get(i);
					indexACoachA++;
				}
				else if( indexACoachB < assistCoachB.size()) {
					
					office[i][x] = assistCoachB.get(i);
					indexACoachB++;
				}
			}
		}
	}
}
