/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-07 00:47
 */
public class Class2 extends  ParentClass{

    private String attribute7;
    private String attribute8;

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute1='" + getAttribute1() + '\'' +
                ", attribute2='" + getAttribute2() + '\'' +
                ", attribute3='" + getAttribute3() + '\'' +
                '}';
    }
}
