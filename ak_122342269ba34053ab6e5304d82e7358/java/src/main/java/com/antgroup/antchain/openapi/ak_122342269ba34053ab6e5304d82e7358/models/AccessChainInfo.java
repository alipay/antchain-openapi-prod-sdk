// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class AccessChainInfo extends TeaModel {
    // 授权访问链关系ID
    @NameInMap("acl_id")
    @Validation(required = true)
    public String aclId;

    // 详细描述
    @NameInMap("description")
    public String description;

    // 关系创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 被授权的链的链域名
    @NameInMap("grant_domain")
    @Validation(required = true)
    public String grantDomain;

    // 授权链链域名
    @NameInMap("owner_domain")
    @Validation(required = true)
    public String ownerDomain;

    // 授权可以访问的数据类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    public static AccessChainInfo build(java.util.Map<String, ?> map) throws Exception {
        AccessChainInfo self = new AccessChainInfo();
        return TeaModel.build(map, self);
    }

    public AccessChainInfo setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AccessChainInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AccessChainInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AccessChainInfo setGrantDomain(String grantDomain) {
        this.grantDomain = grantDomain;
        return this;
    }
    public String getGrantDomain() {
        return this.grantDomain;
    }

    public AccessChainInfo setOwnerDomain(String ownerDomain) {
        this.ownerDomain = ownerDomain;
        return this;
    }
    public String getOwnerDomain() {
        return this.ownerDomain;
    }

    public AccessChainInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
