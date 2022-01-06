// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyProtocolModel extends TeaModel {
    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 协议
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    public static TransparentProxyProtocolModel build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyProtocolModel self = new TransparentProxyProtocolModel();
        return TeaModel.build(map, self);
    }

    public TransparentProxyProtocolModel setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public TransparentProxyProtocolModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
