public class Donut : CountableItem, DiscountedItem {
    public bool Glazed { get; init; }

    private int _count = 1;
    public int Count {
        get => _count;
        set {
            if (value >= 1 && value <= 12) {
                _count = value;
            }
        }
    }

    public string Name {
        get {
            if (Glazed) return "Glazed Donut";
            else return "Plain Donut";
        }
    }

    public double UnitPrice {
        get {
            if (Glazed) return 1.49;
            else return 1.09;
        }
    }

    public double FullPrice => Count*UnitPrice;

    public double DiscountPrice => 0.75 * FullPrice;

    public override string ToString() {
        return $"{Name}, count: {Count}, discount price: {DiscountPrice:C}";
    }
}