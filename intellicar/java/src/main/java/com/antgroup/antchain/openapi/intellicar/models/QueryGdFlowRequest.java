// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryGdFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 实际请求体
    @NameInMap("gd_customer_flow")
    @Validation(required = true)
    public GdCustomerFlow gdCustomerFlow;

    public static QueryGdFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGdFlowRequest self = new QueryGdFlowRequest();
        return TeaModel.build(map, self);
    }

    public QueryGdFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGdFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGdFlowRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGdFlowRequest setGdCustomerFlow(GdCustomerFlow gdCustomerFlow) {
        this.gdCustomerFlow = gdCustomerFlow;
        return this;
    }
    public GdCustomerFlow getGdCustomerFlow() {
        return this.gdCustomerFlow;
    }

}
