package greeting;

public class greeting {
	public void greeting()
	{
		System.out.println("greeeting with 143 font");
	}
public void open()
{
	System.out.println("play music");
}
public void close ()
{
	System.out.println("stop music");
}
public void opencontinues()
{
System.out.println("open greeting and play music continuely 10 times");	
}
public void moretimes()
{
	System.out.println("greeting shutdown");
}
public static void main(String[] args) {
	new greeting().greeting();
	new greeting().open();
	new greeting().close();
	new greeting().opencontinues();
	new greeting().moretimes();

}
}
