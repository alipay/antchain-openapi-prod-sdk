// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class DemoT extends TeaModel {
    // 1
    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("timeout")
    public String timeout;

    public static DemoT build(java.util.Map<String, ?> map) throws Exception {
        DemoT self = new DemoT();
        return TeaModel.build(map, self);
    }

    public DemoT setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
