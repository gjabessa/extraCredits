package extraCredit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Order implements Cloneable { 
	
	String ordernumber ;

	boolean prepaid ;

	double orderprice ;

	Date d1 ;
	
	List <OrderLine> list;
	
	@Override
	protected Object  clone() throws CloneNotSupportedException {
		Order o = (Order) super.clone();
		o.d1 = (Date) d1.clone();
				
		List<OrderLine> list1 = new ArrayList<OrderLine>();
		
		for(OrderLine l: list) {
			list1.add((OrderLine)l.clone());
		}
		o.list = list1;
		return o;
	}
	
	void m1(Order o2) {
		
	}
}

