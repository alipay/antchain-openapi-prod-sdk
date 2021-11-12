// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAppparamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品code
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    public static QueryAppparamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppparamRequest self = new QueryAppparamRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppparamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppparamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAppparamRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryAppparamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppparamRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
