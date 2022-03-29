// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceQuerySummary extends TeaModel {
    // local endpoint ip
    @NameInMap("local_ip")
    public java.util.List<String> localIp;

    // local endpoint service name
    @NameInMap("local_service_name")
    public java.util.List<String> localServiceName;

    // remote endpoint ip
    @NameInMap("remote_ip")
    public java.util.List<String> remoteIp;

    // remote endpoint service name
    @NameInMap("remote_service_name")
    public java.util.List<String> remoteServiceName;

    // 状态
    @NameInMap("status")
    public java.util.List<String> status;

    public static TraceQuerySummary build(java.util.Map<String, ?> map) throws Exception {
        TraceQuerySummary self = new TraceQuerySummary();
        return TeaModel.build(map, self);
    }

    public TraceQuerySummary setLocalIp(java.util.List<String> localIp) {
        this.localIp = localIp;
        return this;
    }
    public java.util.List<String> getLocalIp() {
        return this.localIp;
    }

    public TraceQuerySummary setLocalServiceName(java.util.List<String> localServiceName) {
        this.localServiceName = localServiceName;
        return this;
    }
    public java.util.List<String> getLocalServiceName() {
        return this.localServiceName;
    }

    public TraceQuerySummary setRemoteIp(java.util.List<String> remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public java.util.List<String> getRemoteIp() {
        return this.remoteIp;
    }

    public TraceQuerySummary setRemoteServiceName(java.util.List<String> remoteServiceName) {
        this.remoteServiceName = remoteServiceName;
        return this;
    }
    public java.util.List<String> getRemoteServiceName() {
        return this.remoteServiceName;
    }

    public TraceQuerySummary setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
