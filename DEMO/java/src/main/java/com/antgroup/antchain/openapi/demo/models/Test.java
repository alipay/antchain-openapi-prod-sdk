// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Test extends TeaModel {
    // d
    /**
     * <strong>example:</strong>
     * <p>d</p>
     */
    @NameInMap("a")
    @Validation(required = true)
    public String a;

    public static Test build(java.util.Map<String, ?> map) throws Exception {
        Test self = new Test();
        return TeaModel.build(map, self);
    }

    public Test setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

}
