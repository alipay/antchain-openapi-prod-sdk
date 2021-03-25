// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class DelegateRelationInfo extends TeaModel {
    // 被授权的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 被代理的租户ID
    @NameInMap("delegated_tenant_id")
    @Validation(required = true)
    public String delegatedTenantId;

    // 更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    // 扩展字段
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    public static DelegateRelationInfo build(java.util.Map<String, ?> map) throws Exception {
        DelegateRelationInfo self = new DelegateRelationInfo();
        return TeaModel.build(map, self);
    }

    public DelegateRelationInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DelegateRelationInfo setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public DelegateRelationInfo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DelegateRelationInfo setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DelegateRelationInfo setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
