// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboPriceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐付款金额
    @NameInMap("combo_pay_amount")
    public String comboPayAmount;

    // 套餐优惠金额
    @NameInMap("combo_coupon_amount")
    public String comboCouponAmount;

    // 套餐折扣金额
    @NameInMap("combo_discount_amount")
    public String comboDiscountAmount;

    // 套餐原始金额
    @NameInMap("combo_original_amount")
    public String comboOriginalAmount;

    // 币种，元：CNY
    @NameInMap("currency")
    public String currency;

    // 商品询价明细
    @NameInMap("commodity_enquiry_prices")
    public java.util.List<CommodityEnquiryPrice> commodityEnquiryPrices;

    public static QueryComboPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComboPriceResponse self = new QueryComboPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryComboPriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComboPriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComboPriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComboPriceResponse setComboPayAmount(String comboPayAmount) {
        this.comboPayAmount = comboPayAmount;
        return this;
    }
    public String getComboPayAmount() {
        return this.comboPayAmount;
    }

    public QueryComboPriceResponse setComboCouponAmount(String comboCouponAmount) {
        this.comboCouponAmount = comboCouponAmount;
        return this;
    }
    public String getComboCouponAmount() {
        return this.comboCouponAmount;
    }

    public QueryComboPriceResponse setComboDiscountAmount(String comboDiscountAmount) {
        this.comboDiscountAmount = comboDiscountAmount;
        return this;
    }
    public String getComboDiscountAmount() {
        return this.comboDiscountAmount;
    }

    public QueryComboPriceResponse setComboOriginalAmount(String comboOriginalAmount) {
        this.comboOriginalAmount = comboOriginalAmount;
        return this;
    }
    public String getComboOriginalAmount() {
        return this.comboOriginalAmount;
    }

    public QueryComboPriceResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryComboPriceResponse setCommodityEnquiryPrices(java.util.List<CommodityEnquiryPrice> commodityEnquiryPrices) {
        this.commodityEnquiryPrices = commodityEnquiryPrices;
        return this;
    }
    public java.util.List<CommodityEnquiryPrice> getCommodityEnquiryPrices() {
        return this.commodityEnquiryPrices;
    }

}
