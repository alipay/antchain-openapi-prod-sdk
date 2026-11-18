// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCredentialVpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签名参数
    @NameInMap("query_string")
    @Validation(required = true)
    public String queryString;

    // 业务参数
    @NameInMap("body_json")
    @Validation(required = true)
    public String bodyJson;

    // 场景码
    @NameInMap("scene_code")
    public String sceneCode;

    public static QueryCredentialVpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCredentialVpRequest self = new QueryCredentialVpRequest();
        return TeaModel.build(map, self);
    }

    public QueryCredentialVpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCredentialVpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCredentialVpRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public QueryCredentialVpRequest setBodyJson(String bodyJson) {
        this.bodyJson = bodyJson;
        return this;
    }
    public String getBodyJson() {
        return this.bodyJson;
    }

    public QueryCredentialVpRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
