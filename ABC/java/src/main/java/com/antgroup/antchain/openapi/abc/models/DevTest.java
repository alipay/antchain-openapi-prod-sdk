// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class DevTest extends TeaModel {
    // 超时时间
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static DevTest build(java.util.Map<String, ?> map) throws Exception {
        DevTest self = new DevTest();
        return TeaModel.build(map, self);
    }

    public DevTest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
