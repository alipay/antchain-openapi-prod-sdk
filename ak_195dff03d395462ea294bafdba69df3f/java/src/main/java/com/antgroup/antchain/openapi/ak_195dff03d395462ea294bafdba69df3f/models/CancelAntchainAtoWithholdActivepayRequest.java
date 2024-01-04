// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CancelAntchainAtoWithholdActivepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 第几期
    @NameInMap("period_num")
    @Validation(required = true)
    public Long periodNum;

    // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
    @NameInMap("trade_no")
    public String tradeNo;

    public static CancelAntchainAtoWithholdActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAntchainAtoWithholdActivepayRequest self = new CancelAntchainAtoWithholdActivepayRequest();
        return TeaModel.build(map, self);
    }

    public CancelAntchainAtoWithholdActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAntchainAtoWithholdActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAntchainAtoWithholdActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelAntchainAtoWithholdActivepayRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public CancelAntchainAtoWithholdActivepayRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
