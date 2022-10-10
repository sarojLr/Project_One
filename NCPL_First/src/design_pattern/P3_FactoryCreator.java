package design_pattern;

public class P3_FactoryCreator {

		public static  P3_MyFactory getFactory(String choice) {
			if(choice.equalsIgnoreCase("banks"))
				return new P3_BankFactory();
			if(choice.equalsIgnoreCase("loans"))
				return new P3_LoanFactory();
			return null;
		}
}
