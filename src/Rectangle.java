// exercise 8.4
// Find the perimeter and area of a Rectangle

public class Rectangle {
    private float length;
     float width;
    public void Area( float w, float l) {
        setLength(l) ;
        setWidth(w) ;
    }
    public void setLength( float l){
        if (  l >0.0 && l < 20.0)
            length = l;
        else throw new IllegalArgumentException( "length must be 1.0 - 20.0" );
    }
    public void setWidth( float w)
    {
        if ( w > 0.0 && w < 20.0)
            width = w;
        else throw new IllegalArgumentException( "width must be 1.0 - 20.0" );
    }
    public float getLength()
    {

        return length;
    }
    public float getWidth()
    {

        return width;
    }

}
