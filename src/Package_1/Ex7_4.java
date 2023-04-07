package Package_1;

public class Ex7_4 {

	public static void main(String[] args) {
		Point3D2 p = new Point3D2(1,2,3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}

}

class Point2 {
	int x,y;
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	Point3D2(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
}