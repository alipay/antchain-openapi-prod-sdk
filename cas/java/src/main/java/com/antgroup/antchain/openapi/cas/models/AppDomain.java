// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppDomain extends TeaModel {
    // 创建人id
    @NameInMap("creator_id")
    public String creatorId;

    // id
    @NameInMap("id")
    public String id;

    // 名称
    @NameInMap("name")
    public String name;

    // parentId
    @NameInMap("parent_id")
    public String parentId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // toRootPath
    @NameInMap("to_root_path")
    public String toRootPath;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static AppDomain build(java.util.Map<String, ?> map) throws Exception {
        AppDomain self = new AppDomain();
        return TeaModel.build(map, self);
    }

    public AppDomain setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public AppDomain setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppDomain setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public AppDomain setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppDomain setToRootPath(String toRootPath) {
        this.toRootPath = toRootPath;
        return this;
    }
    public String getToRootPath() {
        return this.toRootPath;
    }

    public AppDomain setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppDomain setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
