// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XResource extends TeaModel {
    // 全球唯一标识符（32位）。
    // Update操作，必填
    // Create操作，非必填，默认不传，后端会自动生成。特殊情况可以传入，比如一些领域需要固定该UUID。
    @NameInMap("uuid")
    @Validation(maxLength = 32, minLength = 32)
    public String uuid;

    // 名称。命名规则：^[a-zA-Z\u4E00-\u9FA5][a-zA-Z0-9_-\u4E00-\u9FA5]*$$
    @NameInMap("name")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String name;

    // 描述。
    // 
    @NameInMap("description")
    @Validation(required = true, maxLength = 512, minLength = 1)
    public String description;

    // 父目录UUID。全球唯一标识符（32位）。
    // 00000000000000000000000000000000特指根目录UUID
    @NameInMap("parent_uuid")
    @Validation(required = true, maxLength = 32, minLength = 32)
    public String parentUuid;

    // 作用范围
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 是否生效。默认true
    @NameInMap("enabled")
    public Boolean enabled;

    // 是否开放。默认为false
    @NameInMap("open")
    public Boolean open;

    // 资源版本
    @NameInMap("version")
    public Long version;

    // inner tenant id
    @NameInMap("tenant_id")
    public Long tenantId;

    // inner workspace id
    @NameInMap("workspace_id")
    public Long workspaceId;

    // 创建者
    @NameInMap("created_by")
    public String createdBy;

    // unix time 秒
    @NameInMap("created_at")
    public Long createdAt;

    // 更新者
    @NameInMap("updated_by")
    public String updatedBy;

    // 更新时间
    @NameInMap("updated_at")
    public Long updatedAt;

    // 资源类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    //  
    @NameInMap("md5")
    public String md5;

    //  
    @NameInMap("priority")
    public String priority;

    //  
    @NameInMap("time_to_live")
    public String timeToLive;

    public static XResource build(java.util.Map<String, ?> map) throws Exception {
        XResource self = new XResource();
        return TeaModel.build(map, self);
    }

    public XResource setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public XResource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XResource setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public XResource setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public XResource setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public XResource setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public XResource setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public XResource setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public XResource setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public XResource setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public XResource setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public XResource setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public XResource setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public XResource setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public XResource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XResource setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public XResource setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public XResource setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }
    public String getTimeToLive() {
        return this.timeToLive;
    }

}
