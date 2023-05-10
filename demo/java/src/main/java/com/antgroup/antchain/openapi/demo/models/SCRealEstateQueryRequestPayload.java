// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryRequestPayload extends TeaModel {
    // xm
    @NameInMap("xm")
    @Validation(required = true)
    public String xm;

    // sfz
    @NameInMap("sfz")
    @Validation(required = true)
    public String sfz;

    public static SCRealEstateQueryRequestPayload build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryRequestPayload self = new SCRealEstateQueryRequestPayload();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryRequestPayload setXm(String xm) {
        this.xm = xm;
        return this;
    }
    public String getXm() {
        return this.xm;
    }

    public SCRealEstateQueryRequestPayload setSfz(String sfz) {
        this.sfz = sfz;
        return this;
    }
    public String getSfz() {
        return this.sfz;
    }

}
