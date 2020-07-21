package constructionCostEstimation;

public class Estimator {
public double estimateCost(int choice,double SquareFeet,boolean Automated) {
	switch(choice) {
	case 1:{
		if(!Automated) {
			StandardOption standard=new StandardOption();
			return (standard.estimate(SquareFeet));
		}
		else {
			return -1;
		}
	}
	case 2:
	{
		if(!Automated) {
			AboveStandardOption aboveStandard=new AboveStandardOption();
			return (aboveStandard.estimate(SquareFeet));
		}
		else {
			return -1;
		}
	}
	case 3:{
		if(!Automated) {
			HighStandardOption HighStandardOption =new HighStandardOption();

			return (HighStandardOption.estimate(SquareFeet));
		}
		else {
			AutomatedHighStandardOption AutomatedHighStandardOption =new AutomatedHighStandardOption();

			return (AutomatedHighStandardOption.estimate(SquareFeet));
		}
	}
	
	}
	return -1;
}

}