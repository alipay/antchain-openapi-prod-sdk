// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyProtocolVo extends TeaModel {
    // 最大请求数
    @NameInMap("max_req")
    public Long maxReq;

    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 协议
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    public static TransparentProxyProtocolVo build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyProtocolVo self = new TransparentProxyProtocolVo();
        return TeaModel.build(map, self);
    }

    public TransparentProxyProtocolVo setMaxReq(Long maxReq) {
        this.maxReq = maxReq;
        return this;
    }
    public Long getMaxReq() {
        return this.maxReq;
    }

    public TransparentProxyProtocolVo setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public TransparentProxyProtocolVo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
