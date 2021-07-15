
public class Gift {

    public String giftName;

    public boolean isGiftHaveAPicture;

    public boolean isGiftInTheStock;

    private GiftType giftType;

    private String giftText;

    private String material;
    private String colour;

    public GiftType getGiftType() {
        return giftType;
    }

    public void setGiftType(GiftType giftType) {
        this.giftType = giftType;
    }

    public String getGiftText() {
        return giftText;
    }

    public void setGiftText(String giftText) {
        this.giftText = giftText;
    }

    public boolean isGiftHaveAText() {
        return this.getGiftText() != null || !this.getGiftText().trim().isEmpty();
    }

    public boolean isGiftHaveAPicture() {
        return isGiftHaveAPicture;
    }

    public void setGiftHaveAPicture(boolean giftHaveAPicture) {
        isGiftHaveAPicture = giftHaveAPicture;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public boolean isGiftInTheStock() {
        return isGiftInTheStock;
    }

    public void setGiftInTheStock(boolean giftInTheStock) {
        isGiftInTheStock = giftInTheStock;
    }

    @Override
    public String toString() {
        if(GiftType.TSHIRT.equals(this.getGiftType())){
            return "Gift{" +
                    "giftName='" + giftName + '\'' +
                    ", isGiftHaveAPicture=" + isGiftHaveAPicture +
                    ", giftType=" + giftType +
                    ", giftText='" + giftText + '\'' +
                    ", colour='" + colour + '\'' +
                    '}';
        }
        if(GiftType.MUG.equals(this.getGiftType())){
            return "Gift{" +
                    "giftName='" + giftName + '\'' +
                    ", isGiftHaveAPicture=" + isGiftHaveAPicture +
                    ", giftType=" + giftType +
                    ", giftText='" + giftText + '\'' +
                    ", material='" + material + '\'' +
                    '}';
        }
        return "unknown type";
    }
}
