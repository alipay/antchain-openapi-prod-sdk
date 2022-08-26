// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsAccesschainAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 被授权链domain
    @NameInMap("grant_domain")
    @Validation(required = true)
    public String grantDomain;

    // 授权链域名
    @NameInMap("owner_domain")
    @Validation(required = true)
    public String ownerDomain;

    // 资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    public static StartBaasOdatsAccesschainAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsAccesschainAuthorizeRequest self = new StartBaasOdatsAccesschainAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setGrantDomain(String grantDomain) {
        this.grantDomain = grantDomain;
        return this;
    }
    public String getGrantDomain() {
        return this.grantDomain;
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setOwnerDomain(String ownerDomain) {
        this.ownerDomain = ownerDomain;
        return this;
    }
    public String getOwnerDomain() {
        return this.ownerDomain;
    }

    public StartBaasOdatsAccesschainAuthorizeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
