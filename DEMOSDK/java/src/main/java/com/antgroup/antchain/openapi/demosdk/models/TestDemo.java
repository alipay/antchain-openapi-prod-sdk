// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestDemo extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 1
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("number")
    public Long number;

    public static TestDemo build(java.util.Map<String, ?> map) throws Exception {
        TestDemo self = new TestDemo();
        return TeaModel.build(map, self);
    }

    public TestDemo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TestDemo setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

}
