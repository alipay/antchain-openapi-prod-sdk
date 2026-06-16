// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestDemo extends TeaModel {
    // a
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("timeout")
    public String timeout;

    public static TestDemo build(java.util.Map<String, ?> map) throws Exception {
        TestDemo self = new TestDemo();
        return TeaModel.build(map, self);
    }

    public TestDemo setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
