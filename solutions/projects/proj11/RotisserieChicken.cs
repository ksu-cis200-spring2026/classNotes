public class RotisserieChicken : GroceryItem {

    public bool Hot {get; init;}

    public string Name {
        get {
            if (Hot) return "Hot Rotisserie Chicken";
            else return "Rotisserie Chicken";
        }
    }

    public double FullPrice {
        get {
            if (Hot) return 7.49;
            else return 6.49;
        }
    }

    public override string ToString() {
        return $"{Name}, price: {FullPrice:C}";
    }
}