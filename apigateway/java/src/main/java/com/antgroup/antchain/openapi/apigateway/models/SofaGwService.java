// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwService extends TeaModel {
    // app name
    @NameInMap("app_name")
    public String appName;

    // cluster name
    @NameInMap("cluster_name")
    public String clusterName;

    // controls
    @NameInMap("controls")
    public java.util.List<SofaGwControlVO> controls;

    // downstream
    @NameInMap("downstream")
    public SofaGwDownstream downstream;

    // id
    @NameInMap("id")
    public Long id;

    // 实例标识
    @NameInMap("instance_id")
    public String instanceId;

    // service name
    @NameInMap("name")
    public String name;

    // service_version
    @NameInMap("service_version")
    public String serviceVersion;

    // 上线:online, 下线:offline
    @NameInMap("status")
    public String status;

    // upstream
    @NameInMap("upstream")
    public SofaGwUpstreamVO upstream;

    public static SofaGwService build(java.util.Map<String, ?> map) throws Exception {
        SofaGwService self = new SofaGwService();
        return TeaModel.build(map, self);
    }

    public SofaGwService setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SofaGwService setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public SofaGwService setControls(java.util.List<SofaGwControlVO> controls) {
        this.controls = controls;
        return this;
    }
    public java.util.List<SofaGwControlVO> getControls() {
        return this.controls;
    }

    public SofaGwService setDownstream(SofaGwDownstream downstream) {
        this.downstream = downstream;
        return this;
    }
    public SofaGwDownstream getDownstream() {
        return this.downstream;
    }

    public SofaGwService setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SofaGwService setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SofaGwService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SofaGwService setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public SofaGwService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SofaGwService setUpstream(SofaGwUpstreamVO upstream) {
        this.upstream = upstream;
        return this;
    }
    public SofaGwUpstreamVO getUpstream() {
        return this.upstream;
    }

}
