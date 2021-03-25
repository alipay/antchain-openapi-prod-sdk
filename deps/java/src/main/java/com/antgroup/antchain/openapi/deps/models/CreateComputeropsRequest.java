// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateComputeropsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 执行的指令列表。n代表第n个指令，n从1开始，最大20。示例如下：cmds.1.template_id=000015678&cmds.1.args.1.name=--version&cmds.1.args.1.value=2.2&cmds.2.template_id=000015688
    @NameInMap("cmds")
    public java.util.List<OpsCmd> cmds;

    // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    public java.util.List<Computer> computers;

    // 运维单标题。长度不超过50个UTF-8字符
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static CreateComputeropsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeropsRequest self = new CreateComputeropsRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateComputeropsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateComputeropsRequest setCmds(java.util.List<OpsCmd> cmds) {
        this.cmds = cmds;
        return this;
    }
    public java.util.List<OpsCmd> getCmds() {
        return this.cmds;
    }

    public CreateComputeropsRequest setComputers(java.util.List<Computer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<Computer> getComputers() {
        return this.computers;
    }

    public CreateComputeropsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
