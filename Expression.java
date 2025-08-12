/**
 * Lớp trừu tượng đại diện cho một biểu thức toán học.
 * Các lớp con cần triển khai phương thức để biểu diễn biểu thức dưới dạng chuỗi
 * và tính giá trị của biểu thức.
 */
public abstract class Expression {

    /**
     * Trả về biểu thức dưới dạng chuỗi.
     * Ví dụ: "(3 + 5)" hoặc "2^2".
     *
     * @return Biểu thức dưới dạng chuỗi.
     */
    public abstract String toString();

    /**
     * Tính và trả về giá trị của biểu thức.
     * Ví dụ: nếu biểu thức là "(3 + 5)", phương thức này trả về 8.
     *
     * @return Giá trị số của biểu thức.
     */
    public abstract double evaluate();
}
