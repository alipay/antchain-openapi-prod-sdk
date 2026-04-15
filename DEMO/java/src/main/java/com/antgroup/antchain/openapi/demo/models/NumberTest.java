// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class NumberTest extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parameter_1")
    @Validation(required = true, maximum = 5, minimum = 1)
    public Long parameter1;

    // 2
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("parameter_2")
    @Validation(required = true, maximum = 5, minimum = 1)
    public Long parameter2;

    // 3
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("parameter_3")
    @Validation(required = true, maximum = 5, minimum = 1)
    public Long parameter3;

    // 4
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("parameter_4")
    @Validation(required = true, maximum = 5, minimum = 1)
    public Long parameter4;

    // 5
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("parameter_5")
    @Validation(required = true)
    public DemoClass parameter5;

    public static NumberTest build(java.util.Map<String, ?> map) throws Exception {
        NumberTest self = new NumberTest();
        return TeaModel.build(map, self);
    }

    public NumberTest setParameter1(Long parameter1) {
        this.parameter1 = parameter1;
        return this;
    }
    public Long getParameter1() {
        return this.parameter1;
    }

    public NumberTest setParameter2(Long parameter2) {
        this.parameter2 = parameter2;
        return this;
    }
    public Long getParameter2() {
        return this.parameter2;
    }

    public NumberTest setParameter3(Long parameter3) {
        this.parameter3 = parameter3;
        return this;
    }
    public Long getParameter3() {
        return this.parameter3;
    }

    public NumberTest setParameter4(Long parameter4) {
        this.parameter4 = parameter4;
        return this;
    }
    public Long getParameter4() {
        return this.parameter4;
    }

    public NumberTest setParameter5(DemoClass parameter5) {
        this.parameter5 = parameter5;
        return this;
    }
    public DemoClass getParameter5() {
        return this.parameter5;
    }

}
