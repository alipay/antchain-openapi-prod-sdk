// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class CrossChainInfo extends TeaModel {
    // 授权映射关系id
    @NameInMap("acl_id")
    @Validation(required = true)
    public String aclId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 授权关系创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 授权链的链域名
    @NameInMap("grant_domain")
    @Validation(required = true)
    public String grantDomain;

    // 授权合约在授权链上地址
    @NameInMap("grant_identity")
    @Validation(required = true)
    public String grantIdentity;

    // 自有链链域名
    @NameInMap("owner_domain")
    @Validation(required = true)
    public String ownerDomain;

    // 自有合约在链上地址
    @NameInMap("owner_identity")
    @Validation(required = true)
    public String ownerIdentity;

    public static CrossChainInfo build(java.util.Map<String, ?> map) throws Exception {
        CrossChainInfo self = new CrossChainInfo();
        return TeaModel.build(map, self);
    }

    public CrossChainInfo setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CrossChainInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CrossChainInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CrossChainInfo setGrantDomain(String grantDomain) {
        this.grantDomain = grantDomain;
        return this;
    }
    public String getGrantDomain() {
        return this.grantDomain;
    }

    public CrossChainInfo setGrantIdentity(String grantIdentity) {
        this.grantIdentity = grantIdentity;
        return this;
    }
    public String getGrantIdentity() {
        return this.grantIdentity;
    }

    public CrossChainInfo setOwnerDomain(String ownerDomain) {
        this.ownerDomain = ownerDomain;
        return this;
    }
    public String getOwnerDomain() {
        return this.ownerDomain;
    }

    public CrossChainInfo setOwnerIdentity(String ownerIdentity) {
        this.ownerIdentity = ownerIdentity;
        return this;
    }
    public String getOwnerIdentity() {
        return this.ownerIdentity;
    }

}
