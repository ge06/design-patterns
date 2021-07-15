public class TshirtManagerService extends GiftManagerService {

    public TshirtManagerService(Gift gift) {
    super.gift=gift;
    gift.setGiftType(GiftType.TSHIRT);
    this.adjustColour(gift.getColour());
    }

    @Override
    public boolean addText(Gift gift) {
        return gift.isGiftHaveAText();
    }

    @Override
    public boolean addPicture(Gift gift) {
        return gift.isGiftHaveAText();
    }

    @Override
    public boolean isStockExists(Gift gift) {
        System.out.println("Tshirt supplier outer web service or microservice return stock status");
        return  gift.isGiftInTheStock;
    }

    public void  adjustColour(String colour){
        if(colour.equals("RED")){
            gift.setColour("PINK");
        }else
            gift.setColour(colour);
    }

}
