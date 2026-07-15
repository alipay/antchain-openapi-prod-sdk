// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitPrivatecontractIntanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有化服务地址（可不上传，后续通过更新实例信息的接口进行服务地址填充）
    @NameInMap("service_url")
    public String serviceUrl;

    // 开通服务的用户租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static InitPrivatecontractIntanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitPrivatecontractIntanceRequest self = new InitPrivatecontractIntanceRequest();
        return TeaModel.build(map, self);
    }

    public InitPrivatecontractIntanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitPrivatecontractIntanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitPrivatecontractIntanceRequest setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }
    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public InitPrivatecontractIntanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
