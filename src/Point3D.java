public class Point3D {
	private double xCoord;
	private double yCoord;
	private double zCoord;
	public  Point3D(double x,double y,double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	
	// ����������� ��� ������� ��������
	public  Point3D() {
		this(0.0, 0.0, 0.0);
	}

	// �������
	public double getX() {
		return xCoord;
	}
	
	public double getY() {
		return yCoord;
	}
	
	public double getZ() {
		return zCoord;
	}
	
	// �������
	public void setX(double value) {
		xCoord = value;
	}

	public void setY(double value) {
		yCoord = value;
	}
	
	public void setZ(double value) {
		zCoord = value;
	}
	
	// ����� ��� �������� �������� �������
	public boolean checkValue(Point3D point) {
		return 	xCoord == point.xCoord &&
				yCoord == point.yCoord &&
				zCoord == point.zCoord;
	}
	
	// ����� ��� ���������� ���������� ����� ����� �������
	public double distanceTo(Point3D point) {
		return Math.sqrt(Math.pow(this.xCoord - point.xCoord, 2)) +
			   Math.sqrt(Math.pow(this.yCoord - point.yCoord, 2)) +
			   Math.sqrt(Math.pow(this.zCoord - point.zCoord, 2));
	}
}
