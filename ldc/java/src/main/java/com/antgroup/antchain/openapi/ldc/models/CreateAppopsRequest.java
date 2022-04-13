// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 执行运维操作的目标应用列表,可通过services指定应用下待运维的应用服务实例. 如果要指定多个应用, 使用如下形式: applications.1.name=app1&applications.2.name=app2&applications.2.services.1.name=app2-sv1&applications.2.services.1.workspace=shdev
    @NameInMap("applications")
    public java.util.List<Application> applications;

    // 是否自动执行运维单, 默认为false.当设置为true是,创建完成并初始化成功后会自动执行该运维单.
    @NameInMap("auto_execution")
    public Boolean autoExecution;

    // 执行运维操作的目标机器id列表。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    public java.util.List<String> computers;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
    @NameInMap("ops_action")
    @Validation(required = true)
    public String opsAction;

    // 执行ops_action所需要的参数。
    @NameInMap("ops_action_params")
    public java.util.List<OpsParam> opsActionParams;

    // 应用运维的维度，有两种取值：APPLICATION和MACHINE。设置为APPLICATION，表示在非应用服务环境下该应用执行该应用运维操作；设置为MACHINE，表示应用下的一台或多台机器执行该应用运维操作。
    @NameInMap("ops_demension")
    @Validation(required = true)
    public String opsDemension;

    // 应用运维单标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // Map<String, String> 序列化后字符串
    @NameInMap("context")
    public String context;

    // 机器分组策略，默认采用快速分组
    // QUICK         -     快速分组
    // ALL_ONE    - 共分一组
    // EACH_ONE - 每台一组
    // 
    @NameInMap("group_strategy")
    public String groupStrategy;

    public static CreateAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppopsRequest self = new CreateAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppopsRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public CreateAppopsRequest setAutoExecution(Boolean autoExecution) {
        this.autoExecution = autoExecution;
        return this;
    }
    public Boolean getAutoExecution() {
        return this.autoExecution;
    }

    public CreateAppopsRequest setComputers(java.util.List<String> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<String> getComputers() {
        return this.computers;
    }

    public CreateAppopsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public CreateAppopsRequest setOpsActionParams(java.util.List<OpsParam> opsActionParams) {
        this.opsActionParams = opsActionParams;
        return this;
    }
    public java.util.List<OpsParam> getOpsActionParams() {
        return this.opsActionParams;
    }

    public CreateAppopsRequest setOpsDemension(String opsDemension) {
        this.opsDemension = opsDemension;
        return this;
    }
    public String getOpsDemension() {
        return this.opsDemension;
    }

    public CreateAppopsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateAppopsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateAppopsRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateAppopsRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

}
