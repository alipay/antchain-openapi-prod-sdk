// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryGdStoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 查询店铺基本信息请求体
    @NameInMap("gd_customer_flow")
    @Validation(required = true)
    public GdCustomerFlow gdCustomerFlow;

    public static QueryGdStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGdStoreRequest self = new QueryGdStoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryGdStoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGdStoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGdStoreRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGdStoreRequest setGdCustomerFlow(GdCustomerFlow gdCustomerFlow) {
        this.gdCustomerFlow = gdCustomerFlow;
        return this;
    }
    public GdCustomerFlow getGdCustomerFlow() {
        return this.gdCustomerFlow;
    }

}
