// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryGdPoentialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 潜客指数接口请求体
    @NameInMap("gd_customer_flow")
    @Validation(required = true)
    public GdCustomerFlow gdCustomerFlow;

    public static QueryGdPoentialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGdPoentialRequest self = new QueryGdPoentialRequest();
        return TeaModel.build(map, self);
    }

    public QueryGdPoentialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGdPoentialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGdPoentialRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGdPoentialRequest setGdCustomerFlow(GdCustomerFlow gdCustomerFlow) {
        this.gdCustomerFlow = gdCustomerFlow;
        return this;
    }
    public GdCustomerFlow getGdCustomerFlow() {
        return this.gdCustomerFlow;
    }

}
