package calculater;

public class model {

public int add(int x,int y){
	return x+y;
}
public double add(double x,double y){
	return x+y;
}
public double mult(double x,double y){
	return x*y;
}public double div(double x,double y){
	double z;
	try{
		z=x/y;
	}
	catch(Exception e){
		z=Double.POSITIVE_INFINITY;
		
	}
	return z;
}public double sub(double x,double y){
	return x-y;
}
public double mod(double x,double y){
	
	return x%y;
}

}
