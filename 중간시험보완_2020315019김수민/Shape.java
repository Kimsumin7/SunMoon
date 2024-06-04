class Shape {
    protected String name; // 도형의 이름

    // 생성자
    public Shape(String name) {
        this.name = name;
    }

    // 도형을 그리는 메서드
    public void draw() {
        System.out.println("Drawing " + name + " of class " + getClass().getSimpleName());
    }

    // 도형의 면적을 반환하는 메서드
    public double area() {
        return 0.0; // 기본적으로 0.0 반환, 각 도형 클래스에서 오버라이딩할 예정
    }
}
