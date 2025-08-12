/**
 * Lớp biểu diễn phép chia giữa hai biểu thức.
 * Ví dụ: "(8 / 2)".
 * Nếu mẫu số bằng 0, sẽ ném ra ngoại lệ {@link ArithmeticException}.
 */
public class Division extends BinaryExpression {

    /**
     * Khởi tạo một biểu thức chia với hai biểu thức con.
     *
     * @param left Biểu thức bên trái (tử số).
     * @param right Biểu thức bên phải (mẫu số).
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, ví dụ: "(8 / 2)".
     *
     * @return Chuỗi biểu diễn phép chia.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Tính và trả về giá trị của phép chia giữa hai biểu thức.
     * Nếu mẫu số bằng 0, ném ra {@link ArithmeticException}.
     *
     * @return Thương của hai biểu thức.
     * @throws ArithmeticException nếu mẫu số bằng 0.
     */
    @Override
    public double evaluate() {
        double denominator = right.evaluate();
        if (denominator == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / denominator;
    }
}
