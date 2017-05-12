public class TestPoint {
  public static void main (String[] args) {
    Point A = new Point （3.0,4.0,5.0）;
    System.out.println(A);
    System.out.println(new Point(2.0,3.0,4.0));
  }
}

class Point {
  double x,y,z;
  
  Point (double _x, _y, _z) {
    x = _x;
    y = _y;
    z = _z;
  }
  
  void setX(double) {
    x = _x;
  }
  
  void setY(double) {
    y = _y;
  }
  
  void setZ(double) {
    z = _z;
  }
}
