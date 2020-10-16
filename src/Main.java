
public class Main {
	public static void main(String[] args){
		ClockDisplay clock = new ClockDisplay(4, 59, 59);
		System.out.println(clock.getTime());
		clock.timeTick();
		System.out.println(clock.getTime());
	}
}
