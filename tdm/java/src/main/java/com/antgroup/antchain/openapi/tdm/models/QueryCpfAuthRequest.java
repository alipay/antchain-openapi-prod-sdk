// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryCpfAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 被授权机构ID
    @NameInMap("authorized_identity")
    public String authorizedIdentity;

    // 端ID
    @NameInMap("authorized_platform_identity")
    public String authorizedPlatformIdentity;

    // 标的产品码
    @NameInMap("target_code")
    public String targetCode;

    // 扩展字段
    @NameInMap("extend_params")
    public String extendParams;

    // 授权状态
    @NameInMap("auth_state")
    @Validation(required = true)
    public String authState;

    public static QueryCpfAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCpfAuthRequest self = new QueryCpfAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryCpfAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCpfAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCpfAuthRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public QueryCpfAuthRequest setAuthorizedIdentity(String authorizedIdentity) {
        this.authorizedIdentity = authorizedIdentity;
        return this;
    }
    public String getAuthorizedIdentity() {
        return this.authorizedIdentity;
    }

    public QueryCpfAuthRequest setAuthorizedPlatformIdentity(String authorizedPlatformIdentity) {
        this.authorizedPlatformIdentity = authorizedPlatformIdentity;
        return this;
    }
    public String getAuthorizedPlatformIdentity() {
        return this.authorizedPlatformIdentity;
    }

    public QueryCpfAuthRequest setTargetCode(String targetCode) {
        this.targetCode = targetCode;
        return this;
    }
    public String getTargetCode() {
        return this.targetCode;
    }

    public QueryCpfAuthRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public QueryCpfAuthRequest setAuthState(String authState) {
        this.authState = authState;
        return this;
    }
    public String getAuthState() {
        return this.authState;
    }

}
