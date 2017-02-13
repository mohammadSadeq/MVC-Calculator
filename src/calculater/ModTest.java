package calculater;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModTest {

	@Test
	public void test() {
		model calc=new model();
		assertEquals( calc.add(1,2.5),3.5,0);
		assertEquals( calc.add(1,-2.5),-1.5,0);
		assertEquals( calc.add(0,0),0,0);
		assertEquals( calc.add(1000000,2.5),1000002.5,0);
		assertEquals( calc.add(5000000.33,50000000.15),55000000.48,0);
		
		assertEquals( calc.div(-1,2),-0.5,0);
		assertEquals( calc.div(-1,-2),0.5,0);
		assertEquals( calc.div(-1.5,3),-0.5,0);
		assertEquals( calc.div(1,0),Double.POSITIVE_INFINITY,0);
		assertEquals( calc.div(10000000,2),5000000,0);
		assertEquals( calc.div(9,51),0.1764,0.0001);
		assertEquals( calc.div(2,1000000),0.000002,0);
		assertEquals( calc.div(9,3),3,0);
		
		assertEquals( calc.sub(1,2.5),-1.5,0);
		assertEquals( calc.sub(10.6,3.5),7.1,0);
		assertEquals( calc.sub(0,213.5),-213.5,0);
		assertEquals( calc.sub(100000,10000),90000,0);
		
		assertEquals( calc.mult(-1,2),-2,0);
		assertEquals( calc.mult(-1,0),0,0);
		assertEquals( calc.mult(3.9,2),7.8,0);
		assertEquals( calc.mult(1000000,2.5),2500000,0);
		assertEquals( calc.mult(1000000,-250),-250000000,0);
		
		assertEquals( calc.mod(1,2.5),1,0);
		assertEquals( calc.mod(2.5,1),0.5,0);
		assertEquals( calc.mod(-1,2.5),-1,0);
		assertEquals( calc.mod(1,0),Double.NaN,0);
	}

}
