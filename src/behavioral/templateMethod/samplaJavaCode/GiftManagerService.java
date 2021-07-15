public abstract class GiftManagerService {
    Gift gift;

    public abstract boolean addText(Gift gift);

    public abstract boolean addPicture(Gift gift);

    public abstract boolean isStockExists(Gift gift);

    public final void order() {
        if (addText(gift) && addPicture(gift)) {
            System.out.println(" step 1) the product add a template for user");
            if (isStockExists(gift)) {
                System.out.println("step 2)the product add a cart, ready for order");
                printGiftInfo(gift);
            } else {
                System.out.println("step 2 exception: give a info, the product not exist, will be supplied soon. ");
            }
        }else {
            //Some business logic
            System.out.println("Step1: exception: Unable to text and pic");
        }
    }

    private void printGiftInfo(Gift gift) {
        System.out.println(gift.toString());
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
