package model;

public class Employee {

	private String name;
	private String id;
	private double salary;
	private boolean state;

	public Employee(String name, String id, double salary, boolean state) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.state = state;
	}
	public Employee() {
		name = new String();
		id = new String();
		salary = 0;
		state = false;
	}
	//Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	public String showInfo() {
		String msg = "\n\t*EMPLEADO\n" +"**Nombre: "+ name + "\n" +"**ID: "+ id + "\n" +"**Salario: " + salary + "\n" ;
                if (state == false) {
                    msg = msg + "**Estado: Inactivo" + "\n" ;
                }
                else {
                    msg = msg + "**Estado: Activo" + "\n" ;
                }
                return msg;
	}
	
}
	
