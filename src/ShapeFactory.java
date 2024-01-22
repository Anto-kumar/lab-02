public class ShapeFactory {
    public static ShapeFactory ins = null;
    private ShapeFactory(){}

    public static Shape getShape(String shapeTye)
    {

        if(shapeTye == null)
            return null;

        if(shapeTye.equalsIgnoreCase("rectangle"))
        {
            return  new Rectangle();
        }
        else if(shapeTye.equalsIgnoreCase("square"))
        {
            return new Square();
        }
         return  null;
    }

    private static ShapeFactory getInstance()
    {
        if(ins == null)
        {
            ins = new ShapeFactory();

        }
        return  ins;
    }
}
