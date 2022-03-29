// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpsFilter extends TeaModel {
    // black
    @NameInMap("black")
    @Validation(required = true)
    public Boolean black;

    // names
    @NameInMap("names")
    @Validation(required = true)
    public java.util.List<String> names;

    public static OpsFilter build(java.util.Map<String, ?> map) throws Exception {
        OpsFilter self = new OpsFilter();
        return TeaModel.build(map, self);
    }

    public OpsFilter setBlack(Boolean black) {
        this.black = black;
        return this;
    }
    public Boolean getBlack() {
        return this.black;
    }

    public OpsFilter setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

}
