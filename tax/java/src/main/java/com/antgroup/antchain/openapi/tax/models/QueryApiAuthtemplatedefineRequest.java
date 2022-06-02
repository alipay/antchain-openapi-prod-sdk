// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthtemplatedefineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // message：短信
    // qrCode：二维码
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    // 依赖的数据值 比如身份证
    @NameInMap("depends_value")
    @Validation(required = true)
    public String dependsValue;

    public static QueryApiAuthtemplatedefineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthtemplatedefineRequest self = new QueryApiAuthtemplatedefineRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthtemplatedefineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiAuthtemplatedefineRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiAuthtemplatedefineRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryApiAuthtemplatedefineRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public QueryApiAuthtemplatedefineRequest setDependsValue(String dependsValue) {
        this.dependsValue = dependsValue;
        return this;
    }
    public String getDependsValue() {
        return this.dependsValue;
    }

}
