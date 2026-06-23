// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Btest extends TeaModel {
    // atest
    /**
     * <strong>example:</strong>
     * <p>atest</p>
     */
    @NameInMap("atest")
    @Validation(required = true)
    public ATest atest;

    public static Btest build(java.util.Map<String, ?> map) throws Exception {
        Btest self = new Btest();
        return TeaModel.build(map, self);
    }

    public Btest setAtest(ATest atest) {
        this.atest = atest;
        return this;
    }
    public ATest getAtest() {
        return this.atest;
    }

}
