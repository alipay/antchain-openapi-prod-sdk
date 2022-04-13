// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OBTenant extends TeaModel {
    // 租户描述
    @NameInMap("description")
    public String description;

    // 扩展属性，序列化后的JSON字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    // 唯一标识
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 租户类型（单库GZONE|分片库RZONE）：存放对应业务库
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 租户对应uid分段，用于存放对应的业务分片库
    @NameInMap("uids")
    public java.util.List<Long> uids;

    // 工作空间组唯一标识
    @NameInMap("workspace_group_id")
    @Validation(required = true)
    public String workspaceGroupId;

    // 创建日期
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    public static OBTenant build(java.util.Map<String, ?> map) throws Exception {
        OBTenant self = new OBTenant();
        return TeaModel.build(map, self);
    }

    public OBTenant setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OBTenant setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public OBTenant setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OBTenant setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OBTenant setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OBTenant setUids(java.util.List<Long> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<Long> getUids() {
        return this.uids;
    }

    public OBTenant setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public OBTenant setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public OBTenant setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}
