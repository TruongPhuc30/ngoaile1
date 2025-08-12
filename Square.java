/**
 * Lớp biểu diễn phép toán bình phương của một biểu thức.
 * Ví dụ: nếu biểu thức là "x", thì biểu thức này biểu diễn "x^2".
 */
public class Square extends Expression {

    /** Biểu thức cần được bình phương. */
    private Expression expression;

    /**
     * Khởi tạo một biểu thức bình phương với biểu thức con cho trước.
     *
     * @param expression Biểu thức cần được bình phương.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, có dạng "(biểu thức)^2".
     *
     * @return Chuỗi biểu diễn biểu thức bình phương.
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ")^2";
    }

    /**
     * Tính và trả về giá trị của biểu thức bình phương.
     * Giá trị được tính bằng cách lấy giá trị của biểu thức con rồi nhân với chính nó.
     *
     * @return Giá trị số của biểu thức bình phương.
     */
    @Override
    public double evaluate() {
        double val = expression.evaluate();
        return val * val;
    }
}
