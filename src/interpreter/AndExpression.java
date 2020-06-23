package interpreter;

//Non-terminal expression 
public class AndExpression implements PermissionExpression{

    private PermissionExpression permissionExpressionA;
    private PermissionExpression permissionExpressionB;

    public AndExpression(PermissionExpression permissionExpressionA, PermissionExpression permissionExpressionB) {
        this.permissionExpressionA = permissionExpressionA;
        this.permissionExpressionB = permissionExpressionB;
    }

    @Override
    public boolean interpret(User user) {
        return permissionExpressionA.interpret(user) && permissionExpressionB.interpret(user);
    }
}
