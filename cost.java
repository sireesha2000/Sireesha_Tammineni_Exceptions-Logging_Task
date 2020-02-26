import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;


public class cost
{
    static
    {
	float area,sqft,cost=0;
	int option;
	Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	Scanner sca = new Scanner(System.in);
      	logger.log(Level.INFO,"1.standard materials\n 2. above standard materials 3.high standard material\n4.high standard and fully automated home");
	option=sca.nextInt();
	area = sca.nextFloat();
	sqft=(float)(area/10.76);
	if(option==1)
	cost=1200*sqft;
	else if(option==2)
	cost=1500*sqft;
	else if(option==3)
	cost=1800*sqft;
	else if(option==4)
	cost=2500*sqft;

	logger.log(Level.INFO,"Cost to constuct house is "+cost);
}
}
	
