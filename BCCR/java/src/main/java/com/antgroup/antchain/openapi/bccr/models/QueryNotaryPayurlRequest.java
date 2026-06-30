// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryPayurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("notary_order_id")
    @Validation(required = true)
    public String notaryOrderId;

    public static QueryNotaryPayurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryPayurlRequest self = new QueryNotaryPayurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryPayurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryPayurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryPayurlRequest setNotaryOrderId(String notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public String getNotaryOrderId() {
        return this.notaryOrderId;
    }

}
