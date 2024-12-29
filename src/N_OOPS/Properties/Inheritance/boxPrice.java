package N_OOPS.Properties.Inheritance;

public class boxPrice extends BoxWeight {
    double cost;

    boxPrice(){
        super();
        this.cost = -1;
    }

    boxPrice(boxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public boxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
