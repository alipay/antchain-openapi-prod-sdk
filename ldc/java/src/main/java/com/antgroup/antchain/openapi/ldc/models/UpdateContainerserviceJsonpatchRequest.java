// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceJsonpatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 必填：保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 应用服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用服务版本，不传取最新的版本
    @NameInMap("revision")
    public String revision;

    // 操作人账号
    @NameInMap("operator")
    public String operator;

    // json patch 内容
    @NameInMap("json_patches")
    @Validation(required = true)
    public java.util.List<JsonPatch> jsonPatches;

    // 配置为CLOUD_NATIVE_GROUP_RELEASE会自动创建发布单
    @NameInMap("ops_type")
    public String opsType;

    // 发布单类型，SLS_CHANGE代表只做sls配置变更
    @NameInMap("ops_mode")
    public String opsMode;

    // 部署策略
    @NameInMap("deploy_config")
    public DeployConfig deployConfig;

    // 是否自动执行发布单，默认 true
    @NameInMap("is_auto_execute")
    public Boolean isAutoExecute;

    // 灰度平台pods分批序列化为json的结果	
    // 
    @NameInMap("graycore_batches")
    public String graycoreBatches;

    // [huanyu场景使用]huanyu变更单id
    @NameInMap("huanyu_exec_no")
    public String huanyuExecNo;

    public static UpdateContainerserviceJsonpatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceJsonpatchRequest self = new UpdateContainerserviceJsonpatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceJsonpatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceJsonpatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContainerserviceJsonpatchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceJsonpatchRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceJsonpatchRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateContainerserviceJsonpatchRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceJsonpatchRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateContainerserviceJsonpatchRequest setJsonPatches(java.util.List<JsonPatch> jsonPatches) {
        this.jsonPatches = jsonPatches;
        return this;
    }
    public java.util.List<JsonPatch> getJsonPatches() {
        return this.jsonPatches;
    }

    public UpdateContainerserviceJsonpatchRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public UpdateContainerserviceJsonpatchRequest setOpsMode(String opsMode) {
        this.opsMode = opsMode;
        return this;
    }
    public String getOpsMode() {
        return this.opsMode;
    }

    public UpdateContainerserviceJsonpatchRequest setDeployConfig(DeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public UpdateContainerserviceJsonpatchRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public UpdateContainerserviceJsonpatchRequest setGraycoreBatches(String graycoreBatches) {
        this.graycoreBatches = graycoreBatches;
        return this;
    }
    public String getGraycoreBatches() {
        return this.graycoreBatches;
    }

    public UpdateContainerserviceJsonpatchRequest setHuanyuExecNo(String huanyuExecNo) {
        this.huanyuExecNo = huanyuExecNo;
        return this;
    }
    public String getHuanyuExecNo() {
        return this.huanyuExecNo;
    }

}
