// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproducta.models;

import com.aliyun.tea.*;

public class TestTeee extends TeaModel {
    // a
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("a")
    @Validation(required = true)
    public String a;

    // b
    /**
     * <strong>example:</strong>
     * <p>b</p>
     */
    @NameInMap("b")
    @Validation(required = true)
    public String b;

    public static TestTeee build(java.util.Map<String, ?> map) throws Exception {
        TestTeee self = new TestTeee();
        return TeaModel.build(map, self);
    }

    public TestTeee setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

    public TestTeee setB(String b) {
        this.b = b;
        return this;
    }
    public String getB() {
        return this.b;
    }

}
