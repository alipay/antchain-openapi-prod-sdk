// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class ResolveGwchildinsuranceOptionalresponsibilityplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前联调租户；必须精确命中 finaigateway 发布白名单
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 输入参数
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static ResolveGwchildinsuranceOptionalresponsibilityplanRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveGwchildinsuranceOptionalresponsibilityplanRequest self = new ResolveGwchildinsuranceOptionalresponsibilityplanRequest();
        return TeaModel.build(map, self);
    }

    public ResolveGwchildinsuranceOptionalresponsibilityplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResolveGwchildinsuranceOptionalresponsibilityplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResolveGwchildinsuranceOptionalresponsibilityplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResolveGwchildinsuranceOptionalresponsibilityplanRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
