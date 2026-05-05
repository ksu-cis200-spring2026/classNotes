public class Eggs : DiscountedItem {
    public string Name => "Eggs";

    public double FullPrice=> 3.99;

    public double DiscountPrice => 2.19;

    public override string ToString() {
        return $"{Name}, discount price: {FullPrice:C}";
    }
}