// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestDemo extends TeaModel {
    // id
    @NameInMap("demo")
    @Validation(required = true)
    public String demo;

    public static TestDemo build(java.util.Map<String, ?> map) throws Exception {
        TestDemo self = new TestDemo();
        return TeaModel.build(map, self);
    }

    public TestDemo setDemo(String demo) {
        this.demo = demo;
        return this;
    }
    public String getDemo() {
        return this.demo;
    }

}
