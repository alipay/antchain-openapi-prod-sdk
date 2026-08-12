// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class StructL extends TeaModel {
    // paramb
    /**
     * <strong>example:</strong>
     * <p>paramb</p>
     */
    @NameInMap("paramb")
    @Validation(required = true)
    public String paramb;

    public static StructL build(java.util.Map<String, ?> map) throws Exception {
        StructL self = new StructL();
        return TeaModel.build(map, self);
    }

    public StructL setParamb(String paramb) {
        this.paramb = paramb;
        return this;
    }
    public String getParamb() {
        return this.paramb;
    }

}
