package Sample.Maven_clean_code;

public class Cost_Estimation {
	
	int estimate(int choice)
	{
		switch(choice)
		{
		case 1: return companys_standard();
		
		case 2:return above_companys_standard();
		
		case 3:return customer_high_standard();
		
		default: return customer_specific_automation_and_standard();
		}
	}
	
	int companys_standard()
	{
		return 1200;
	}
	
	int above_companys_standard()
	{
		return 1500;
	}
	
	int customer_high_standard()
	{
		return 1800;
	}
	
	int customer_specific_automation_and_standard()
	{
		return 2500;
	}
	
	
	
	

}
