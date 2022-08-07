package hello.core.order;

public class Order {
    private Long memberId;
    private String itermName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itermName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itermName = itermName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculaterPrice() {
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItermName() {
        return itermName;
    }

    public void setItermName(String itermName) {
        this.itermName = itermName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itermName='" + itermName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
