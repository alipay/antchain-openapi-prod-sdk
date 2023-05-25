// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RuntimeStrategy extends TeaModel {
    // 安全webshell配置
    @NameInMap("webshell")
    public Boolean webshell;

    // 提权保护配置
    @NameInMap("privilege")
    public Boolean privilege;

    // 是否打开
    @NameInMap("enable")
    public Boolean enable;

    public static RuntimeStrategy build(java.util.Map<String, ?> map) throws Exception {
        RuntimeStrategy self = new RuntimeStrategy();
        return TeaModel.build(map, self);
    }

    public RuntimeStrategy setWebshell(Boolean webshell) {
        this.webshell = webshell;
        return this;
    }
    public Boolean getWebshell() {
        return this.webshell;
    }

    public RuntimeStrategy setPrivilege(Boolean privilege) {
        this.privilege = privilege;
        return this;
    }
    public Boolean getPrivilege() {
        return this.privilege;
    }

    public RuntimeStrategy setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
