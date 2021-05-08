// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("authorized_identity")
    @Validation(required = true)
    public String authorizedIdentity;

    // 分配code
    // 
    // 
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 扩展信息
    @NameInMap("extend_params")
    @Validation(required = true)
    public String extendParams;

    // 标的物
    // 
    // 
    @NameInMap("target_code")
    @Validation(required = true)
    public String targetCode;

    // 请求流水号幂等标示
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static QueryAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRequest self = new QueryAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public QueryAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public QueryAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public QueryAuthRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public QueryAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public QueryAuthRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
