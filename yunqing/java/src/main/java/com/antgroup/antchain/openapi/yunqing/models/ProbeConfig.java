// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProbeConfig extends TeaModel {
    // 超时时间，单位s
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // exec
    @NameInMap("exec")
    public Exec exec;

    // http
    @NameInMap("http")
    public HTTP http;

    // tcp
    @NameInMap("tcp")
    public TCP tcp;

    public static ProbeConfig build(java.util.Map<String, ?> map) throws Exception {
        ProbeConfig self = new ProbeConfig();
        return TeaModel.build(map, self);
    }

    public ProbeConfig setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ProbeConfig setExec(Exec exec) {
        this.exec = exec;
        return this;
    }
    public Exec getExec() {
        return this.exec;
    }

    public ProbeConfig setHttp(HTTP http) {
        this.http = http;
        return this;
    }
    public HTTP getHttp() {
        return this.http;
    }

    public ProbeConfig setTcp(TCP tcp) {
        this.tcp = tcp;
        return this;
    }
    public TCP getTcp() {
        return this.tcp;
    }

}
