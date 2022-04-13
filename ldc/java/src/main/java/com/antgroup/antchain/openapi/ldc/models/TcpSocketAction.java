// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TcpSocketAction extends TeaModel {
    // 健康检查端口。
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    public static TcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
        TcpSocketAction self = new TcpSocketAction();
        return TeaModel.build(map, self);
    }

    public TcpSocketAction setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
