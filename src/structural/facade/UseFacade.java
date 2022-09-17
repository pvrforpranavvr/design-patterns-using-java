package structural.facade;

public class UseFacade {

    public static void main(String[] args) {

        PurchaseProductFacade purchaseProductFacade = new PurchaseProductFacade();

        purchaseProductFacade.purchaseProduct("test@email.com", 100, 1232);
    }
}
