package me.victor.lombok.core.metadata;

import com.sun.tools.javac.tree.JCTree;

import me.victor.lombok.core.model.ProcessContext;

/**
 * @author binbin.hou
 * @since 0.0.1
 */
public class LObject extends LCommon{

    /**
     * 表达式
     */
    private JCTree.JCExpression expression;

    /**
     * 代码块
     */
    private JCTree.JCStatement statement;

    public LObject(ProcessContext processContext) {
        super(processContext);
    }

    public JCTree.JCExpression expression() {
        return expression;
    }

    public LObject expression(JCTree.JCExpression expression) {
        this.expression = expression;
        return this;
    }

    public JCTree.JCStatement statement() {
        return statement;
    }

    public LObject statement(JCTree.JCStatement statement) {
        this.statement = statement;
        return this;
    }
}
