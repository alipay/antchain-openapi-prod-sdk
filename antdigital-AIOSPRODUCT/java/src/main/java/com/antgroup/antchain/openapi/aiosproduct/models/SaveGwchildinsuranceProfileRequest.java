// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class SaveGwchildinsuranceProfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 仅供 finaigateway 白名单校验和建立租户 Header，转发前删除
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求参数
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static SaveGwchildinsuranceProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGwchildinsuranceProfileRequest self = new SaveGwchildinsuranceProfileRequest();
        return TeaModel.build(map, self);
    }

    public SaveGwchildinsuranceProfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveGwchildinsuranceProfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveGwchildinsuranceProfileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGwchildinsuranceProfileRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
