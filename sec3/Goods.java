package sec3;
/**
 * 商品实体类
 * huangzewei
 * 2020.3.4
 */
public class Goods {
    /**
     * 商品编号
     */
    private String goodNum;
    /**
     * 商品价格
     */
    private String goodPrice;
    /**
     * 商品类型
     */
    private String goodSType;
    /**
     * 创建时间
     */
    private String goodsCreateTime;
    /**
     * 商品库存
     */
    private int goodsCount;
    /**
     * 商品评价
     */
    private String goodsEvaluate;
    /**
     * 商品购买数量
     */
    private int goodsPurchaseCount;
    /**
     * 商品卖家信息
     */
    private String saleMessage;

    public Goods(String goodNum, String goodPrice, String goodSType, String goodsCreateTime, int goodsCount, String goodsEvaluate, int goodsPurchaseCount, String saleMessage) {
        this.goodNum = goodNum;
        this.goodPrice = goodPrice;
        this.goodSType = goodSType;
        this.goodsCreateTime = goodsCreateTime;
        this.goodsCount = goodsCount;
        this.goodsEvaluate = goodsEvaluate;
        this.goodsPurchaseCount = goodsPurchaseCount;
        this.saleMessage = saleMessage;
    }

    public Goods() {
    }

    public String getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(String goodNum) {
        this.goodNum = goodNum;
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodSType() {
        return goodSType;
    }

    public void setGoodSType(String goodSType) {
        this.goodSType = goodSType;
    }

    public String getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(String goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsEvaluate() {
        return goodsEvaluate;
    }

    public void setGoodsEvaluate(String goodsEvaluate) {
        this.goodsEvaluate = goodsEvaluate;
    }

    public int getGoodsPurchaseCount() {
        return goodsPurchaseCount;
    }

    public void setGoodsPurchaseCount(int goodsPurchaseCount) {
        this.goodsPurchaseCount = goodsPurchaseCount;
    }

    public String getSaleMessage() {
        return saleMessage;
    }

    public void setSaleMessage(String saleMessage) {
        this.saleMessage = saleMessage;
    }
}
