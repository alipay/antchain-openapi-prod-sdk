// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryCyclinginsuranceOrderdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 请求方应用名
    @NameInMap("caller_app_name")
    @Validation(required = true)
    public String callerAppName;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryCyclinginsuranceOrderdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCyclinginsuranceOrderdetailRequest self = new QueryCyclinginsuranceOrderdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCyclinginsuranceOrderdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCyclinginsuranceOrderdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCyclinginsuranceOrderdetailRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryCyclinginsuranceOrderdetailRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCyclinginsuranceOrderdetailRequest setCallerAppName(String callerAppName) {
        this.callerAppName = callerAppName;
        return this;
    }
    public String getCallerAppName() {
        return this.callerAppName;
    }

    public QueryCyclinginsuranceOrderdetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
