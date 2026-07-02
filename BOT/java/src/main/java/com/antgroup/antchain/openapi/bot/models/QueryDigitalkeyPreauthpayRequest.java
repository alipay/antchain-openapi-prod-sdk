// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyPreauthpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户的授权资金订单号。 
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    public static QueryDigitalkeyPreauthpayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyPreauthpayRequest self = new QueryDigitalkeyPreauthpayRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyPreauthpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyPreauthpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyPreauthpayRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

}
