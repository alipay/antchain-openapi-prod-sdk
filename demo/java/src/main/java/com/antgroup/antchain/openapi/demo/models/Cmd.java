// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Cmd extends TeaModel {
    // cmd编码
    @NameInMap("cmd_code")
    @Validation(required = true)
    public String cmdCode;

    // 版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static Cmd build(java.util.Map<String, ?> map) throws Exception {
        Cmd self = new Cmd();
        return TeaModel.build(map, self);
    }

    public Cmd setCmdCode(String cmdCode) {
        this.cmdCode = cmdCode;
        return this;
    }
    public String getCmdCode() {
        return this.cmdCode;
    }

    public Cmd setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
