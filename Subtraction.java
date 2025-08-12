/**
 * Lớp biểu diễn phép trừ giữa hai biểu thức.
 * Ví dụ: "(7 - 2)".
 */
public class Subtraction extends BinaryExpression {

    /**
     * Khởi tạo một biểu thức trừ với hai biểu thức con.
     *
     * @param left Biểu thức bên trái.
     * @param right Biểu thức bên phải.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, ví dụ: "(7 - 2)".
     *
     * @return Chuỗi biểu diễn phép trừ.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * Tính và trả về giá trị của phép trừ giữa hai biểu thức.
     *
     * @return Hiệu của hai biểu thức.
     */
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
