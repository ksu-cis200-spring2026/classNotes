public class PoloShirt {
    //get rid of these fields (inherit them)
    private ShirtColor color;
    private int count;
    
    public PoloShirt() {
        color = ShirtColor.Black;
        count = 1;
    }

    //override setColor
    public void setColor(ShirtColor newColor) {
        //only black and purple allowed
        if (newColor == ShirtColor.Black || newColor == ShirtColor.Purple) {
            color = newColor;
        }
        //otherwise don't change the color
    }

    public void setCount(int c) {
        if (c >= 1 && c <= 5) {
            count = c;
        }
        //don't change count unless new value is 1-5
    }

    //override unitCost (should be $24.99)

    //GET RID OF orderCost

    //override getName

    //GET RID OF toString
}