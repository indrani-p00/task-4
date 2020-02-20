import java.util.*;
class SimpleCompoundInterest
{
	SimpleCompoundInterest(double pricipleamount,double rateofinterest,double time)
	{
		double simpinterest , compinterest;
		simpinterest=(pricipleamount * time * rateofinterest)/100;
		compinterest=pricipleamount * Math.pow(1.0 + rateofinterest / 100.0 , time) - pricipleamount;
	}
}