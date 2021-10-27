// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款ID，用户调用退款接口时传入的自定义第三方id
    @NameInMap("refund_id")
    @Validation(required = true)
    public String refundId;

    public static QueryContractRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractRefundRequest self = new QueryContractRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractRefundRequest setRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    public String getRefundId() {
        return this.refundId;
    }

}
