public class TortillaChips : DiscountedItem {
    public bool LowSalt { get; init; } = false;
    
    public string Name => "Tortilla Chips";

    public double DiscountPrice => 3.99;

    public double FullPrice => 5.49;

    public override string ToString() {
        return $"{Name}, discount price: {DiscountPrice:C}";
    }
}