public class point {
	private double abscisse;
	private double ordonée;
	
	public point(){
		this.abscisse=0;
		this.ordonée=0;}
	public point(double x){
		this.abscisse=x;
		this.ordonée=x;
	}
	public point (double x, double y){
		this.abscisse=x;
		this.ordonée=y;
	}
	public double getAbscisse(){
		return this.abscisse;
	}
	public double getOrdonée(){
		return this.ordonée;
	}
	public void deplace ( int dx, int dy ){
	
	x+=dx;y+=dy;
	}
	public String toString(){
		return "(" + abscisse+ ","+ ordonée +")";
	}
	public point Symetrie(){
		return new point(-abscisse,ordonée);
	}
