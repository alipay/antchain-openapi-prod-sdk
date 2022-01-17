// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineDefVO extends TeaModel {
    // 	
    // api数
    @NameInMap("api_count")
    public Long apiCount;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // can_delete
    @NameInMap("can_delete")
    public Boolean canDelete;

    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // type
    @NameInMap("type")
    public String type;

    // comment
    @NameInMap("comment")
    public String comment;

    // ver
    @NameInMap("ver")
    public String ver;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // status
    @NameInMap("status")
    public String status;

    // recover_strategy
    @NameInMap("recover_strategy")
    public String recoverStrategy;

    // content
    @NameInMap("content")
    public String content;

    // machine_status
    @NameInMap("machine_status")
    public String machineStatus;

    // field_mapping
    @NameInMap("field_mapping")
    public String fieldMapping;

    public static ApiflowMachineDefVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineDefVO self = new ApiflowMachineDefVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineDefVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ApiflowMachineDefVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiflowMachineDefVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiflowMachineDefVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApiflowMachineDefVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ApiflowMachineDefVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ApiflowMachineDefVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiflowMachineDefVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApiflowMachineDefVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiflowMachineDefVO setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ApiflowMachineDefVO setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public ApiflowMachineDefVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiflowMachineDefVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiflowMachineDefVO setRecoverStrategy(String recoverStrategy) {
        this.recoverStrategy = recoverStrategy;
        return this;
    }
    public String getRecoverStrategy() {
        return this.recoverStrategy;
    }

    public ApiflowMachineDefVO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApiflowMachineDefVO setMachineStatus(String machineStatus) {
        this.machineStatus = machineStatus;
        return this;
    }
    public String getMachineStatus() {
        return this.machineStatus;
    }

    public ApiflowMachineDefVO setFieldMapping(String fieldMapping) {
        this.fieldMapping = fieldMapping;
        return this;
    }
    public String getFieldMapping() {
        return this.fieldMapping;
    }

}
