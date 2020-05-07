/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-07 00:46
 */
public class Class1 extends  ParentClass{
    private String attribute4;
    private String attribute5;

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute1='" + getAttribute1() + '\'' +
                ", attribute2='" + getAttribute2() + '\'' +
                ", attribute3='" + getAttribute3() + '\'' +
                '}';
    }
}
