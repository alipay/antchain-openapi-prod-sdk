// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class TCP extends TeaModel {
    // tcp port
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    public static TCP build(java.util.Map<String, ?> map) throws Exception {
        TCP self = new TCP();
        return TeaModel.build(map, self);
    }

    public TCP setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
