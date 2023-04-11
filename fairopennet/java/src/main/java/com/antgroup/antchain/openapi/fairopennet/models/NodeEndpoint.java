// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class NodeEndpoint extends TeaModel {
    //  
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    //  
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    public static NodeEndpoint build(java.util.Map<String, ?> map) throws Exception {
        NodeEndpoint self = new NodeEndpoint();
        return TeaModel.build(map, self);
    }

    public NodeEndpoint setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public NodeEndpoint setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
