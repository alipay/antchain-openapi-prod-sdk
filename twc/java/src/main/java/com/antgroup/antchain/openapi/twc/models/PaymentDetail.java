// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PaymentDetail extends TeaModel {
    // 业务自定义扣款id，长度不能超过64
    @NameInMap("biz_trade_id")
    @Validation(required = true)
    public String bizTradeId;

    // 扣款期数
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 支付金额，单位：分
    @NameInMap("pay_money")
    @Validation(required = true)
    public Long payMoney;

    // 计划扣款时间，格式"yyyy-MM-dd HH:mm:ss"
    @NameInMap("pay_date")
    @Validation(required = true)
    public String payDate;

    public static PaymentDetail build(java.util.Map<String, ?> map) throws Exception {
        PaymentDetail self = new PaymentDetail();
        return TeaModel.build(map, self);
    }

    public PaymentDetail setBizTradeId(String bizTradeId) {
        this.bizTradeId = bizTradeId;
        return this;
    }
    public String getBizTradeId() {
        return this.bizTradeId;
    }

    public PaymentDetail setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public PaymentDetail setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public PaymentDetail setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

}
