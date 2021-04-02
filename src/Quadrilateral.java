public class Quadrilateral {
    private int Y1;
    private int Y2;
    private int X2;
    private int X1;

    public  void vertical1(Integer X1, Integer X2)
    {
        this.X1 = X1;
        this.X2 = X2;
    }
    public void horizontal2( Integer Y1, Integer X2)
    {
        this.Y1 = Y1;
        this.Y2 = Y2;
    }
public  getVertical()
    {
        Integer b = X2 - X1;
        return b;
    }
}