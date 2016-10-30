public class point {
	private double abscisse;
	private double ordonnée;
	
	public point(){
		this.abscisse=0;
		this.ordonnée=0;}
	public point(double x){
		this.abscisse=x;
		this.ordonnée=x;
	}
	public point (double x, double y){
		this.abscisse=x;
		this.ordonnée=y;
	}
	public double getAbscisse(){
		return this.abscisse;
	}
	public double getOrdonnée(){
		return this.ordonnée;
	}
	public void deplace ( int dx, int dy ){
	
	x+=dx;y+=dy;
	}
	public String toString(){
		return "(" + abscisse+ ","+ ordonnée +")";
	}
	public point Symetrie(){
		return new point(-abscisse,ordonnée);
	}
