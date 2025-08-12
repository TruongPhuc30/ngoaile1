/**
 * Lớp biểu diễn một biểu thức nhị phân gồm hai biểu thức con và một toán tử.
 * Hỗ trợ các toán tử: "+", "-", "*", "/".
 */
public class BinaryExpression extends Expression {

    /** Biểu thức bên trái. */
    protected Expression left;

    /** Biểu thức bên phải. */
    protected Expression right;

    /** Toán tử giữa hai biểu thức, ví dụ "+", "-", "*", "/". */
    protected String operator;

    /**
     * Khởi tạo một biểu thức nhị phân với hai biểu thức con và toán tử cho trước.
     *
     * @param left Biểu thức bên trái.
     * @param right Biểu thức bên phải.
     * @param operator Toán tử giữa hai biểu thức.
     */
    public BinaryExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, ví dụ: "(3 + 5)".
     *
     * @return Chuỗi biểu diễn biểu thức nhị phân.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }

    /**
     * Tính và trả về giá trị của biểu thức nhị phân.
     * Nếu chia cho 0, trả về NaN.
     *
     * @return Giá trị số của biểu thức.
     */
    @Override
    public double evaluate() {
        switch (operator) {
            case "+":
                return left.evaluate() + right.evaluate();
            case "-":
                return left.evaluate() - right.evaluate();
            case "*":
                return left.evaluate() * right.evaluate();
            case "/":
                return right.evaluate() != 0 ? left.evaluate() / right.evaluate() : Double.NaN;
            default:
                throw new UnsupportedOperationException("Toán tử không hỗ trợ: " + operator);
        }
    }
}
