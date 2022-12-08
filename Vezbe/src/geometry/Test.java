package geometry;

public class Test {

	public static void main(String[] args) {
		/*Point p = new Point();
		p.setX(3);
		p.setY(5);
		Point p1 = new Point();
		p.setX(3);
		p.setY(5);
		
		Circle c = new Circle ();
		c.setCenter(p);
		c.setR(7);
		
		System.out.println("Centar kruga je tacka sa koordinama : ");
		System.out.println("X: " + c.getCenter().getX());	
		System.out.println("Y: " + c.getCenter().getY());
		System.out.println("Poluprecnik  kruga je: " + c.getR());
		
		//metodda za izracunavanje pov
		
		double circleArea=c.area();
		System.out.println(circleArea);
		
		Circle c1=new Circle();
		c1.setCenter(new Point(3,5));
		
		Line l = new Line();
		Line l1 = new Line (p,p1);
		Line l2 = new Line (p,p, true);
		Line l3 = new Line (new Point(6,7), new Point (8,9));*/
		/*Point p = new Point (4,5);
		Point p1=new Point (4,5);
		System.out.println(p.toString());
		Line l = new Line (new Point(5,7), new Point(8,9));
		System.out.println(l.toString());
		Circle c1=new Circle (p, 5);
		System.out.println(c1.toString());
		Rectangle r=new Rectangle(new Point(8,9),7,11);
		System.out.println(r.toString());
		System.out.println(p.equals(p1));
		*/
		/*Point p1=new Point (5,5);
		Point p2= new Point (5,5);
		Line l2=new Line(p1,p2);
		Rectangle r1=new Rectangle(p2, 50,50,false);
		Circle c1=new Circle(p1,50,true);
		
		System.out.println(p1==p2);
		System.out.println(15==15);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(c1));
		*/
		Donut d =new Donut(new Point(3,5),8,3);
		System.out.println(d.circumference());
		System.out.println(d.area());
		Circle c=new Circle(new Point (3,5),8);
			System.out.println(c.circumference());
		System.out.println(c.area());	
		System.out.println(d.toString());
		
		Point p= new Point(3,5);
		System.out.println(d.equals(c));
		
	}

}
