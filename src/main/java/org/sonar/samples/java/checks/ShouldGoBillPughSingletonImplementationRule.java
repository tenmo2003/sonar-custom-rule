package org.sonar.samples.java.checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.VariableTree;

/**
 * @author anhvn
 */
@Rule(key = "ShouldGoBillPughSingletonImplementation")
public class ShouldGoBillPughSingletonImplementationRule extends BaseTreeVisitor implements JavaFileScanner {
    private JavaFileScannerContext context;

    @Override
    public void scanFile(JavaFileScannerContext context) {
        this.context = context;
        scan(context.getTree());
    }

    @Override
    public void visitVariable(VariableTree tree) {
        if ("instance".equalsIgnoreCase(tree.simpleName().name())) {
            context.reportIssue(this, tree, "Singleton detected, you should implement singleton follow the Bill Pugh singleton approach");
        }

        super.visitVariable(tree);
    }
}
