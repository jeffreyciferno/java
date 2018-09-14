package Chapter7;
import java.util.Random;
public class Personal extends ComputingDevice{
public String personalLaptop;
public String personalDesktop;
public String osPassword;


public Personal(String laptop, String desktop, String password, String operating, String proc, String mother, String chip, double ram, int arc, int core, double store, boolean isOn)
{
	super(operating, proc, mother, chip, arc, ram, core, store, isOn);
	
	personalLaptop = laptop;
	personalDesktop = desktop;
	osPassword = password;
}

public String setTypeOfCompter(int x) {
if (x == 1)
{
	 personalLaptop = "laptop";
}
else
{
	return personalDesktop = "desktop";
}}
public String getTypeOfComputer()
{ int x = 0;
		Random random = new Random();
		x = random.nextInt(1);
	if (x == 1)
	{
		return personalLaptop;
	}
	else
	{
		return personalDesktop;
	}
}
public String setPassword(String password)
{
	osPassword = password;
}
public String getPassword()
{
 return osPassword;
}

public String toString()
{
	return super().toString() + ("password: " + getPassword() + getTypeOfComputer()); 
}
}

