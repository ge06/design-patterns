import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Gift tshirt = new Gift();
        tshirt.setGiftName("Thsirt 010101");
        tshirt.setGiftText("CustomTextForTshirt");
        tshirt.setGiftHaveAPicture(true);
        tshirt.setColour("RED");
        tshirt.setGiftInTheStock(true);
        tshirt.setGiftType(GiftType.TSHIRT);

        Gift mug = new Gift();
        mug.setGiftName("Mug for black");
        mug.setGiftText("CustomTextForMug");
        mug.setMaterial("Glass");
        mug.setGiftInTheStock(true);
        mug.setGiftHaveAPicture(true);
        mug.setGiftType(GiftType.MUG);

        List<Gift> giftList = new ArrayList();
        giftList.add(mug);
        giftList.add(tshirt);

        //For business logic
        GiftManagerService giftManagerService = null;

        for (Gift giftItem : giftList) {
            if (GiftType.MUG.equals(giftItem.getGiftType())) {
                giftManagerService = new MugManagerService(giftItem);
                giftManagerService.order();
            }
            if (GiftType.TSHIRT.equals(giftItem.getGiftType())) {
                giftManagerService = new TshirtManagerService(giftItem);
                giftManagerService.order();
            }
        }

    }
}
