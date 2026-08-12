// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcDemoStruct extends TeaModel {
    // 字符串属性
    /**
     * <strong>example:</strong>
     * <p>str</p>
     */
    @NameInMap("some_string")
    public String someString;

    public static AbcDemoStruct build(java.util.Map<String, ?> map) throws Exception {
        AbcDemoStruct self = new AbcDemoStruct();
        return TeaModel.build(map, self);
    }

    public AbcDemoStruct setSomeString(String someString) {
        this.someString = someString;
        return this;
    }
    public String getSomeString() {
        return this.someString;
    }

}
