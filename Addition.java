/**
 * Lớp biểu diễn phép cộng giữa hai biểu thức.
 * Ví dụ: "(3 + 5)".
 */
public class Addition extends BinaryExpression {

    /**
     * Khởi tạo một biểu thức cộng với hai biểu thức con.
     *
     * @param left Biểu thức bên trái.
     * @param right Biểu thức bên phải.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, ví dụ: "(3 + 5)".
     *
     * @return Chuỗi biểu diễn phép cộng.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Tính và trả về giá trị của phép cộng giữa hai biểu thức.
     *
     * @return Tổng của hai biểu thức.
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
