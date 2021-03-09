// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListenerSecurityIp extends TeaModel {
    // access_control
    @NameInMap("access_control")
    @Validation(required = true)
    public Boolean accessControl;

    // ips
    @NameInMap("ips")
    @Validation(required = true)
    public java.util.List<String> ips;

    public static ListenerSecurityIp build(java.util.Map<String, ?> map) throws Exception {
        ListenerSecurityIp self = new ListenerSecurityIp();
        return TeaModel.build(map, self);
    }

    public ListenerSecurityIp setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
        return this;
    }
    public Boolean getAccessControl() {
        return this.accessControl;
    }

    public ListenerSecurityIp setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

}
