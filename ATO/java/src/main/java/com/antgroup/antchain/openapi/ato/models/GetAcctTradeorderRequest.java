// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetAcctTradeorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签约单号，长度大于6小于50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 交易订单号，长度大于6小于50
    @NameInMap("acct_trade_order_id")
    @Validation(required = true)
    public String acctTradeOrderId;

    public static GetAcctTradeorderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAcctTradeorderRequest self = new GetAcctTradeorderRequest();
        return TeaModel.build(map, self);
    }

    public GetAcctTradeorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAcctTradeorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAcctTradeorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAcctTradeorderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public GetAcctTradeorderRequest setAcctTradeOrderId(String acctTradeOrderId) {
        this.acctTradeOrderId = acctTradeOrderId;
        return this;
    }
    public String getAcctTradeOrderId() {
        return this.acctTradeOrderId;
    }

}
