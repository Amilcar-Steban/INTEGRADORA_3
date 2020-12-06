package model;
import java.util.ArrayList;

public class Team {
	private ArrayList<Player>  players;
	private ArrayList<MainCoach> coaches;
	private ArrayList<AssistCoach> assistCoaches;

	private String name;
        
	public Team(String name) {
		this.name = name;
		players = new ArrayList<>();
		coaches = new ArrayList<>();
		assistCoaches = new ArrayList<>();
	}
	public Team() {
		name = new String();
		players = new ArrayList<>();
		coaches = new ArrayList<>();
		assistCoaches = new ArrayList<>();
	}
	//Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public ArrayList<MainCoach> getCoaches() {
		return coaches;
	}

	public void setCoaches(ArrayList<MainCoach> coaches) {
		this.coaches = coaches;
	}

	public ArrayList<AssistCoach> getAssistCoaches() {
		return assistCoaches;
	}

	public void setAssistCoaches(ArrayList<AssistCoach> assistCoaches) {
		this.assistCoaches = assistCoaches;
	}
	public void addPlayer(Player player) {
		players.add(player);
	}
	public Player searchPlayer(String name) {
		
		for (int i = 0 ; i<players.size() ; i++) {
			if (players.get(i).getName().compareTo(name) == 0 ) {
				return players.get(i);
			}
		}
		return null;
	}
	public int searchPlayerInt(String name) {
		int position = 0;
		for (int i = 0 ; i<players.size() ; i++) {
			if (players.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}
		}
		return position;
	}
	public void deletePlayer(String name) {
		
		Player player = searchPlayer(name);
		players.remove(player);
		
	}
	public void addCoach(MainCoach coach) {
		coaches.add(coach);
	}
	public MainCoach searchCoach(String name) {
		
		for (int i = 0 ; i<coaches.size() ; i++) {
			if (coaches.get(i).getName().compareTo(name) == 0 ) {
				return coaches.get(i);
			}
		}
		return null;
	}
	public int searchCoachInt(String name) {
		int position = 0;
		for (int i = 0 ; i<coaches.size() ; i++) {
			if (coaches.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}
		}
		return position;
	}
	public void deleteCoach(String name) {
		MainCoach coach = searchCoach(name);
		coaches.remove(coach);	
	}
	public void addAssistCoach(AssistCoach coach) {
		assistCoaches.add(coach);
	}
	public AssistCoach searchAssistCoach(String name) {
		
		for (int i = 0 ; i<assistCoaches.size() ; i++) {
			if (assistCoaches.get(i).getName().compareTo(name) == 0 ) {
				return assistCoaches.get(i);
			}
		}
		return null;
	}
	public int searchAssistCoachInt(String name) {
		int position = 0;
		for (int i = 0 ; i<assistCoaches.size() ; i++) {
			if (assistCoaches.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}
		}
		return position;
	}
	public void deleteAssistCoach(String name) {
		
		AssistCoach assistCoach = searchAssistCoach(name);
		assistCoaches.remove(assistCoach);
		
	}
	public void modifyPlayer(Player player, String name) {
		
		int index = searchPlayerInt(name);
		players.set(index, player);
	}
	public void modifyCoach(MainCoach coach, String name) {
		
		int index = searchCoachInt(name);
		coaches.set(index, coach);
	}
	public void modifyAssistCoach(AssistCoach assistCoach, String name) {
		
		int index = searchAssistCoachInt(name);
		assistCoaches.set(index, assistCoach);
	}
	
}