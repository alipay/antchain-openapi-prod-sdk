// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryClusterKubeconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境变量
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    public static QueryClusterKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterKubeconfigRequest self = new QueryClusterKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterKubeconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryClusterKubeconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryClusterKubeconfigRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
