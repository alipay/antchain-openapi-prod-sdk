// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RepayAuthEquityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益开通时ISV返回的业务订单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 需要退款的交易订单号(权益扣款成功后回调消息返回的交易号)
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    public static RepayAuthEquityRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayAuthEquityRequest self = new RepayAuthEquityRequest();
        return TeaModel.build(map, self);
    }

    public RepayAuthEquityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayAuthEquityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayAuthEquityRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public RepayAuthEquityRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
