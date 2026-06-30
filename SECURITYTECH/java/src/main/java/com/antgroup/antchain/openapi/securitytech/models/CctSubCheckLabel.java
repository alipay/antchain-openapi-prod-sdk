// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CctSubCheckLabel extends TeaModel {
    // sub_label
    /**
     * <strong>example:</strong>
     * <p>sub_label</p>
     */
    @NameInMap("sub_label")
    @Validation(required = true)
    public String subLabel;

    // rate
    @NameInMap("rate")
    @Validation(required = true)
    public Long rate;

    public static CctSubCheckLabel build(java.util.Map<String, ?> map) throws Exception {
        CctSubCheckLabel self = new CctSubCheckLabel();
        return TeaModel.build(map, self);
    }

    public CctSubCheckLabel setSubLabel(String subLabel) {
        this.subLabel = subLabel;
        return this;
    }
    public String getSubLabel() {
        return this.subLabel;
    }

    public CctSubCheckLabel setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

}
