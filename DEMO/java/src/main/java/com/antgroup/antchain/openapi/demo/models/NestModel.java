// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class NestModel extends TeaModel {
    // aaaa
    /**
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("a")
    @Validation(required = true)
    public String a;

    public static NestModel build(java.util.Map<String, ?> map) throws Exception {
        NestModel self = new NestModel();
        return TeaModel.build(map, self);
    }

    public NestModel setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

}
