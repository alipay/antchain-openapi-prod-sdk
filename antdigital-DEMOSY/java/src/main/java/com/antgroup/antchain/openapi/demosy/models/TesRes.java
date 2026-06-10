// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosy.models;

import com.aliyun.tea.*;

public class TesRes extends TeaModel {
    // 证件号
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("idcard")
    @Validation(required = true)
    public String idcard;

    public static TesRes build(java.util.Map<String, ?> map) throws Exception {
        TesRes self = new TesRes();
        return TeaModel.build(map, self);
    }

    public TesRes setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

}
