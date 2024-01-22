public class ShapeFactory {
    public static Shape ins = null;
    private ShapeFactory(){}

    public static Shape getShape(String shapeTye)
    {
        if(ins != null) return ins;

        if(shapeTye == null) return null;

        if(shapeTye.equalsIgnoreCase("rectangel"))
        {
            return  new Rectangle();
        }
        else if(shapeTye.equalsIgnoreCase("rectangel"))
        {
            return new Square();
        }
         return  null;
    }
}
