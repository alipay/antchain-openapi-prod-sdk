// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class PreTestUse extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("param_1")
    @Validation(required = true)
    public String param1;

    // 11
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("param_2")
    @Validation(required = true)
    public Long param2;

    // boolean
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("param_3")
    @Validation(required = true)
    public Boolean param3;

    public static PreTestUse build(java.util.Map<String, ?> map) throws Exception {
        PreTestUse self = new PreTestUse();
        return TeaModel.build(map, self);
    }

    public PreTestUse setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

    public PreTestUse setParam2(Long param2) {
        this.param2 = param2;
        return this;
    }
    public Long getParam2() {
        return this.param2;
    }

    public PreTestUse setParam3(Boolean param3) {
        this.param3 = param3;
        return this;
    }
    public Boolean getParam3() {
        return this.param3;
    }

}
