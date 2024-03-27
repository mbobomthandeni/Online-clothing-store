package za.ac.cput.domain;

import java.util.List;
import java.util.Objects;

public class Cart {
    private String cartID;
    private String customerID;
    private List<CartItem> cartItems;
    private double totalAmount;

    private Cart(){};

    private Cart(Builder builder){
        this.cartID = builder.cartID;
        this.customerID = builder.customerID;
        this.cartItems = builder.cartItems;
        this.totalAmount = builder.totalAmount;
    }

    public String getCartID() {
        return cartID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return cartID == cart.cartID && customerID == cart.customerID && Double.compare(totalAmount, cart.totalAmount) == 0 && Objects.equals(cartItems, cart.cartItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartID, customerID, cartItems, totalAmount);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartID=" + cartID +
                ", customerID=" + customerID +
                ", cartItems=" + cartItems +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public static class Builder{
        private String cartID;
        private String customerID;
        private List<CartItem> cartItems;
        private double totalAmount;

        public Builder setcartID(String cartID) {
            this.cartID = cartID;
            return this;
        }

        public Builder setcustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setcartItems(List<CartItem> cartItems) {
            this.cartItems = cartItems;
            return this;
        }

        public Builder settotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder copy(Cart cart) {
            this.cartID = cart.cartID;
            this.customerID = cart.customerID;
            this.cartItems = cart.cartItems;
            this.totalAmount = cart.totalAmount;
            return this;
        }

        public Cart build(){
            return new Cart(this);
        }
    }
}