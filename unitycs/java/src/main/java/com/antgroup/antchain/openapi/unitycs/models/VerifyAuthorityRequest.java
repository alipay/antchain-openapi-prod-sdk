// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class VerifyAuthorityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元数据编码
    @NameInMap("metadata_code")
    @Validation(required = true)
    public String metadataCode;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户权限，默认值为USAGE_RIGHT
    @NameInMap("privilege")
    public String privilege;

    public static VerifyAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthorityRequest self = new VerifyAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAuthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAuthorityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAuthorityRequest setMetadataCode(String metadataCode) {
        this.metadataCode = metadataCode;
        return this;
    }
    public String getMetadataCode() {
        return this.metadataCode;
    }

    public VerifyAuthorityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyAuthorityRequest setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

}
