import java.util.*;
import java.lang.Math.*;
import java.util.logging.*;
class SiCi
{
	static
	{
		Scanner sca=new Scanner(System.in);
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		
		logger.log(Level.INFO,"Principal Amount: ");
		int p=sca.nextInt();
		logger.log(Level.INFO,"Interest Rate: ");
		double r=sca.nextInt();
		logger.log(Level.INFO,"Time Period(in years): ");
		double t=sca.nextInt();
		Main obj=new Main();
		double si=(p*t*r)/100;
		double ci=p*Math.pow(1.0+r/100.0,t)-p;
		logger.log(Level.INFO,"Simple interest: "+si);
		logger.log(Level.INFO,"Compound interest: "+ci);
			
	}
	
}