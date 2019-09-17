package visitor;

/**
 * 年底，CEO和CTO开始评定员工一年的工作绩效，员工分为工程师和经理，
 * CTO关注工程师的代码量、经理的新产品数量；
 * CEO关注的是工程师的KPI和经理的KPI以及新产品数量。
 *
 *
 * 两个 visit 函数，参数分别是 Engineer、Manager，
 * 也就是说对于 Engineer、Manager的访问会调用两个不同的方法，以此达成区别对待、差异化处理。
 *
 * 如果不使用visitor模式，则关键代码如下，含有“if-else”的丑陋代码
 *      public void visit(Employee staff) {
 *         if (staff instanceof Manager) {
 *             Manager manager = (Manager) staff;
 *             System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
 *                     ", 新产品数量: " + manager.getProducts());
 *         } else if (staff instanceof Engineer) {
 *             Engineer engineer = (Engineer) staff;
 *             System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
 *         }
 *     }
 */
public interface Visitor {
    void visit(Manager manager);
    void visit(Engineer engine);
}
