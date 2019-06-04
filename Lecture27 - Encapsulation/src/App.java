class Plant{
	public static final int ID = 7;
	private String name;

	public String getData() {
		return "some text"+calculateGrowthForecast();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
