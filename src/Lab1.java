public class Lab1 {

	// основной метод, который запускает программу
	public static void main(String[] args) {

		/* Point2d myPoint = new Point2d(); // point 0, 0
		Point2d otherPoint = new Point2d(5, 3);	// point 5, 3
		Point2d aThirdPoint = new Point2d(); // != myPoint		
		System.out.println(myPoint.checkValue(aThirdPoint)); // test */
		
		// создаем массив объекта класса Point3d с размером 3. 
		Point3D[] myPoint = new Point3D[3];
		
		// цикл для заполнения нашего массива
		for (int i = 0; i < 3; i++) {
			myPoint[i] = new Point3D();
			myPoint[i].setX(Double.valueOf(args[0 + 3 * i]));
			myPoint[i].setY(Double.valueOf(args[1 + 3 * i]));
			myPoint[i].setZ(Double.valueOf(args[2 + 3 * i]));
			
			System.out.println("Point " + i + " (" + myPoint[i].getX() + ", " + myPoint[i].getY() + ", " + myPoint[i].getZ() + ")");
		}
		
		// проверка на значения объектов
		// если обнаружены схожества, то выбрасываем ошибку
		// иначе выдаем результат
		if (myPoint[0].checkValue(myPoint[1]) || myPoint[1].checkValue(myPoint[2]) || myPoint[2].checkValue(myPoint[0])) {
			System.out.println("Some points are equals. Please try again!");
		} else {
			System.out.println("Area of triangle: " + computeArea(myPoint[0], myPoint[1], myPoint[2]));
		}
	}
	
	// метод для вычисления площади по трем точкам
	public static double computeArea(Point3D p1, Point3D p2, Point3D p3) { 
		
			double a = p1.distanceTo(p2);
			double b = p2.distanceTo(p3);
			double c = p3.distanceTo(p1);
			
			double perimeter = (a + b + c) / 2;
			
			double square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
			
			return square;
	}
}