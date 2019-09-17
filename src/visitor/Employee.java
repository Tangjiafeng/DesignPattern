package visitor;

import java.util.Random;

public abstract class Employee {
    String name;
    int KPI;

    public Employee(String name) {
        this.name = name;
        KPI = new Random().nextInt(10);
    }
    // 核心方法，接受Visitor的访问，
    // accept方法表示接受访问者的访问，由子类具体实现，
    // Visitor是个接口，传入不同的实现类，可访问不同的数据。
    public abstract void accept(Visitor visitor);
}
