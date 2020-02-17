package Sample.Maven_clean_code;
import java.lang.Math;
public class Compound_Interest {
	
	double calculate_compound_interest(double principle_amount,double time_period,double rate_of_intrest,double term)
	{
		double compound_interest = rate_of_intrest/term;
		compound_interest+=1;
		
		compound_interest=Math.pow(compound_interest, term*time_period);
		
		compound_interest*=principle_amount;
		
		
		
		return compound_interest;
	}


}
