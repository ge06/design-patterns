public class MugManagerService extends GiftManagerService {

    public MugManagerService(Gift gift) {
        super.gift = gift;
        gift.setGiftType(GiftType.MUG);
        addMaterial(gift.getMaterial());
    }

    @Override
    public boolean addText(Gift gift) {
        return gift.isGiftHaveAText();
    }

    @Override
    public boolean addPicture(Gift gift) {
        return gift.isGiftHaveAPicture;
    }

    @Override
    public boolean isStockExists(Gift gift) {
        System.out.println("Mug supplier outer  web service or microservice return stock status");
        return  gift.isGiftInTheStock;
    }

    public void addMaterial(String string) {
        gift.setMaterial("Glass");
    }
}
