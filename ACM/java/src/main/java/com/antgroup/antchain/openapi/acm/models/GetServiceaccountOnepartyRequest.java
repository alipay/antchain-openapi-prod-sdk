// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetServiceaccountOnepartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // accessKey
    @NameInMap("iam_access_key")
    public String iamAccessKey;

    // 用户id（服务账号）。和iam_access_key参数二选一
    @NameInMap("user_id")
    public String userId;

    public static GetServiceaccountOnepartyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceaccountOnepartyRequest self = new GetServiceaccountOnepartyRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceaccountOnepartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetServiceaccountOnepartyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetServiceaccountOnepartyRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public GetServiceaccountOnepartyRequest setIamAccessKey(String iamAccessKey) {
        this.iamAccessKey = iamAccessKey;
        return this;
    }
    public String getIamAccessKey() {
        return this.iamAccessKey;
    }

    public GetServiceaccountOnepartyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
