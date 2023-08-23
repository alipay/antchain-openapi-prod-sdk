// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryDeepsecTsbmrqRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用来源
    @NameInMap("app_id")
    public String appId;

    // 环境id
    @NameInMap("env_id")
    public String envId;

    // request id
    @NameInMap("request_id")
    public String requestId;

    // 租户
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 应用来源名称, 也被用作渠道名称
    @NameInMap("app_name")
    public String appName;

    // 是否测试流量, 测试流量会在处理过程中有特殊处理
    @NameInMap("test_flow")
    public Boolean testFlow;

    // apdidToken
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    public static QueryDeepsecTsbmrqRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepsecTsbmrqRequest self = new QueryDeepsecTsbmrqRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeepsecTsbmrqRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeepsecTsbmrqRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeepsecTsbmrqRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryDeepsecTsbmrqRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryDeepsecTsbmrqRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeepsecTsbmrqRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDeepsecTsbmrqRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryDeepsecTsbmrqRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDeepsecTsbmrqRequest setTestFlow(Boolean testFlow) {
        this.testFlow = testFlow;
        return this;
    }
    public Boolean getTestFlow() {
        return this.testFlow;
    }

    public QueryDeepsecTsbmrqRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

}
