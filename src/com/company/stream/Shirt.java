package com.company.stream;
// S, M, L, XL
enum Size {
    S,M,L,XL
}
public class Shirt {
    private Size size;
    public double price;

    public Shirt(Size size, double price) {
        this.size = size;
        this.price = price;
    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt(Size.S, 23);
    }
}
