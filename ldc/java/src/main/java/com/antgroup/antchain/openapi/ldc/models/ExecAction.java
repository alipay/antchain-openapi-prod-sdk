// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecAction extends TeaModel {
    // 执行健康检查的命令。
    @NameInMap("command")
    @Validation(required = true)
    public String command;

    public static ExecAction build(java.util.Map<String, ?> map) throws Exception {
        ExecAction self = new ExecAction();
        return TeaModel.build(map, self);
    }

    public ExecAction setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

}
