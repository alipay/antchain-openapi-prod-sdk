// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ErrorRealte extends TeaModel {
    // ips
    @NameInMap("ips")
    public java.util.List<String> ips;

    // log_paths
    @NameInMap("log_paths")
    public java.util.List<String> logPaths;

    public static ErrorRealte build(java.util.Map<String, ?> map) throws Exception {
        ErrorRealte self = new ErrorRealte();
        return TeaModel.build(map, self);
    }

    public ErrorRealte setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public ErrorRealte setLogPaths(java.util.List<String> logPaths) {
        this.logPaths = logPaths;
        return this;
    }
    public java.util.List<String> getLogPaths() {
        return this.logPaths;
    }

}
