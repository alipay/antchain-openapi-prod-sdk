// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class GetUserCurrentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 不传默认是 BASE_INFO
    // BASE_INFO 基本信息
    // ORG_CERT_FILE 企业图片
    // LP_CERT_FILE 法人图片
    @NameInMap("query_options")
    public java.util.List<String> queryOptions;

    // 企业用户userId
    @NameInMap("firm_user_id")
    public Long firmUserId;

    public static GetUserCurrentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCurrentRequest self = new GetUserCurrentRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCurrentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUserCurrentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetUserCurrentRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public GetUserCurrentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetUserCurrentRequest setQueryOptions(java.util.List<String> queryOptions) {
        this.queryOptions = queryOptions;
        return this;
    }
    public java.util.List<String> getQueryOptions() {
        return this.queryOptions;
    }

    public GetUserCurrentRequest setFirmUserId(Long firmUserId) {
        this.firmUserId = firmUserId;
        return this;
    }
    public Long getFirmUserId() {
        return this.firmUserId;
    }

}
