// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyWithholdpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 20150320010101001
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    public static QueryDigitalkeyWithholdpayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyWithholdpayRequest self = new QueryDigitalkeyWithholdpayRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyWithholdpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyWithholdpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyWithholdpayRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

}
