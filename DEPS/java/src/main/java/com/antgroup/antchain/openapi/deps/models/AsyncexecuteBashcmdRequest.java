// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AsyncexecuteBashcmdRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 执行的命令，长度不能超过500个字符
    @NameInMap("command")
    public String command;

    // 执行指令的目标机器id列表。n代表第n个机器，n从1开始，最大50。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    @NameInMap("computers")
    public java.util.List<Computer> computers;

    // 单次执行的超时时间，单位为秒。最大值为1800秒，默认值也为1800秒
    @NameInMap("time_out")
    public Integer timeOut;

    // 机器上执行命令的用户,比如：root,admin
    @NameInMap("user")
    public String user;

    public static AsyncexecuteBashcmdRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncexecuteBashcmdRequest self = new AsyncexecuteBashcmdRequest();
        return TeaModel.build(map, self);
    }

    public AsyncexecuteBashcmdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsyncexecuteBashcmdRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public AsyncexecuteBashcmdRequest setComputers(java.util.List<Computer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<Computer> getComputers() {
        return this.computers;
    }

    public AsyncexecuteBashcmdRequest setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public Integer getTimeOut() {
        return this.timeOut;
    }

    public AsyncexecuteBashcmdRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
