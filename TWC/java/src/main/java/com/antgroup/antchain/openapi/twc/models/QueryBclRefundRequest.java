// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款接口返回的退款id
    @NameInMap("refund_id")
    @Validation(required = true, maxLength = 64, minLength = 16)
    public String refundId;

    public static QueryBclRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBclRefundRequest self = new QueryBclRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryBclRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBclRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBclRefundRequest setRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    public String getRefundId() {
        return this.refundId;
    }

}
