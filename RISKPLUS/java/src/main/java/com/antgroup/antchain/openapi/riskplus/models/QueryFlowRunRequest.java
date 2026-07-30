// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFlowRunRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建 Flow Run 时传入的业务订单号，必须唯一，用于定位本次执行。
    @NameInMap("client_order_no")
    @Validation(required = true)
    public String clientOrderNo;

    public static QueryFlowRunRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowRunRequest self = new QueryFlowRunRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowRunRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowRunRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFlowRunRequest setClientOrderNo(String clientOrderNo) {
        this.clientOrderNo = clientOrderNo;
        return this;
    }
    public String getClientOrderNo() {
        return this.clientOrderNo;
    }

}
