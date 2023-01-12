// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsCommand extends TeaModel {
    // ID
    @NameInMap("id")
    public String id;

    // 描述
    @NameInMap("description")
    public String description;

    // 工作空间id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 创建者
    @NameInMap("creator")
    public String creator;

    // 执行账户
    @NameInMap("execute_ccount")
    public String executeCcount;

    // 模板类型
    @NameInMap("command_type")
    public String commandType;

    // 命令
    @NameInMap("full_command")
    public String fullCommand;

    // 脚本
    @NameInMap("script")
    public String script;

    // 参数
    @NameInMap("params")
    public String params;

    // 重试次数
    @NameInMap("retry_times")
    public Long retryTimes;

    // 延迟间隔
    @NameInMap("backoff_period")
    public Long backoffPeriod;

    // 超时时间
    @NameInMap("timeout")
    public Long timeout;

    public static OpsCommand build(java.util.Map<String, ?> map) throws Exception {
        OpsCommand self = new OpsCommand();
        return TeaModel.build(map, self);
    }

    public OpsCommand setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsCommand setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpsCommand setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OpsCommand setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpsCommand setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public OpsCommand setExecuteCcount(String executeCcount) {
        this.executeCcount = executeCcount;
        return this;
    }
    public String getExecuteCcount() {
        return this.executeCcount;
    }

    public OpsCommand setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public OpsCommand setFullCommand(String fullCommand) {
        this.fullCommand = fullCommand;
        return this;
    }
    public String getFullCommand() {
        return this.fullCommand;
    }

    public OpsCommand setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public OpsCommand setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public OpsCommand setRetryTimes(Long retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Long getRetryTimes() {
        return this.retryTimes;
    }

    public OpsCommand setBackoffPeriod(Long backoffPeriod) {
        this.backoffPeriod = backoffPeriod;
        return this;
    }
    public Long getBackoffPeriod() {
        return this.backoffPeriod;
    }

    public OpsCommand setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
