// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class UpdateBaasOdatsCrosschaimAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待更新授权关系ID
    @NameInMap("acl_id")
    @Validation(required = true)
    public String aclId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 被授权合约链上地址
    @NameInMap("grant_identity")
    @Validation(required = true)
    public String grantIdentity;

    public static UpdateBaasOdatsCrosschaimAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasOdatsCrosschaimAuthorizeRequest self = new UpdateBaasOdatsCrosschaimAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasOdatsCrosschaimAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasOdatsCrosschaimAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasOdatsCrosschaimAuthorizeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public UpdateBaasOdatsCrosschaimAuthorizeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBaasOdatsCrosschaimAuthorizeRequest setGrantIdentity(String grantIdentity) {
        this.grantIdentity = grantIdentity;
        return this;
    }
    public String getGrantIdentity() {
        return this.grantIdentity;
    }

}
