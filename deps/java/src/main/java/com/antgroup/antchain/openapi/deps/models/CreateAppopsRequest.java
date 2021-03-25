// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppopsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 执行运维操作的目标应用名称列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个应用，使用如下形式：applications.1.name=myapp1&applications.2.name=myapp2
    @NameInMap("applications")
    public java.util.List<Application> applications;

    // 是否启用自动运维，默认为**False**
    @NameInMap("auto_execute")
    public Boolean autoExecute;

    // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    public java.util.List<Computer> computers;

    // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源。
    //                         部署静态资源需传入 ops_action_params 为("default_execute_account", "resource_download_url", "resource_target_file")
    //                         
    @NameInMap("ops_action")
    @Validation(required = true)
    public String opsAction;

    // ops_action 所需要的参数，以JSON格式传入。以 {"param_name": "param_value"} 定义JSON。
    @NameInMap("ops_action_params")
    public String opsActionParams;

    // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
    @NameInMap("ops_dimension")
    @Validation(required = true)
    public String opsDimension;

    // 运维单标题。长度不超过50个UTF-8字符
    @NameInMap("title")
    @Validation(required = true)
    public String title;

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

    public CreateAppopsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateAppopsRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public CreateAppopsRequest setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

    public CreateAppopsRequest setComputers(java.util.List<Computer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<Computer> getComputers() {
        return this.computers;
    }

    public CreateAppopsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public CreateAppopsRequest setOpsActionParams(String opsActionParams) {
        this.opsActionParams = opsActionParams;
        return this;
    }
    public String getOpsActionParams() {
        return this.opsActionParams;
    }

    public CreateAppopsRequest setOpsDimension(String opsDimension) {
        this.opsDimension = opsDimension;
        return this;
    }
    public String getOpsDimension() {
        return this.opsDimension;
    }

    public CreateAppopsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
