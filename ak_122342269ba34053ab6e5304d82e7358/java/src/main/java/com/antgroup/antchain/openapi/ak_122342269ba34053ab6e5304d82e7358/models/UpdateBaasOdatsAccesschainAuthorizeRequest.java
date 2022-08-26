// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class UpdateBaasOdatsAccesschainAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权关系id
    @NameInMap("acl_id")
    @Validation(required = true)
    public String aclId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 授权资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    public static UpdateBaasOdatsAccesschainAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasOdatsAccesschainAuthorizeRequest self = new UpdateBaasOdatsAccesschainAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasOdatsAccesschainAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasOdatsAccesschainAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasOdatsAccesschainAuthorizeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public UpdateBaasOdatsAccesschainAuthorizeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBaasOdatsAccesschainAuthorizeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
