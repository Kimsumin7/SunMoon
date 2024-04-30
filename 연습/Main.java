public class Main {
    public static void main(String[] args) {
        int a = 10;
        Student b = new Student();
        
        m1(a); // call by value
        m2(b); // call by value (객체의 참조 값이 복사되어 전달되므로)
        
        // 여기서 a와 b는 변경되지 않은 상태입니다.
        System.out.println("a after m1: " + a); // 출력: 10
        System.out.println("b after m2: " + b.getName()); // 출력: Alice (m2에서 변경된 상태)
    }
    
    static void m1(int x) {
        // x의 값을 변경해도 호출된 곳에 영향을 주지 않음
        x = 20;
    }
    
    static void m2(Student s) {
        // s의 참조 값으로 실제 객체에 접근하여 상태를 변경함
        s.setName("Alice");
    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
