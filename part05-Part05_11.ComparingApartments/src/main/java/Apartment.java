
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int price1 = this.princePerSquare*this.squares;
        int price2 = compared.princePerSquare*compared.squares; 
        
        return Math.abs(price1-price2); //retorna valor absoluto
    }
    public boolean moreExpensiveThan(Apartment compared){
        int price1 = this.princePerSquare*this.squares;
        int price2 = compared.princePerSquare*compared.squares;
        
        return price1>price2;
    }
    
}
