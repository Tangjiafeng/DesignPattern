package visitor;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", products: " + manager.getProducts());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", code lines: " + engineer.getCodeLines());
    }
}
