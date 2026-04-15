// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Identity extends TeaModel {
    // ak
    /**
     * <strong>example:</strong>
     * <p>test_0efe42463f8f</p>
     */
    @NameInMap("ak")
    @Validation(required = true)
    public String ak;

    public static Identity build(java.util.Map<String, ?> map) throws Exception {
        Identity self = new Identity();
        return TeaModel.build(map, self);
    }

    public Identity setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

}
