// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AsyncexecuteCmdTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
    @NameInMap("cmd")
    public OpsCmd cmd;

    // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    public java.util.List<OpsComputer> computers;

    public static AsyncexecuteCmdTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncexecuteCmdTaskRequest self = new AsyncexecuteCmdTaskRequest();
        return TeaModel.build(map, self);
    }

    public AsyncexecuteCmdTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsyncexecuteCmdTaskRequest setCmd(OpsCmd cmd) {
        this.cmd = cmd;
        return this;
    }
    public OpsCmd getCmd() {
        return this.cmd;
    }

    public AsyncexecuteCmdTaskRequest setComputers(java.util.List<OpsComputer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<OpsComputer> getComputers() {
        return this.computers;
    }

}
