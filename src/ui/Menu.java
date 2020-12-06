package ui;
import model.*;
import java.util.Scanner;
public class Menu {

	//Main menu
	private final int CREATE_CLUB = 1;
	private final int ADD_PLAYER = 2;
	private final int ADD_MAINCOACH = 3;
	private final int ADD_ASSISTCOACH = 4;
	private final int SEARCH_PLAYER = 5;
	private final int SEARCH_MAINCOACH = 6;
	private final int SEARCH_ASSISTCOACH = 7;
	private final int DELETE_PLAYER = 8;
	private final int DELETE_MAINCOACH = 9;
	private final int DELETE_ASSISTCOACH = 10;
	private final int MODIFY_EMPLOYEE = 11;
	private final int ADD_EMPLOYEE_OFFICE = 12;
	private final int ADD_FORMATION = 13;
	private final int HIRE_EMPLOYEE = 14;
	private final int FIRE_EMPLOYEE = 15;
	private final int PLAYER_PRICE = 16;
	private final int STAR_PLAYER = 17;
	private final int COACH_PRICE = 18;
	private final int COACH_STAR = 19;
	private final int SHOW_PLAYER = 20;
	private final int SHOW_MAINCOACH = 21;
	private final int SHOW_ASSISTCOACH = 22;
	private final int SHOW_FORMATION = 23;
	private final int EXIT = 24;
	private Scanner sc = new Scanner(System.in);
	private Player player;
	private MainCoach mainCoach;
	private AssistCoach assistCoach;
	private Alignment alignment;
	private Team team;
	private Club club;
	public Menu(){
		player = new Player();
		mainCoach = new MainCoach();
		assistCoach = new AssistCoach();
		alignment = new Alignment();
		team = new Team();
		club = new Club();
		}
	public void showMenu(){
		System.out.println("\n");
		System.out.println("\tMENU");
		System.out.println("[1] Crear un club.");
		System.out.println("[2] Añadir un jugador.");
		System.out.println("[3] Añadir un entrenador principal.");
		System.out.println("[4] Añadir un entrenador asistente.");
		System.out.println("[5] Buscar un jugador.");
		System.out.println("[6] Buscar un entrenador principal.");
		System.out.println("[7] Buscar un entrenador asistente.");
		System.out.println("[8] Eliminar un jugador.");
		System.out.println("[9] Eliminar un entrendor principal.");
		System.out.println("[10] Eliminar un entrenador asistente.");	
		System.out.println("[11] Modificar un empleado.");	
		System.out.println("[12] Añadir empleados a oficinas y camerinos.");
		System.out.println("[13] Añadir una formacion.");
		System.out.println("[14] Contratar un empleado.");
		System.out.println("[15] Despedir un empleado.");
		System.out.println("[16] Mostrar el precio del jugador en el mercado.");
		System.out.println("[17] Mostrar el nivel de estrella del jugador en el mercado.");
		System.out.println("[18] Mostrar el precio del entrenador principal en el mercado.");
		System.out.println("[19] Mostrar el nivel de estrella del entrenador principal en el mercado.");
		System.out.println("[20] Mostrar al jugador creado.");
		System.out.println("[21] Mostrar el entrenador principal creado.");
		System.out.println("[22] Mostrar el entrenador asistente creado.");
		System.out.println("[23] Mostrar la alineación.");
		System.out.println("[24] salir");
		System.out.println("\nIngrese el numero relacionado a la opcion a seguir");

	}
	public int readOption(){
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	public void addPlayer() {
		
			System.out.println("Ingrese el nombre del jugador");
			String name = sc.nextLine();
			System.out.println("Ingrese el ID del jugador");
			String id = sc.nextLine();
			System.out.println("Ingrese el salario del jugador");
			double salary = sc.nextDouble();sc.nextLine();
			System.out.println("[1] Si el estado del jugador es activo" + "\n" +"[2] Si el estado del jugador es inactivo");
			int state = sc.nextInt();sc.nextLine();
			boolean stateX = false;
				if(state == 1) {
					stateX = true;
				}
				else if(state == 2){
					stateX = false;
				}
				
			System.out.println("Ingrese el numero de camiseta del jugador");
			int shirtNumber = sc.nextInt();sc.nextLine();
			System.out.println("Ingrese el numero de goles del jugador");
			int goals = sc.nextInt();sc.nextLine();
			System.out.println("Ingrese el promedio del jugador");
			double averageScore = sc.nextDouble();sc.nextLine();
			System.out.println("Presione:");
			System.out.println("[1] Si el jugador es portero" + "\n" +"[2] Si el jugador es defensor" + "\n" +"[3] Si el jugador es volante" + "\n" +"[4] Si el jugador es delantero");
			int num = sc.nextInt();sc.nextLine();
			player = new Player(name,id,salary,stateX,shirtNumber,goals,averageScore,num);
			System.out.println(player.getName());
			team.addPlayer(player);
			System.out.println("A que equipo desea añadir este jugador?"+"\n[1] Equipo A"+"\n[2] Equipo B");
			int num2 = sc.nextInt();
				if ( num2 == 1) {
					club.getTeams()[0].addPlayer(player);
				}
				else if ( num2 == 2) {
					club.getTeams()[1].addPlayer(player);
				}
				
			System.out.println("Jugador a�adido exitosamente");
	}
	public void addMainCoach() {
		
		System.out.println("Ingrese el nombre del entrenador principal");
		String name = sc.nextLine();
		System.out.println("Ingrese el ID del entrenador principal");
		String id = sc.nextLine();
		System.out.println("Ingrese el salario del entrenador principal");
		double salary = sc.nextDouble();sc.nextLine();
		System.out.println("[1] Si el estado del entrenador principal es activo" + "\n" +"[2] Si el estado del entrenador principal es inactivo");
		int state = sc.nextInt();sc.nextLine();
		boolean stateX = false;
		
			if(state == 1) {
				stateX = true;
			}
			else if(state == 2){
				stateX = false;
			}
			
		System.out.println("Ingrese los a�os de experiencia del entrenador");
		int expYears = sc.nextInt();sc.nextLine();
		System.out.println("Ingrese la cantidad de equipos que el entrenador principal ha dirigido");
		int numberTeams = sc.nextInt();sc.nextLine();
		System.out.println("Ingrese la cantidad de torneos que ha ganado el entrenador principal");
		int championshipWon = sc.nextInt();sc.nextLine();
		mainCoach = new MainCoach(name, id, salary, stateX, expYears, numberTeams, championshipWon);
		team.addCoach(mainCoach);
		System.out.println("A que equipo desea a�adir este entrenador principal?"+"\n[1] Equipo A"+"\n[2] Equipo B");
		int num2 = sc.nextInt();
		
			if ( num2 == 1) {
				club.getTeams()[0].addCoach(mainCoach);
			}//End if
			else if ( num2 == 2) {
				club.getTeams()[1].addCoach(mainCoach);
			}//End else if
			
		System.out.println("Jugador a�adido exitosamente");
	}
	public void addAssistCoach() {
		
		System.out.println("Ingrese el nombre del entrenador asistente");
		String name = sc.nextLine();
		System.out.println("Ingrese el ID del entrenador asistente");
		String id = sc.nextLine();
		System.out.println("Ingrese el salario del entrenador asistente");
		double salary = sc.nextDouble();sc.nextLine();
		System.out.println("[1] Si el estado del entrenador asistente es activo" + "\n" +"[2] Si el estado del entrenador asistente es inactivo");
		int state = sc.nextInt();sc.nextLine();
		boolean stateX = false;
		
			if(state == 1) {
				stateX = true;
			}
			else if(state == 2){
				stateX = false;
			}
			
		System.out.println("Ingrese los a�os de experiencia del entrenador");
		int expYears = sc.nextInt();sc.nextLine();
		System.out.println("[1] Si el entrenador asistente es exjugador" + "\n" +"[2] Si el entrenador asistente no es exjugador");
		int stateAssist = sc.nextInt();sc.nextLine();
		boolean explayer = false;
		
			if(stateAssist == 1) {
				explayer = true;
			}//End if
			else if(stateAssist == 2){
				explayer = false;
			}
		System.out.println("Experticia del entrenador asistente: " + "\n" +"Presione: " + "\n" +"[1] Ofensivo" + "\n" +"[2] Defensivo" + "\n" +"[3] Posesion" + "\n" +"[4] Jugadas de laboratorio");
		int num = sc.nextInt();sc.nextLine();
		assistCoach = new AssistCoach(name, id, salary, stateX, expYears, explayer, num);
		team.addAssistCoach(assistCoach);
		System.out.println("A que equipo desea a�adir este entrenador asistente?");
		System.out.println("[1] Equipo A");
		System.out.println("[2] Equipo B");
		int num2 = sc.nextInt();
		
			if ( num2 == 1) {
				club.getTeams()[0].addAssistCoach(assistCoach);
			}
			else if ( num2 == 2) {
				club.getTeams()[1].addAssistCoach(assistCoach);
			}
			
		System.out.println("Jugador a�adido exitosamente");
	}
	public void searchPlayer() {
		
		System.out.println("\nIngrese el nombre del jugador que desea buscar");
		String name = sc.nextLine();
		team.searchPlayer(name);
		
	}
	public void searchMainCoach() {
		
		System.out.println("\nIngrese el nombre del entrenador principal que desea buscar");
		String name = sc.nextLine();
		team.searchCoach(name);
		
	}
	public void searchAssistCoach() {
		
		System.out.println("\nIngrese el nombre del entrenador asistente que desea buscar");
		String name = sc.nextLine();
		team.searchAssistCoach(name);
				
	}
	public void deletePlayer() {
		
		System.out.println("\nIngrese el nombre del jugador que desea eliminar");
		String name = sc.nextLine();
		team.deletePlayer(name);
		
	}
	public void deleteMainCoach() {
		
		System.out.println("\nIngrese el nombre del entrenador principal que desea eliminar");
		String name = sc.nextLine();
		team.deleteCoach(name);
		
	}
	public void deleteAssistCoach() {
		
		System.out.println("\nIngrese el nombre del entrenador asistente que desea eliminar");
		String name = sc.nextLine();
		team.deleteAssistCoach(name);
		
	}
	public void modifyEmployee() {
		
		System.out.println("\nSeleccione el equipo en el que se encuentra el empleado a modificar");
		System.out.println("[1] Equipo A" + "\n" +"[2] Equipo B" + "\n");
		int teamOption = sc.nextInt();sc.nextLine();
		
		System.out.println("\nSeleccione el tipo de empleado que desea modificar");
		System.out.println("[1] Jugador" + "\n" +"[2] Entrenador principal" + "\n" +"[3] Entrenador asistente" + "\n");
		int employeeOption = sc.nextInt();sc.nextLine();
		
			if (employeeOption == 1) {
				
				System.out.println("Ingrese el nombre del jugador a modificar");
				String name = sc.nextLine();
				int position = club.getTeams()[teamOption].searchPlayerInt(name);
				System.out.println("Ingrese de la siguiente lista el atributo del jugador que desea modificar");
				System.out.println("[1] Nombre" + "\n"+"[2] ID" + "\n" +"[3] Salario" + "\n" +"[4] Estado" + "\n" +"[5] Numero de camiseta" + "\n" +"[6] Goles marcados" + "\n" +"[7] Posicion");
				int modifyOption = sc.nextInt();sc.nextLine();
				
					if (modifyOption == 1) {
						
						System.out.println("Ingrese el nuevo nombre");
						String nName = sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setName(nName);

					}
					else if (modifyOption == 2) {
						
						System.out.println("Ingrese el nuevo ID");
						String id = sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setId(id);
						
					}
					else if (modifyOption == 3) {
						
						System.out.println("Ingrese el nuevo salario");
						double salary = sc.nextDouble();sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setSalary(salary);
						
					}
					else if(modifyOption == 4) {
						
						System.out.println("Ingrese el nuevo estado");
						boolean state = sc.nextBoolean();sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setState(state);
						
					}
					else if(modifyOption == 5) {
						
						System.out.println("Ingrese el nuevo numero de camisa");
						int shirtNumber = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setShirtNumber(shirtNumber);
						
					}
					else if(modifyOption == 6) {
						
						System.out.println("Ingrese los goles marcados");
						int goals = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setGoals(goals);
						
					}
					else if(modifyOption == 7) {
						
						System.out.println("Ingrese la nueva posicion");
						System.out.println("[1] Si el jugador es portero" + "\n" +
								   "[2] Si el jugador es defensor" + "\n" +
								   "[3] Si el jugador es volante" + "\n" +
								   "[4] Si el jugador es delantero");
						int num = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getPlayers().get(position).setNum(num);
					}
			}
			if (employeeOption == 2) {
				
				System.out.println("Ingrese el nombre del entrenador principal a modificar");
				String name = sc.nextLine();
				int position = club.getTeams()[teamOption].searchCoachInt(name);
				System.out.println("Ingrese de la siguiente lista el atributo del entrenador principal que desea modificar");
				System.out.println("[1] Nombre" + "\n"+"[2] ID" + "\n" +"[3] Salario" + "\n" +"[4] Estado" + "\n" +"[5] A�os de experiencia del entrenador" + "\n" +"[6] Numero de equipos que ha dirigido" + "\n" +"[7] Torneos ganados");
				int modifyOption = sc.nextInt();sc.nextLine();
				
					if (modifyOption == 1) {
						
						System.out.println("Ingrese el nuevo nombre");
						String nName = sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setName(nName);

					}
					else if (modifyOption == 2) {
						
						System.out.println("Ingrese el nuevo ID");
						String id = sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setId(id);
						
					}
					else if (modifyOption == 3) {
						
						System.out.println("Ingrese el nuevo salario");
						double salary = sc.nextDouble();sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setSalary(salary);
						
					}
					else if(modifyOption == 4) {
						
						System.out.println("Ingrese el nuevo estado");
						boolean state = sc.nextBoolean();sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setState(state);
						
					}
					else if( modifyOption == 5) {
						
						System.out.println("Ingrese los nuevos a�os de experiencia del entrenador");
						int expYears = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setExpYears(expYears);
						
					}
					else if(modifyOption == 6) {
						
						System.out.println("Ingrese el nuevo numero de equipos dirigidos");
						int numberTeams = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setNumberTeams(numberTeams);
						
					}
					else if(modifyOption == 7) {
						
						System.out.println("Ingrese el nuevo numero de torneos ganados");
						int championshipWon = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getCoaches().get(position).setChampionshipWon(championshipWon);
						
					}
			}
			if(employeeOption == 3) {
				
				System.out.println("Ingrese el nombre del entrenador asistente a modificar");
				String name = sc.nextLine();
				int position = club.getTeams()[teamOption].searchAssistCoachInt(name);
				System.out.println("Ingrese de la siguiente lista el atributo del entrenador asistente que desea modificar");
				System.out.println("[1] Nombre" + "\n"+"[2] ID" + "\n" +"[3] Salario" + "\n" +"[4] Estado" + "\n" +"[5] A�os de experiencia" + "\n" +"[6] Exjugador de futbol" + "\n" +"[7] Experticia");
				int modifyOption = sc.nextInt();sc.nextLine();
				
					if (modifyOption == 1) {
					
						System.out.println("Ingrese el nuevo nombre");
						String nName = sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setName(nName);

					}//End if
					else if (modifyOption == 2) {
					
						System.out.println("Ingrese el nuevo ID");
						String id = sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setId(id);
					
					}//End else if
					else if (modifyOption == 3) {
					
						System.out.println("Ingrese el nuevo salario");
						double salary = sc.nextDouble();sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setSalary(salary);
					
					}//End else if
					else if(modifyOption == 4) {
					
						System.out.println("Ingrese el nuevo estado");
						boolean state = sc.nextBoolean();sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setState(state);
					
					}//End else if
					else if( modifyOption == 5) {
						
						System.out.println("Ingrese los nuevos a�os de experiencia del entrenador");
						int expYears = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setExpYears(expYears);
					
					}//End else if
					else if(modifyOption == 6) {
						
						System.out.println("Presione:");
						System.out.println("[1] Si el entrenador asistente es exjugador" + "\n" +"[2] Si el entrenador asistente no es exjugador");
						boolean explayer = sc.nextBoolean();sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setExplayer(explayer);
						
					}
					else if(modifyOption == 7) {
						
						System.out.println("Nueva experticia del entrenador asistente: " + "\n" +"Presione: " + "\n" +"[1] Ofensivo" + "\n" +"[2] Defensivo" + "\n" +"[3] Posesion" + "\n" +"[4] Jugadas de laboratorio");
						int num = sc.nextInt();sc.nextLine();
						club.getTeams()[teamOption].getAssistCoaches().get(position).setNum(num);

					}
			}	
        }
	public void addToDressingRoomsAndOffice() {
		
		System.out.println("\nAgregando jugadores a camerinos...");
		club.accomodateTeamsDessingRoomA();
		club.accomodateTeamsDessingRoomB();
		System.out.println("Jugadores agregados exitosamente");
		System.out.println("Agregando entrenadores a oficinas...");
		club.accomodateMainCoachDessingRoom();
		System.out.println("Entrenadores agregados exitosamente");
		
	}
	public void hideEmployee() {
		
		System.out.println("\nSeleccione el equipo en el que se encuentra el empleado a contratar");
		System.out.println("[1] Equipo A" + "\n" +
						   "[2] Equipo B" + "\n");
		int teamOption = sc.nextInt();sc.nextLine();
		
		System.out.println("\nSeleccione el tipo de empleado que desea contratar");
		System.out.println("[1] Jugador" + "\n" +
					 	   "[2] Entrenador principal" + "\n" +
						   "[3] Entrenador asistente" + "\n");
		int employeeOption = sc.nextInt();sc.nextLine();
		
			if (employeeOption == 1) {
			
				System.out.println("Ingrese el nombre del jugador a contratar");
				String name = sc.nextLine();
				club.getTeams()[teamOption].searchPlayerInt(name);
				club.getTeams()[teamOption].addPlayer(player);
				System.out.println("Jugador contratado exitosamente");
				
			}
			else if(employeeOption == 2) {
				
				System.out.println("Ingrese el nombre del entrenador principal a contratar");
				String name = sc.nextLine();
				club.getTeams()[teamOption].searchCoachInt(name);
				club.getTeams()[teamOption].addCoach(mainCoach);
				System.out.println("Entrenador principal contratado exitosamente");
				
			}
			else if(employeeOption == 3) {
				
				System.out.println("Ingrese el nombre del entrenador asistente a contratar");
				String name = sc.nextLine();
				club.getTeams()[teamOption].searchAssistCoachInt(name);
				club.getTeams()[teamOption].addAssistCoach(assistCoach);
				System.out.println("Entrenador asistente contratado exitosamente");
                        }
	}
	public void addClub() {
		
		System.out.println("\nIngrese el nombre del club");
		String name = sc.nextLine();
		System.out.println("Ingrese el nit del club");
		String nit = sc.nextLine();
		System.out.println("Ingrese la fecha de fundacion del club");
		String date = sc.nextLine();
		System.out.println("Club agregado exitosamente");
		club = new Club(name, nit, date);
		
	}
	public void addAlignment() {
		System.out.println("\nIngrese la fecha de creacion de la alineacion");
		String date = sc.nextLine();
		System.out.println("Ingrese la alineacion de la formacion siguiendo este ejemplo : 4-4-2." + "\nCada numero debe estar separado por un guion");
		String formation = sc.nextLine();
		System.out.println("Tacticas:" + "\n" +
						   "[1] Si la tactica es POSESION" + "\n" +
						   "[2] Si la tactica es CONTRATAQUE" + "\n" + 
						   "[3] Si la tactica es ALTA PRESION" + "\n" +
						   "[4] Si la tactica es POR DEFECTO");
		int num = sc.nextInt();sc.nextLine();
		alignment = new Alignment(date, formation, num);
		alignment.formatFormation();
		alignment.createFormation();
	}
	public void viewFormation() {
		System.out.println("***********Formacion************" + "\n" + alignment.showInfo());
	}
	public void pricePlayer() {
		System.out.println("\nPrecio del jugador en el mercado: " + player.playerPrice());
	}
	public void starsPlayer() {
		System.out.println("\nNivel de estrella del jugador: " + player.starLevelPlayer());
	}
	public void priceMainCoach() {
		System.out.println("\nPrecio del entrenador principal en el mercado: " + mainCoach.mainCoachPrice());
	}
	public void starMainCoach() {
		System.out.println("\nNivel de estrella del entrenador principal en el mercado: " + mainCoach.starLevelMainCoach());
	}
	public void showInfoAssistCoach() {
		System.out.println(assistCoach.showInfo());
	}
	public void showInfoMainCoach() {
		System.out.println(mainCoach.showInfo());
	}
	public void showInfoPlayer() {
		System.out.println(player.showInfo());
	}
	public void doOperation(int option){
		switch(option){
		
		case CREATE_CLUB:
			
			addClub();
			break;
			
		case ADD_PLAYER:
			
			addPlayer();
			break;
			
		case ADD_MAINCOACH:
			
			addMainCoach();
			break;
			
		case ADD_ASSISTCOACH:
			
			addAssistCoach();
			break;
		
		case SEARCH_PLAYER:
			
			searchPlayer();
			break;
			
		case SEARCH_MAINCOACH:
			
			searchMainCoach();
			break;
			
		case SEARCH_ASSISTCOACH:
			
			searchAssistCoach();
			break;
			
		case DELETE_PLAYER:
			
			deletePlayer();
			 break;
			 
		case DELETE_MAINCOACH:
			
			deleteMainCoach();
			break;
			
		case DELETE_ASSISTCOACH:
			
			deleteAssistCoach();
			break;
			
		case MODIFY_EMPLOYEE:
			
			modifyEmployee();
			break;
			
		case ADD_EMPLOYEE_OFFICE:
			
			addToDressingRoomsAndOffice();
			break;
		
		case HIRE_EMPLOYEE:
			
			hideEmployee();
			break;
			
		case ADD_FORMATION:
			
			addAlignment();
			break;
		
		case SHOW_FORMATION:
			
			viewFormation();
			break;
			
		case SHOW_PLAYER:
			
			showInfoPlayer();
			break;
			
		case SHOW_MAINCOACH:
			
			showInfoMainCoach();
			break;
			
		case SHOW_ASSISTCOACH:
			
			showInfoAssistCoach();
			break;
			
		case PLAYER_PRICE:
			
			pricePlayer();
			break;
			
		case STAR_PLAYER:
			
			starsPlayer();
			break;
		
		case COACH_PRICE:
			
			priceMainCoach();
			break;
		
		case COACH_STAR:
			
			starMainCoach();
			break;
		
		case EXIT:
			
			break;
			
		}
	}
	public void startProgram(){
		int opt = 0;
		do{
			showMenu();
			opt = readOption();
			doOperation(opt);
		}while(opt != 24);
	}
}