package sec3;

/**
 * 订单实体类
 * huangzewei
 * 2020.3.4
 */
public class Order {
    /**
     * 订单编号
     */
     private String orderNum;
    /**
     * 订单总价格
     */
    private String orderPrice;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 订单创建时间
     */
    private String createTime;
    /**
     *商品数量
     */
    private int goodsNum;
    /**
     * 商品类型
     */
    private String categorize;
    /**
     * 订单发货日期
     * @return
     */
    private String Time;

    public Order(String orderNum, String orderPrice, int userId, String createTime, int goodsNum, String categorize, String time) {
        this.orderNum = orderNum;
        this.orderPrice = orderPrice;
        this.userId = userId;
        this.createTime = createTime;
        this.goodsNum = goodsNum;
        this.categorize = categorize;
        Time = time;
    }

    public Order() {
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getCategorize() {
        return categorize;
    }

    public void setCategorize(String categorize) {
        this.categorize = categorize;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
