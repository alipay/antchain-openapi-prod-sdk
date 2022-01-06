// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyIpPair extends TeaModel {
    // 是否是默认值
    @NameInMap("default_value")
    public Long defaultValue;

    // 起始IP
    @NameInMap("start_ip")
    @Validation(required = true)
    public String startIp;

    // 终止IP
    @NameInMap("end_ip")
    @Validation(required = true)
    public String endIp;

    public static TransparentProxyIpPair build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyIpPair self = new TransparentProxyIpPair();
        return TeaModel.build(map, self);
    }

    public TransparentProxyIpPair setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Long getDefaultValue() {
        return this.defaultValue;
    }

    public TransparentProxyIpPair setStartIp(String startIp) {
        this.startIp = startIp;
        return this;
    }
    public String getStartIp() {
        return this.startIp;
    }

    public TransparentProxyIpPair setEndIp(String endIp) {
        this.endIp = endIp;
        return this;
    }
    public String getEndIp() {
        return this.endIp;
    }

}
