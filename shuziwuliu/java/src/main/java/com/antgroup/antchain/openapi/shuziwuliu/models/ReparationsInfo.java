// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ReparationsInfo extends TeaModel {
    // 平台赔款支付流水号
    @NameInMap("payment_no")
    public String paymentNo;

    // 平台赔款支付金额
    @NameInMap("payment_amount")
    public String paymentAmount;

    // 平台是否放弃货物所有权。Y:是，N:否
    @NameInMap("relinquish_goods")
    public String relinquishGoods;

    // 退货本身是否高于货物本身价值。Y:是，N:否
    @NameInMap("return_over_value")
    public String returnOverValue;

    public static ReparationsInfo build(java.util.Map<String, ?> map) throws Exception {
        ReparationsInfo self = new ReparationsInfo();
        return TeaModel.build(map, self);
    }

    public ReparationsInfo setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
        return this;
    }
    public String getPaymentNo() {
        return this.paymentNo;
    }

    public ReparationsInfo setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public String getPaymentAmount() {
        return this.paymentAmount;
    }

    public ReparationsInfo setRelinquishGoods(String relinquishGoods) {
        this.relinquishGoods = relinquishGoods;
        return this;
    }
    public String getRelinquishGoods() {
        return this.relinquishGoods;
    }

    public ReparationsInfo setReturnOverValue(String returnOverValue) {
        this.returnOverValue = returnOverValue;
        return this;
    }
    public String getReturnOverValue() {
        return this.returnOverValue;
    }

}
