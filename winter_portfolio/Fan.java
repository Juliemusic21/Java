/*Julie Sakai
CSD-405
Module 1 Programming Assignment
10/27/24*/

public class Fan {
//Constant values
static final int STOPPED = 0;
static final int SLOW = 1;
static final int MEDIUM = 2;
static final int FAST = 3;

//Fields for default
private int speed = STOPPED;
private boolean on = false;
private int radius = 6;
private String color = "white";

//Setter and getter method
public int getSpeed() {
	return speed;
	}
public void setSpeed(int setSpeed) {
	this.speed = setSpeed;	
}
public boolean isOn() {
	return on;
}
public void setOn(boolean setOn) {
	this.on = setOn;
}
public int getRadius() {
	return radius;
}
public void setRadius(int setRadius) {
	this.radius = setRadius;
}
public String getColor() {
	return color;
}
public void setColor(String setColor) {
	this.color = setColor;
}

//No-argument constructor
public Fan() {
	this.speed = STOPPED;
	this.on = false;
	this.radius = 6;
	this.color = "white";
}
//Constructor with arguments
public Fan(int fanSpeed, boolean fanOn, int fanRadius, String fanColor) {
	this.speed = fanSpeed;
	this.on = fanOn;
	this.radius = fanRadius;
	this.color = fanColor;
}

//toString method
public String toString() {
String state = on ? "on" : "off";
return "Fan{" +
		"speed=" + speed +
		", on=" + on +
		", radius" + radius +
		", color='" + color + '\'' +
		", state='" + state + '\'' +
		'}';
}
//Test code
public static void main(String[] args) {
//First instance using default constructor 
Fan fan1 = new Fan();
System.out.println("Default constructor fan: " + fan1);
//Second instance using argrument constructor 
Fan fan2 = new Fan(Fan.MEDIUM, true, 7, "blue");
System.out.println("Argument constructor fan: " + fan2);

//Testing setter
fan1.setSpeed(Fan.FAST);
fan1.setOn(true);
fan1.setRadius(6);
fan1.setColor("blue");

//Testing getter method toString
System.out.println("Modified default constructor fan: " + fan1);
System.out.println("Fan1 speed: " + fan1.getSpeed());
System.out.println("Fan1 is on: " + fan1.isOn());
System.out.println("Fan1 radius: " + fan1.getRadius());
System.out.println("Fan1 color: " + fan1.getColor());
	}
}
