// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestStruct extends TeaModel {
    // x
    /**
     * <strong>example:</strong>
     * <p>x</p>
     */
    @NameInMap("x")
    @Validation(required = true)
    public String x;

    // y
    /**
     * <strong>example:</strong>
     * <p>y</p>
     */
    @NameInMap("y")
    @Validation(required = true)
    public DemoClass y;

    // z
    @NameInMap("z")
    @Validation(required = true)
    public java.util.List<DemoClass> z;

    public static TestStruct build(java.util.Map<String, ?> map) throws Exception {
        TestStruct self = new TestStruct();
        return TeaModel.build(map, self);
    }

    public TestStruct setX(String x) {
        this.x = x;
        return this;
    }
    public String getX() {
        return this.x;
    }

    public TestStruct setY(DemoClass y) {
        this.y = y;
        return this;
    }
    public DemoClass getY() {
        return this.y;
    }

    public TestStruct setZ(java.util.List<DemoClass> z) {
        this.z = z;
        return this;
    }
    public java.util.List<DemoClass> getZ() {
        return this.z;
    }

}
