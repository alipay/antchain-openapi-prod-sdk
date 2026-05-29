// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestParams extends TeaModel {
    // a
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("parameter")
    public TestParamA parameter;

    // string
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("string")
    public String string;

    public static TestParams build(java.util.Map<String, ?> map) throws Exception {
        TestParams self = new TestParams();
        return TeaModel.build(map, self);
    }

    public TestParams setParameter(TestParamA parameter) {
        this.parameter = parameter;
        return this;
    }
    public TestParamA getParameter() {
        return this.parameter;
    }

    public TestParams setString(String string) {
        this.string = string;
        return this;
    }
    public String getString() {
        return this.string;
    }

}
