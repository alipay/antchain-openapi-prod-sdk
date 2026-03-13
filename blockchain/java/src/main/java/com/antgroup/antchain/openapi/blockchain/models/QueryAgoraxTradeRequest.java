// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户编号
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 商户订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    public static QueryAgoraxTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxTradeRequest self = new QueryAgoraxTradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgoraxTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgoraxTradeRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryAgoraxTradeRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryAgoraxTradeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
