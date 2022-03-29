// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class FolderDO extends TeaModel {
    // 文件夹ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 文件夹名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 父目录 ID
    @NameInMap("parent_folder_id")
    @Validation(required = true)
    public String parentFolderId;

    // 排序号
    @NameInMap("sort_index")
    public String sortIndex;

    // 监控租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 监控工作空间 ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 创建者
    @NameInMap("creater")
    @Validation(required = true)
    public String creater;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 修改者
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    // 是否告警
    @NameInMap("alarmed")
    @Validation(required = true)
    public Boolean alarmed;

    // 是否置顶
    @NameInMap("top")
    @Validation(required = true)
    public Boolean top;

    public static FolderDO build(java.util.Map<String, ?> map) throws Exception {
        FolderDO self = new FolderDO();
        return TeaModel.build(map, self);
    }

    public FolderDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public FolderDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FolderDO setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public FolderDO setSortIndex(String sortIndex) {
        this.sortIndex = sortIndex;
        return this;
    }
    public String getSortIndex() {
        return this.sortIndex;
    }

    public FolderDO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public FolderDO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public FolderDO setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public FolderDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public FolderDO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public FolderDO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public FolderDO setAlarmed(Boolean alarmed) {
        this.alarmed = alarmed;
        return this;
    }
    public Boolean getAlarmed() {
        return this.alarmed;
    }

    public FolderDO setTop(Boolean top) {
        this.top = top;
        return this;
    }
    public Boolean getTop() {
        return this.top;
    }

}
