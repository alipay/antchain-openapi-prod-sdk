// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServicePortMapping extends TeaModel {
    // 访问配置前端端口。
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 访问配置协议。
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    // 访问配置后端端口。
    @NameInMap("target_port")
    @Validation(required = true)
    public Long targetPort;

    public static ServicePortMapping build(java.util.Map<String, ?> map) throws Exception {
        ServicePortMapping self = new ServicePortMapping();
        return TeaModel.build(map, self);
    }

    public ServicePortMapping setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public ServicePortMapping setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ServicePortMapping setTargetPort(Long targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Long getTargetPort() {
        return this.targetPort;
    }

}
