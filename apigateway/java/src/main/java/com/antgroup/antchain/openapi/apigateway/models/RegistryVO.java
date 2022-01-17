// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RegistryVO extends TeaModel {
    // host
    @NameInMap("host")
    public String host;

    // protocol_support
    @NameInMap("protocol_support")
    public java.util.List<ProtocolVO> protocolSupport;

    // 注册中心类型
    @NameInMap("type")
    public String type;

    public static RegistryVO build(java.util.Map<String, ?> map) throws Exception {
        RegistryVO self = new RegistryVO();
        return TeaModel.build(map, self);
    }

    public RegistryVO setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public RegistryVO setProtocolSupport(java.util.List<ProtocolVO> protocolSupport) {
        this.protocolSupport = protocolSupport;
        return this;
    }
    public java.util.List<ProtocolVO> getProtocolSupport() {
        return this.protocolSupport;
    }

    public RegistryVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
