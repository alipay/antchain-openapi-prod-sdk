// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyBound extends TeaModel {
    // 端口段
    @NameInMap("port_range")
    @Validation(required = true)
    public java.util.List<TransparentProxyPortPair> portRange;

    // 网段
    @NameInMap("ip_range")
    @Validation(required = true)
    public java.util.List<TransparentProxyIpPair> ipRange;

    public static TransparentProxyBound build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyBound self = new TransparentProxyBound();
        return TeaModel.build(map, self);
    }

    public TransparentProxyBound setPortRange(java.util.List<TransparentProxyPortPair> portRange) {
        this.portRange = portRange;
        return this;
    }
    public java.util.List<TransparentProxyPortPair> getPortRange() {
        return this.portRange;
    }

    public TransparentProxyBound setIpRange(java.util.List<TransparentProxyIpPair> ipRange) {
        this.ipRange = ipRange;
        return this;
    }
    public java.util.List<TransparentProxyIpPair> getIpRange() {
        return this.ipRange;
    }

}
