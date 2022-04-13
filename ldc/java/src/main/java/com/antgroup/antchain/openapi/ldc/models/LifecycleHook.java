// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LifecycleHook extends TeaModel {
    // 启动后执行命令。
    @NameInMap("post_start_exec")
    public ExecAction postStartExec;

    // 启动后执行http get。
    @NameInMap("post_start_http")
    public HttpGetAction postStartHttp;

    // 启动后执行TCP请求。
    @NameInMap("post_start_tcp")
    public TcpSocketAction postStartTcp;

    // 停止前执行命令。
    @NameInMap("pre_stop_exec")
    public ExecAction preStopExec;

    // 停止前http get。
    @NameInMap("pre_stop_http")
    public HttpGetAction preStopHttp;

    // 停止前TCP请求。
    @NameInMap("pre_stop_tcp")
    public TcpSocketAction preStopTcp;

    public static LifecycleHook build(java.util.Map<String, ?> map) throws Exception {
        LifecycleHook self = new LifecycleHook();
        return TeaModel.build(map, self);
    }

    public LifecycleHook setPostStartExec(ExecAction postStartExec) {
        this.postStartExec = postStartExec;
        return this;
    }
    public ExecAction getPostStartExec() {
        return this.postStartExec;
    }

    public LifecycleHook setPostStartHttp(HttpGetAction postStartHttp) {
        this.postStartHttp = postStartHttp;
        return this;
    }
    public HttpGetAction getPostStartHttp() {
        return this.postStartHttp;
    }

    public LifecycleHook setPostStartTcp(TcpSocketAction postStartTcp) {
        this.postStartTcp = postStartTcp;
        return this;
    }
    public TcpSocketAction getPostStartTcp() {
        return this.postStartTcp;
    }

    public LifecycleHook setPreStopExec(ExecAction preStopExec) {
        this.preStopExec = preStopExec;
        return this;
    }
    public ExecAction getPreStopExec() {
        return this.preStopExec;
    }

    public LifecycleHook setPreStopHttp(HttpGetAction preStopHttp) {
        this.preStopHttp = preStopHttp;
        return this;
    }
    public HttpGetAction getPreStopHttp() {
        return this.preStopHttp;
    }

    public LifecycleHook setPreStopTcp(TcpSocketAction preStopTcp) {
        this.preStopTcp = preStopTcp;
        return this;
    }
    public TcpSocketAction getPreStopTcp() {
        return this.preStopTcp;
    }

}
