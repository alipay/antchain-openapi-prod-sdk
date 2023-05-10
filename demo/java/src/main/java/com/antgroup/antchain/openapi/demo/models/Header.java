// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Header extends TeaModel {
    // 身份信息
    @NameInMap("identity")
    @Validation(required = true)
    public Identity identity;

    // 调用链编号
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // host信息
    @NameInMap("host")
    @Validation(required = true)
    public Host host;

    // 方向
    @NameInMap("direction")
    @Validation(required = true)
    public String direction;

    // 请求类型
    @NameInMap("request_type")
    @Validation(required = true)
    public String requestType;

    // 协议版本
    @NameInMap("protocol_version")
    @Validation(required = true)
    public String protocolVersion;

    public static Header build(java.util.Map<String, ?> map) throws Exception {
        Header self = new Header();
        return TeaModel.build(map, self);
    }

    public Header setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public Header setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public Header setHost(Host host) {
        this.host = host;
        return this;
    }
    public Host getHost() {
        return this.host;
    }

    public Header setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public Header setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public Header setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
    }

}
