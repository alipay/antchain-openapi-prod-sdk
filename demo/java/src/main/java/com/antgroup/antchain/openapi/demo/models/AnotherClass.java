// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class AnotherClass extends TeaModel {
    // 测试字段
    /**
     * <strong>example:</strong>
     * <p>some string</p>
     */
    @NameInMap("bar")
    @Validation(required = true)
    public String bar;

    // 引用字段
    @NameInMap("ref")
    @Validation(required = true)
    public QueryMap ref;

    public static AnotherClass build(java.util.Map<String, ?> map) throws Exception {
        AnotherClass self = new AnotherClass();
        return TeaModel.build(map, self);
    }

    public AnotherClass setBar(String bar) {
        this.bar = bar;
        return this;
    }
    public String getBar() {
        return this.bar;
    }

    public AnotherClass setRef(QueryMap ref) {
        this.ref = ref;
        return this;
    }
    public QueryMap getRef() {
        return this.ref;
    }

}
