using System;
using System.Collections.Generic;

public class GroceryOrder {
    private List<GroceryItem> _items;
    private Random _r;

    public GroceryOrder() {
        _items = new List<GroceryItem>();
        _r = new Random();
    }

    public void AddItem(GroceryItem item) {
        _items.Add(item);
    }

    public void CreateRandomOrder() {
        _items.Clear();

        //generate 5-10 items
        int count = _r.Next(6)+5;

        for (int i = 0; i < count; i++) {
            //generate 0-5 for item type
            int whichItem = _r.Next(6);

            GroceryItem item;

            if (whichItem == 0) {
                Apple a = new Apple();

                //randomly count of 1-10
                int itemCount = _r.Next(10) + 1;
                a.Count = itemCount;
                item = a;
            }
            else if (whichItem == 1) {
                //randomly low salt
                int saltNum = _r.Next(2);
                bool lowSalt = false;

                item = new TortillaChips() {LowSalt = lowSalt};
            }
            else if (whichItem == 2) {
                //randomly glazed
                int glazedNum = _r.Next(2);
                bool glaze = false;
                if (glazedNum == 1) glaze = true;

                Donut d = new Donut{Glazed = glaze};

                //randomly count of 1-12
                int itemCount = _r.Next(12) + 1;
                d.Count = itemCount;
                item = d;
            }
            else if (whichItem == 3) {
                item = new Eggs();
            }
            else if (whichItem == 4) {
                //randomly organic
                int orgNum = _r.Next(2);
                bool org = false;
                if (orgNum == 1) org = true;

                Orange o = new Orange() {Organic = org};

                //randomly count of 1-5
                int itemCount = _r.Next(5) + 1;
                o.Count = itemCount;
                item = o;
            }
            else  {
                //randomly hot
                int hotNum = _r.Next(2);
                bool hot = false;
                if (hotNum == 1) hot = true;

                item = new RotisserieChicken() {Hot = hot};
            }

            AddItem(item);
        }
    }

    public void CreateStandardOrder() {
        _items.Clear();

        //8 apples
        Apple a = new Apple() {Count = 8};
        AddItem(a);

        //low salt tortilla chips
        AddItem(new TortillaChips() {LowSalt = true});

        //12 plain donuts
        Donut d = new Donut() {Glazed = false, Count = 12};
        AddItem(d);

        //3 glazed donuts
        d = new Donut() {Glazed = true, Count = 3};
        AddItem(d);

        //3 containers of eggs
        AddItem(new Eggs());
        AddItem(new Eggs());
        AddItem(new Eggs());

        //5 organic oranges
        AddItem(new Orange(){Organic = true, Count = 5});

        //1 hot rotisserie chicken, 1 cold rotisserie chicken
        AddItem(new RotisserieChicken(){Hot = true});
        AddItem(new RotisserieChicken(){Hot = false});
    }

    public double Total {
        get {
            double total = 0; 
            foreach (GroceryItem item in _items) {
                total += item.FullPrice;
            }
            return total;
        }
    }

    public double DiscountedTotal {
        get {
            double total = 0; 
            foreach (GroceryItem item in _items) {
                if (item is DiscountedItem d) {
                    total += d.DiscountPrice;
                }
                else {
                    total += item.FullPrice;
                }
            }
            return total;
        }
    }

    public double Savings => Total - DiscountedTotal;

    public List<GroceryItem> AllItems => _items;

    public List<CountableItem> CountableItems {
        get {
            List<CountableItem> filtered = new List<CountableItem>();
            foreach (GroceryItem item in _items) {
                if (item is CountableItem c) {
                    filtered.Add(c);
                }
            }
            return filtered;
        }
    }

    public List<DiscountedItem> DiscountedItems {
        get {
            List<DiscountedItem> filtered = new List<DiscountedItem>();
            foreach (GroceryItem item in _items) {
                if (item is DiscountedItem d) {
                    filtered.Add(d);
                }
            }
            return filtered;
        }
    }
}
