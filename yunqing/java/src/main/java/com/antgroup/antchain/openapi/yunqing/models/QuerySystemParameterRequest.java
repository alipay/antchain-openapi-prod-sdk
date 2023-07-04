// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QuerySystemParameterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境ids
    @NameInMap("env_ids")
    @Validation(required = true)
    public String envIds;

    // 参数名s
    @NameInMap("types")
    public String types;

    public static QuerySystemParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemParameterRequest self = new QuerySystemParameterRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemParameterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySystemParameterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySystemParameterRequest setEnvIds(String envIds) {
        this.envIds = envIds;
        return this;
    }
    public String getEnvIds() {
        return this.envIds;
    }

    public QuerySystemParameterRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
