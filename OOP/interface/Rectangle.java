class Rectangle implements Shape {
    double length = 10.5;
    double width = 4.5;

    public double getArea() {
        double area = length * width;
        return area;
    }
    public void display() {
        System.out.println("Area: " +  getArea());
    }
}