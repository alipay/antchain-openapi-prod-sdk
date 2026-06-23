// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ATest extends TeaModel {
    // cc
    /**
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("datay")
    public String datay;

    public static ATest build(java.util.Map<String, ?> map) throws Exception {
        ATest self = new ATest();
        return TeaModel.build(map, self);
    }

    public ATest setDatay(String datay) {
        this.datay = datay;
        return this;
    }
    public String getDatay() {
        return this.datay;
    }

}
