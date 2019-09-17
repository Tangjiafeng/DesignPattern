package visitor;

import java.util.LinkedList;
import java.util.List;

public class Report {

    private List<Employee> employees = new LinkedList<>();

    public Report() {
        employees.add(new Manager("经理-A"));
        employees.add(new Engineer("工程师-A"));
        employees.add(new Engineer("工程师-B"));
        employees.add(new Engineer("工程师-C"));
        employees.add(new Manager("经理-B"));
        employees.add(new Engineer("工程师-D"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor) {
        for (Employee staff : employees) {
            staff.accept(visitor);
        }
    }
}
