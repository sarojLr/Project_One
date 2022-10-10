package design_pattern;

public class P1_PlanFactory {

	public P1_Plan getPlan(String plans) {
		if(plans==null){
			return null;
		}
		if(plans.equalsIgnoreCase("domestic")) {
			return new P1_DomesticPlan();
		}
		if(plans.equalsIgnoreCase("commertial"))
			return new P1_CommertialPlan();
		if(plans.equalsIgnoreCase("enterprise"))
			return new P1_EnterprisePlan();
		
		return null;
	}
}
