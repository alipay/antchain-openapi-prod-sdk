// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsActionWithCommand extends TeaModel {
    // 动作类型
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    // ops_command
    @NameInMap("ops_command")
    public OpsCommand opsCommand;

    // command_template_id
    @NameInMap("command_template_id")
    public String commandTemplateId;

    // origin_params_definition
    @NameInMap("origin_params_definition")
    public String originParamsDefinition;

    public static OpsActionWithCommand build(java.util.Map<String, ?> map) throws Exception {
        OpsActionWithCommand self = new OpsActionWithCommand();
        return TeaModel.build(map, self);
    }

    public OpsActionWithCommand setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public OpsActionWithCommand setOpsCommand(OpsCommand opsCommand) {
        this.opsCommand = opsCommand;
        return this;
    }
    public OpsCommand getOpsCommand() {
        return this.opsCommand;
    }

    public OpsActionWithCommand setCommandTemplateId(String commandTemplateId) {
        this.commandTemplateId = commandTemplateId;
        return this;
    }
    public String getCommandTemplateId() {
        return this.commandTemplateId;
    }

    public OpsActionWithCommand setOriginParamsDefinition(String originParamsDefinition) {
        this.originParamsDefinition = originParamsDefinition;
        return this;
    }
    public String getOriginParamsDefinition() {
        return this.originParamsDefinition;
    }

}
