// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdksy.models;

import com.aliyun.tea.*;

public class TessReq extends TeaModel {
    // 证件号
    @NameInMap("idcard")
    @Validation(required = true)
    public String idcard;

    public static TessReq build(java.util.Map<String, ?> map) throws Exception {
        TessReq self = new TessReq();
        return TeaModel.build(map, self);
    }

    public TessReq setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

}
