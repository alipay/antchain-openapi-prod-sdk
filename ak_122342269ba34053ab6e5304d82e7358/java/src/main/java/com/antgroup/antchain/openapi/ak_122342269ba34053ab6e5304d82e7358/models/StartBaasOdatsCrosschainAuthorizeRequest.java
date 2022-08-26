// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsCrosschainAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 被授权链域名
    @NameInMap("grant_domain")
    @Validation(required = true)
    public String grantDomain;

    // 被授权合约链上地址
    @NameInMap("grant_identity")
    @Validation(required = true)
    public String grantIdentity;

    // 授权链的链域名
    @NameInMap("owner_domain")
    @Validation(required = true)
    public String ownerDomain;

    // 授权合约链上地址
    @NameInMap("owner_identity")
    @Validation(required = true)
    public String ownerIdentity;

    public static StartBaasOdatsCrosschainAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsCrosschainAuthorizeRequest self = new StartBaasOdatsCrosschainAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setGrantDomain(String grantDomain) {
        this.grantDomain = grantDomain;
        return this;
    }
    public String getGrantDomain() {
        return this.grantDomain;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setGrantIdentity(String grantIdentity) {
        this.grantIdentity = grantIdentity;
        return this;
    }
    public String getGrantIdentity() {
        return this.grantIdentity;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setOwnerDomain(String ownerDomain) {
        this.ownerDomain = ownerDomain;
        return this;
    }
    public String getOwnerDomain() {
        return this.ownerDomain;
    }

    public StartBaasOdatsCrosschainAuthorizeRequest setOwnerIdentity(String ownerIdentity) {
        this.ownerIdentity = ownerIdentity;
        return this;
    }
    public String getOwnerIdentity() {
        return this.ownerIdentity;
    }

}
