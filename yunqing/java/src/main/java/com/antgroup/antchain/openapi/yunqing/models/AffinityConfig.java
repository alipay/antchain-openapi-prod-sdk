// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AffinityConfig extends TeaModel {
    // 尽量满足的应用列表
    @NameInMap("preferred")
    public java.util.List<String> preferred;

    // 必须满足的应用列表
    @NameInMap("required")
    public java.util.List<String> required;

    public static AffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        AffinityConfig self = new AffinityConfig();
        return TeaModel.build(map, self);
    }

    public AffinityConfig setPreferred(java.util.List<String> preferred) {
        this.preferred = preferred;
        return this;
    }
    public java.util.List<String> getPreferred() {
        return this.preferred;
    }

    public AffinityConfig setRequired(java.util.List<String> required) {
        this.required = required;
        return this;
    }
    public java.util.List<String> getRequired() {
        return this.required;
    }

}
