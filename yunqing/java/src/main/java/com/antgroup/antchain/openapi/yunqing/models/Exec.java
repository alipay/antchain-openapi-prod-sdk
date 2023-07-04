// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Exec extends TeaModel {
    // args
    @NameInMap("args")
    @Validation(required = true)
    public java.util.List<String> args;

    // cmd
    @NameInMap("cmd")
    @Validation(required = true)
    public String cmd;

    public static Exec build(java.util.Map<String, ?> map) throws Exception {
        Exec self = new Exec();
        return TeaModel.build(map, self);
    }

    public Exec setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public Exec setCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }
    public String getCmd() {
        return this.cmd;
    }

}
