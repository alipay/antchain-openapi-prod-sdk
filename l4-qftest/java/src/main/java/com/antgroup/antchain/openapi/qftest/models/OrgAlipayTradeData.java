// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class OrgAlipayTradeData extends TeaModel {
    // 支付宝订单号
    /**
     * <strong>example:</strong>
     * <p>202503060003000000000001</p>
     */
    @NameInMap("alipay_order_no")
    @Validation(required = true)
    public String alipayOrderNo;

    // 交易创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 交易支付时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("gmt_pay")
    @Validation(required = true)
    public String gmtPay;

    // 交易退款时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("gmt_refund")
    @Validation(required = true)
    public String gmtRefund;

    // 商品备注信息
    /**
     * <strong>example:</strong>
     * <p>商品备注信息</p>
     */
    @NameInMap("goods_memo")
    public String goodsMemo;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>机构名称</p>
     */
    @NameInMap("goods_title")
    @Validation(required = true)
    public String goodsTitle;

    // 商户订单号，创建支付宝交易时传入的信息
    /**
     * <strong>example:</strong>
     * <p>202503060003000000000001</p>
     */
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    // 商家优惠金额
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("net_mdiscount")
    @Validation(required = true)
    public String netMdiscount;

    // 对方账户
    /**
     * <strong>example:</strong>
     * <p>对方账户</p>
     */
    @NameInMap("other_account")
    @Validation(required = true)
    public String otherAccount;

    // 订单退款金额
    /**
     * <strong>example:</strong>
     * <p>2000.99</p>
     */
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 服务费金额
    /**
     * <strong>example:</strong>
     * <p>20000.11</p>
     */
    @NameInMap("service_fee")
    @Validation(required = true)
    public String serviceFee;

    // 门店名称
    /**
     * <strong>example:</strong>
     * <p>storeName</p>
     */
    @NameInMap("store_name")
    public String storeName;

    // 门店编号
    /**
     * <strong>example:</strong>
     * <p>门店编号</p>
     */
    @NameInMap("store_no")
    public String storeNo;

    // 订单金额
    /**
     * <strong>example:</strong>
     * <p>20000.11</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
    /**
     * <strong>example:</strong>
     * <p>TRADE_SUCCESS</p>
     */
    @NameInMap("trade_status")
    @Validation(required = true)
    public String tradeStatus;

    // 业务类型，帮助商户作为对账参考
    /**
     * <strong>example:</strong>
     * <p>业务类型，帮助商户作为对账参考</p>
     */
    @NameInMap("trade_type")
    @Validation(required = true)
    public String tradeType;

    public static OrgAlipayTradeData build(java.util.Map<String, ?> map) throws Exception {
        OrgAlipayTradeData self = new OrgAlipayTradeData();
        return TeaModel.build(map, self);
    }

    public OrgAlipayTradeData setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
        return this;
    }
    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public OrgAlipayTradeData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OrgAlipayTradeData setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
        return this;
    }
    public String getGmtPay() {
        return this.gmtPay;
    }

    public OrgAlipayTradeData setGmtRefund(String gmtRefund) {
        this.gmtRefund = gmtRefund;
        return this;
    }
    public String getGmtRefund() {
        return this.gmtRefund;
    }

    public OrgAlipayTradeData setGoodsMemo(String goodsMemo) {
        this.goodsMemo = goodsMemo;
        return this;
    }
    public String getGoodsMemo() {
        return this.goodsMemo;
    }

    public OrgAlipayTradeData setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
        return this;
    }
    public String getGoodsTitle() {
        return this.goodsTitle;
    }

    public OrgAlipayTradeData setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public OrgAlipayTradeData setNetMdiscount(String netMdiscount) {
        this.netMdiscount = netMdiscount;
        return this;
    }
    public String getNetMdiscount() {
        return this.netMdiscount;
    }

    public OrgAlipayTradeData setOtherAccount(String otherAccount) {
        this.otherAccount = otherAccount;
        return this;
    }
    public String getOtherAccount() {
        return this.otherAccount;
    }

    public OrgAlipayTradeData setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public OrgAlipayTradeData setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
        return this;
    }
    public String getServiceFee() {
        return this.serviceFee;
    }

    public OrgAlipayTradeData setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public OrgAlipayTradeData setStoreNo(String storeNo) {
        this.storeNo = storeNo;
        return this;
    }
    public String getStoreNo() {
        return this.storeNo;
    }

    public OrgAlipayTradeData setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public OrgAlipayTradeData setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public OrgAlipayTradeData setTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public String getTradeType() {
        return this.tradeType;
    }

}
