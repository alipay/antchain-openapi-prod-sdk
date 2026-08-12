// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class SubDemoStruct extends TeaModel {
    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // value
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // a
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("a")
    @Validation(required = true)
    public String a;

    public static SubDemoStruct build(java.util.Map<String, ?> map) throws Exception {
        SubDemoStruct self = new SubDemoStruct();
        return TeaModel.build(map, self);
    }

    public SubDemoStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubDemoStruct setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SubDemoStruct setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

}
