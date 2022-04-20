// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryClusterNativepodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码--应用名
    @NameInMap("product_app")
    public String productApp;

    // 租户信息
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryClusterNativepodRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterNativepodRequest self = new QueryClusterNativepodRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterNativepodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryClusterNativepodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryClusterNativepodRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryClusterNativepodRequest setProductApp(String productApp) {
        this.productApp = productApp;
        return this;
    }
    public String getProductApp() {
        return this.productApp;
    }

    public QueryClusterNativepodRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
