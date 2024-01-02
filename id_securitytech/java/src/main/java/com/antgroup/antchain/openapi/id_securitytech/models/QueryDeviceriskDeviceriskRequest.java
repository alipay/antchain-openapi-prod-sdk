// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.id_securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceriskDeviceriskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // apdid_token
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    // client_id
    @NameInMap("client_id")
    public String clientId;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // env_id
    @NameInMap("env_id")
    public String envId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // merchant_id
    @NameInMap("merchant_id")
    public String merchantId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // terminal_type
    @NameInMap("terminal_type")
    public String terminalType;

    public static QueryDeviceriskDeviceriskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceriskDeviceriskRequest self = new QueryDeviceriskDeviceriskRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceriskDeviceriskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceriskDeviceriskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceriskDeviceriskRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryDeviceriskDeviceriskRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryDeviceriskDeviceriskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryDeviceriskDeviceriskRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public QueryDeviceriskDeviceriskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDeviceriskDeviceriskRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryDeviceriskDeviceriskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDeviceriskDeviceriskRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
