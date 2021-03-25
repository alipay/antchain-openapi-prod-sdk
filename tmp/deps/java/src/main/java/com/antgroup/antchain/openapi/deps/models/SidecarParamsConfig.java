// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarParamsConfig extends TeaModel {
    // 类型：默认、透明劫持
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 环境参数内容
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static SidecarParamsConfig build(java.util.Map<String, ?> map) throws Exception {
        SidecarParamsConfig self = new SidecarParamsConfig();
        return TeaModel.build(map, self);
    }

    public SidecarParamsConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SidecarParamsConfig setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
