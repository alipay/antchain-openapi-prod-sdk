// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ProtocolVO extends TeaModel {
    // 协议类型
    @NameInMap("protocol")
    public String protocol;

    // 端口
    @NameInMap("port")
    public String port;

    public static ProtocolVO build(java.util.Map<String, ?> map) throws Exception {
        ProtocolVO self = new ProtocolVO();
        return TeaModel.build(map, self);
    }

    public ProtocolVO setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ProtocolVO setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
