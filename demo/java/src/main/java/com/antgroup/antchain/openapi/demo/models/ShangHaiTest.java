// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ShangHaiTest extends TeaModel {
    // string
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("param_1")
    public String param1;

    // number
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("param_2")
    public Long param2;

    public static ShangHaiTest build(java.util.Map<String, ?> map) throws Exception {
        ShangHaiTest self = new ShangHaiTest();
        return TeaModel.build(map, self);
    }

    public ShangHaiTest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

    public ShangHaiTest setParam2(Long param2) {
        this.param2 = param2;
        return this;
    }
    public Long getParam2() {
        return this.param2;
    }

}
