package Package_1;

class point {
	int x,y;
	String getLocation() {					//여기서의 String은 반환타입을 뜻함
		return "x : " + x + ", y : " + y;
	}
}

class point3D extends point {
	int z;
	String getLocation() {					//여기서의 String은 반환타입을 뜻함
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}

public class Page_229 {

	public static void main(String[] args) {
		point3D d3 = new point3D();
		d3.x = 7;
		d3.y = 92;
		d3.z = 5;
		System.out.println(d3.getLocation());

	}

}
