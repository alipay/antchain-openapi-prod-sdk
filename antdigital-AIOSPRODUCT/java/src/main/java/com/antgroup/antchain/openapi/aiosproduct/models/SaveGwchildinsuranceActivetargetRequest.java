// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class SaveGwchildinsuranceActivetargetRequest extends TeaModel {
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

    public static SaveGwchildinsuranceActivetargetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGwchildinsuranceActivetargetRequest self = new SaveGwchildinsuranceActivetargetRequest();
        return TeaModel.build(map, self);
    }

    public SaveGwchildinsuranceActivetargetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveGwchildinsuranceActivetargetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveGwchildinsuranceActivetargetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGwchildinsuranceActivetargetRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
