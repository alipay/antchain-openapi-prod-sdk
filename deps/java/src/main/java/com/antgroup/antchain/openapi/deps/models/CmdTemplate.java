// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CmdTemplate extends TeaModel {
    // 指令模板定义的参数名称。比如：./install_env.sh --version 2.2，其中的 --version 就是参数名称（没有用到）
    @NameInMap("arg_names")
    public java.util.List<String> argNames;

    // 指令模板内容，可以为一个简单命令，也可是一个自定义脚本
    @NameInMap("content")
    public String content;

    // 指令模板创建者，通常为改用户注册蚂蚁金融云的email
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 指令模板描述
    @NameInMap("description")
    public String description;

    // 在机器上执行该指令的账号，比如：root, admin
    @NameInMap("execute_account")
    public String executeAccount;

    // 指令模板ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 指令名称
    @NameInMap("name")
    public String name;

    // 失败重试的间隔，单位为秒
    @NameInMap("retry_interval")
    public Long retryInterval;

    // 失败重试次数
    @NameInMap("retry_times")
    public Long retryTimes;

    // 单次执行的超时时间，单位为秒
    @NameInMap("time_out")
    public Long timeOut;

    // 模板类型。目前取值列表：
    //                     SIMPLE_COMMAND：简单指令类型；
    //                     CUSTOM_SHELL_SCRIPT：用户自定义shell脚本
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 脚本内容
    @NameInMap("script")
    public String script;

    // 指令模板id，genTimeSeriesId
    @NameInMap("template_id")
    public String templateId;

    // 默认参数
    @NameInMap("argument")
    public String argument;

    // 脚本参数（json 字符串）
    @NameInMap("params")
    public String params;

    // 模板版本
    @NameInMap("template_version")
    public Long templateVersion;

    // 模板类型
    @NameInMap("template_type")
    public String templateType;

    public static CmdTemplate build(java.util.Map<String, ?> map) throws Exception {
        CmdTemplate self = new CmdTemplate();
        return TeaModel.build(map, self);
    }

    public CmdTemplate setArgNames(java.util.List<String> argNames) {
        this.argNames = argNames;
        return this;
    }
    public java.util.List<String> getArgNames() {
        return this.argNames;
    }

    public CmdTemplate setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CmdTemplate setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CmdTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CmdTemplate setExecuteAccount(String executeAccount) {
        this.executeAccount = executeAccount;
        return this;
    }
    public String getExecuteAccount() {
        return this.executeAccount;
    }

    public CmdTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CmdTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CmdTemplate setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public CmdTemplate setRetryTimes(Long retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Long getRetryTimes() {
        return this.retryTimes;
    }

    public CmdTemplate setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public Long getTimeOut() {
        return this.timeOut;
    }

    public CmdTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CmdTemplate setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public CmdTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CmdTemplate setArgument(String argument) {
        this.argument = argument;
        return this;
    }
    public String getArgument() {
        return this.argument;
    }

    public CmdTemplate setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CmdTemplate setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public CmdTemplate setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
