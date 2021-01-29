// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SyncexecuteCmdTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
    @NameInMap("cmd")
    @Validation(required = true)
    public OpsCmd cmd;

    // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    @Validation(required = true)
    public java.util.List<OpsComputer> computers;

    public static SyncexecuteCmdTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncexecuteCmdTaskRequest self = new SyncexecuteCmdTaskRequest();
        return TeaModel.build(map, self);
    }

    public SyncexecuteCmdTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncexecuteCmdTaskRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SyncexecuteCmdTaskRequest setCmd(OpsCmd cmd) {
        this.cmd = cmd;
        return this;
    }
    public OpsCmd getCmd() {
        return this.cmd;
    }

    public SyncexecuteCmdTaskRequest setComputers(java.util.List<OpsComputer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<OpsComputer> getComputers() {
        return this.computers;
    }

}
