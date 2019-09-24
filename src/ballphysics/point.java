package ballphysics;

public class point {
double x;
double y;

	public point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double dist(){
		return Math.sqrt(x*x+y*y);
	}

}
