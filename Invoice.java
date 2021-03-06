package pkgfinal.exam;

public class Invoice implements Payable{
    private int partnum;
    private int qty;
    private double price;

    public Invoice(int partnum, int qty, double price) {
        this.partnum = partnum;
        this.qty = qty;
        this.price = price;
    }

    public int getPartnum() {
        return partnum;
    }

    public void setPartnum(int partnum) {
        this.partnum = partnum;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty>0) this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) this.price = price;
    }

    @Override
    public double getPayAmount() {
        return qty * price;
    }

    @Override
    public String toString() {
        return "Invoice{" + "partnum=" + partnum + ", qty=" + qty + ", price=" + price + '}';
    }
    
    
}
