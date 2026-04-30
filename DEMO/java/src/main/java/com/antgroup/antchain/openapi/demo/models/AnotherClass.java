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

    // 列表引用Struct
    @NameInMap("refList")
    public java.util.List<DemoClass> refList;

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

    public AnotherClass setRefList(java.util.List<DemoClass> refList) {
        this.refList = refList;
        return this;
    }
    public java.util.List<DemoClass> getRefList() {
        return this.refList;
    }

}
