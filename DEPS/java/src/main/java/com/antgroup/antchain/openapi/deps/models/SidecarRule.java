// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarRule extends TeaModel {
    // sidecar规则描述
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreated;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // 版本实例名称
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 规则优先级
    @NameInMap("level")
    @Validation(required = true)
    public Long level;

    // scope生效范围详情
    @NameInMap("scope_detail")
    @Validation(required = true)
    public SidecarScopeDetail scopeDetail;

    // sidecar版本实例id
    @NameInMap("sidecar_version_instance_id")
    @Validation(required = true)
    public String sidecarVersionInstanceId;

    // 规则状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 发布、下线、废弃原因
    // 
    @NameInMap("status_reason")
    public String statusReason;

    public static SidecarRule build(java.util.Map<String, ?> map) throws Exception {
        SidecarRule self = new SidecarRule();
        return TeaModel.build(map, self);
    }

    public SidecarRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SidecarRule setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public SidecarRule setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SidecarRule setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SidecarRule setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SidecarRule setScopeDetail(SidecarScopeDetail scopeDetail) {
        this.scopeDetail = scopeDetail;
        return this;
    }
    public SidecarScopeDetail getScopeDetail() {
        return this.scopeDetail;
    }

    public SidecarRule setSidecarVersionInstanceId(String sidecarVersionInstanceId) {
        this.sidecarVersionInstanceId = sidecarVersionInstanceId;
        return this;
    }
    public String getSidecarVersionInstanceId() {
        return this.sidecarVersionInstanceId;
    }

    public SidecarRule setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SidecarRule setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
