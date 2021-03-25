// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CmdTemplate extends TeaModel {
    // 指令模板定义的参数名称。比如：./install_env.sh --version 2.2，其中的 --version 就是参数名称
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
    @Validation(required = true)
    public String name;

    // 失败重试的间隔，单位为秒
    @NameInMap("retry_interval")
    public Integer retryInterval;

    // 失败重试次数
    @NameInMap("retry_times")
    public Integer retryTimes;

    // 单次执行的超时时间，单位为秒
    @NameInMap("time_out")
    public Integer timeOut;

    // 模板类型。目前取值列表：
    //                     SIMPLE_COMMAND：简单指令类型；
    //                     CUSTOM_SHELL_SCRIPT：用户自定义shell脚本
    @NameInMap("type")
    @Validation(required = true)
    public String type;

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

    public CmdTemplate setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CmdTemplate setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public CmdTemplate setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public Integer getTimeOut() {
        return this.timeOut;
    }

    public CmdTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
