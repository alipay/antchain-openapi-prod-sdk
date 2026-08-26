// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class SaveGwchildinsuranceSolutionkycRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户标识；当前联调必须命中 finaigateway 发布白名单
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 当前业务请求对象的 JSON 字符串
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static SaveGwchildinsuranceSolutionkycRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGwchildinsuranceSolutionkycRequest self = new SaveGwchildinsuranceSolutionkycRequest();
        return TeaModel.build(map, self);
    }

    public SaveGwchildinsuranceSolutionkycRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveGwchildinsuranceSolutionkycRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveGwchildinsuranceSolutionkycRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGwchildinsuranceSolutionkycRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
