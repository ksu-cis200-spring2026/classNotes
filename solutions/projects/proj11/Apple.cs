public class Apple : CountableItem {

    public Apple() {
        Count = 1;
    }

    public String Name => "Apple";

    private int _count = 1;
    public int Count {
        get => _count;
        set {
            if (value >= 1 && value <= 10) {
                _count = value;
            }
        }
    }

    public double UnitPrice => 0.85;

    public double FullPrice => Count*UnitPrice;

    public override string ToString() {
        return $"{Name}, count: {Count}, price: {FullPrice:C}";
    }
}