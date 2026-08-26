// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class SaveGwchildinsurancePlanningtargetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户标识，沿用已发布 Profile API 的租户校验。
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static SaveGwchildinsurancePlanningtargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGwchildinsurancePlanningtargetsRequest self = new SaveGwchildinsurancePlanningtargetsRequest();
        return TeaModel.build(map, self);
    }

    public SaveGwchildinsurancePlanningtargetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveGwchildinsurancePlanningtargetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveGwchildinsurancePlanningtargetsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGwchildinsurancePlanningtargetsRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
