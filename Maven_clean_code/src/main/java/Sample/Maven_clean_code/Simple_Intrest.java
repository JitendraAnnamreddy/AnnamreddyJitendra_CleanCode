package Sample.Maven_clean_code;

public class Simple_Intrest {
	
	double calculate_simple_interest(double principle_amount,double time_period,double rate_of_intrest)
	{
		double simple_interest = principle_amount*time_period*rate_of_intrest;
		
		simple_interest/=100;
		return simple_interest;
	}

}
