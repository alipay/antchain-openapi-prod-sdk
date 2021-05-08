// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryAuthOwnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 被授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("authorized_identity")
    public String authorizedIdentity;

    // 分配code
    // 
    // 
    @NameInMap("authorized_platform_identity")
    @Validation(required = true)
    public String authorizedPlatformIdentity;

    // 标的物
    // 
    // 
    @NameInMap("target_code")
    public String targetCode;

    // 扩展字段
    // 
    // 
    @NameInMap("extend_params")
    public String extendParams;

    // "1", "授权激活状态"
    // "2", "授权取消"
    // "3", "授权过期"
    @NameInMap("auth_state")
    @Validation(required = true)
    public String authState;

    public static QueryAuthOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthOwnerRequest self = new QueryAuthOwnerRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthOwnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthOwnerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthOwnerRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public QueryAuthOwnerRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public QueryAuthOwnerRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public QueryAuthOwnerRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public QueryAuthOwnerRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public QueryAuthOwnerRequest setAuthState(String authState) {
        this.authState = authState;
        return this;
    }
    public String getAuthState() {
        return this.authState;
    }

}
