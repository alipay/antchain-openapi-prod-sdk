// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HostAlias extends TeaModel {
    // Hostnames for the above IP address.
    @NameInMap("hostnames")
    public java.util.List<String> hostnames;

    // IP address of the host file entry.
    // 
    @NameInMap("ip")
    public String ip;

    public static HostAlias build(java.util.Map<String, ?> map) throws Exception {
        HostAlias self = new HostAlias();
        return TeaModel.build(map, self);
    }

    public HostAlias setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public HostAlias setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
