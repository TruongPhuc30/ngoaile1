/**
 * Lớp biểu diễn một hằng số số học trong biểu thức.
 * Ví dụ: 5.0 hoặc -3.14.
 */
public class Numeral extends Expression {

    /** Giá trị số của biểu thức. */
    private double value;

    /**
     * Khởi tạo một biểu thức số với giá trị mặc định là 1.0.
     */
    public Numeral() {
        this.value = 1.0;
    }

    /**
     * Khởi tạo một biểu thức số với giá trị cho trước.
     *
     * @param value Giá trị số cần biểu diễn.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Trả về biểu thức dưới dạng chuỗi, chính là giá trị số.
     *
     * @return Chuỗi biểu diễn giá trị số.
     */
    @Override
    public String toString() {
        if (value == (int) value) {
            return Integer.toString((int) value);
        } else {
            return Double.toString(value);
        }
    }
    
    /**
     * Trả về giá trị số của biểu thức.
     *
     * @return Giá trị số.
     */
    @Override
    public double evaluate() {
        return value;
    }
}
