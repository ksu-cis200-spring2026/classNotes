public class Rectangle {
    private int _length = 1;
    private int _width = 1;

    public int Length{
        get {
            return _length;
        }
        set {
            if (value >= 1) {
                _length = value;
            }
        }
    }

    public int Width {
        get {
            return _width;
        }
        set {
            if (value >= 1) {
                _width = value;
            }
        }
    }

    //make Length, Width properties
    //default Length/Width are each 1
    //don't allow Length/Width less than 1

    //make Area a property instead too

    //override ToString

    public int Area {
        get {
            return Length*Width;
        }
    }

    public override string ToString() {
        //return "3x4 rectangle"
        return $"{Length}x{Width} rectangle";
    }
}