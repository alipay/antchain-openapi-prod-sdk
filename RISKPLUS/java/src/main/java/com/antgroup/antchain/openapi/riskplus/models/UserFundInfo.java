// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UserFundInfo extends TeaModel {
    // 业务订单号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 关联交易单号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 订单支付金额，单位：元
    /**
     * <strong>example:</strong>
     * <p>199.68</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 金额明细
    @NameInMap("details")
    @Validation(required = true)
    public java.util.List<FundItemDetail> details;

    public static UserFundInfo build(java.util.Map<String, ?> map) throws Exception {
        UserFundInfo self = new UserFundInfo();
        return TeaModel.build(map, self);
    }

    public UserFundInfo setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public UserFundInfo setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public UserFundInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public UserFundInfo setDetails(java.util.List<FundItemDetail> details) {
        this.details = details;
        return this;
    }
    public java.util.List<FundItemDetail> getDetails() {
        return this.details;
    }

}
