/**
 * Lớp trừu tượng biểu diễn một biểu thức nhị phân gồm hai biểu thức con.
 * Các lớp con như {@code Addition}, {@code Subtraction}, {@code Multiplication}, {@code Division}
 * sẽ kế thừa và triển khai logic cụ thể cho từng phép toán.
 */
public abstract class BinaryExpression extends Expression {

    /** Biểu thức bên trái. */
    protected Expression left;

    /** Biểu thức bên phải. */
    protected Expression right;

    /**
     * Khởi tạo một biểu thức nhị phân với hai biểu thức con.
     *
     * @param left Biểu thức bên trái.
     * @param right Biểu thức bên phải.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Trả về biểu thức bên trái.
     *
     * @return Biểu thức bên trái.
     */
    public Expression getLeft() {
        return left;
    }

    /**
     * Gán biểu thức bên trái.
     *
     * @param left Biểu thức mới bên trái.
     */
    public void setLeft(Expression left) {
        this.left = left;
    }

    /**
     * Trả về biểu thức bên phải.
     *
     * @return Biểu thức bên phải.
     */
    public Expression getRight() {
        return right;
    }

    /**
     * Gán biểu thức bên phải.
     *
     * @param right Biểu thức mới bên phải.
     */
    public void setRight(Expression right) {
        this.right = right;
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi.
     * Các lớp con cần triển khai phương thức này để biểu diễn phép toán cụ thể.
     *
     * @return Chuỗi biểu diễn biểu thức.
     */
    @Override
    public abstract String toString();

    /**
     * Tính và trả về giá trị của biểu thức.
     * Các lớp con cần triển khai phương thức này để thực hiện phép toán cụ thể.
     *
     * @return Giá trị số của biểu thức.
     */
    @Override
    public abstract double evaluate();
}
