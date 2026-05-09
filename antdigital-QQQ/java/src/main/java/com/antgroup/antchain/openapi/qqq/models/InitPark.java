// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class InitPark extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("demo")
    @Validation(required = true)
    public String demo;

    public static InitPark build(java.util.Map<String, ?> map) throws Exception {
        InitPark self = new InitPark();
        return TeaModel.build(map, self);
    }

    public InitPark setDemo(String demo) {
        this.demo = demo;
        return this;
    }
    public String getDemo() {
        return this.demo;
    }

}
