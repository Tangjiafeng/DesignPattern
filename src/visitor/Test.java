package visitor;

public class Test {
    public static void main(String[] args) {
        // 构建报表
        Report report = new Report();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
