// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyPortPair extends TeaModel {
    // 是否是默认值
    @NameInMap("default_value")
    public Long defaultValue;

    // 端口
    @NameInMap("end_port")
    @Validation(required = true)
    public Long endPort;

    // 起始端口
    @NameInMap("start_port")
    @Validation(required = true)
    public Long startPort;

    public static TransparentProxyPortPair build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyPortPair self = new TransparentProxyPortPair();
        return TeaModel.build(map, self);
    }

    public TransparentProxyPortPair setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Long getDefaultValue() {
        return this.defaultValue;
    }

    public TransparentProxyPortPair setEndPort(Long endPort) {
        this.endPort = endPort;
        return this;
    }
    public Long getEndPort() {
        return this.endPort;
    }

    public TransparentProxyPortPair setStartPort(Long startPort) {
        this.startPort = startPort;
        return this;
    }
    public Long getStartPort() {
        return this.startPort;
    }

}
