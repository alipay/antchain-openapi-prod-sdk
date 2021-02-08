// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryTradeOrderRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 中台颁发的场景码，IP_COPYRIGHT
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 外部商户订单号，不超32位
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    public static QueryTradeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeOrderRequest self = new QueryTradeOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeOrderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryTradeOrderRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

}
