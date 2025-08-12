/**
 * Lớp biểu diễn phép nhân giữa hai biểu thức.
 * Ví dụ: "(4 * 6)".
 */
public class Multiplication extends BinaryExpression {

    /**
     * Khởi tạo một biểu thức nhân với hai biểu thức con.
     *
     * @param left Biểu thức bên trái.
     * @param right Biểu thức bên phải.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, ví dụ: "(4 * 6)".
     *
     * @return Chuỗi biểu diễn phép nhân.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * Tính và trả về giá trị của phép nhân giữa hai biểu thức.
     *
     * @return Tích của hai biểu thức.
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
