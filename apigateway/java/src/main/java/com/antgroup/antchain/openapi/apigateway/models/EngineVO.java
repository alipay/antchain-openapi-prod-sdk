// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class EngineVO extends TeaModel {
    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 流程编排标识
    @NameInMap("template_id")
    public String templateId;

    // 内嵌模式、云端模式
    @NameInMap("engine_type")
    public String engineType;

    // add_request
    @NameInMap("add_request")
    public Boolean addRequest;

    // add_timestamp
    @NameInMap("add_timestamp")
    public Boolean addTimestamp;

    // save_to_db
    @NameInMap("save_to_db")
    public Boolean saveToDb;

    // 流程编排  （内嵌模式）初始化的入参
    @NameInMap("params")
    public String params;

    public static EngineVO build(java.util.Map<String, ?> map) throws Exception {
        EngineVO self = new EngineVO();
        return TeaModel.build(map, self);
    }

    public EngineVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EngineVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public EngineVO setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EngineVO setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public EngineVO setAddRequest(Boolean addRequest) {
        this.addRequest = addRequest;
        return this;
    }
    public Boolean getAddRequest() {
        return this.addRequest;
    }

    public EngineVO setAddTimestamp(Boolean addTimestamp) {
        this.addTimestamp = addTimestamp;
        return this;
    }
    public Boolean getAddTimestamp() {
        return this.addTimestamp;
    }

    public EngineVO setSaveToDb(Boolean saveToDb) {
        this.saveToDb = saveToDb;
        return this;
    }
    public Boolean getSaveToDb() {
        return this.saveToDb;
    }

    public EngineVO setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
