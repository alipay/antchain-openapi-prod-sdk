// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodDetailInfo extends TeaModel {
    // 集群名称
    // 
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // pod created time
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 已经具备的finalizers
    @NameInMap("finalizers")
    public java.util.List<String> finalizers;

    // pod的生命周期当前阶段
    @NameInMap("lifecycle_stage")
    public String lifecycleStage;

    // pod name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // pod namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // pod ip
    @NameInMap("pod_ip")
    @Validation(required = true)
    public String podIp;

    // pod的版本
    @NameInMap("revision")
    public String revision;

    // pod status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // pod uid
    @NameInMap("uid")
    public String uid;

    // 描述Pod当前状态的信息
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static PodDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        PodDetailInfo self = new PodDetailInfo();
        return TeaModel.build(map, self);
    }

    public PodDetailInfo setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public PodDetailInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PodDetailInfo setFinalizers(java.util.List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }
    public java.util.List<String> getFinalizers() {
        return this.finalizers;
    }

    public PodDetailInfo setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
        return this;
    }
    public String getLifecycleStage() {
        return this.lifecycleStage;
    }

    public PodDetailInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PodDetailInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PodDetailInfo setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public PodDetailInfo setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public PodDetailInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PodDetailInfo setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public PodDetailInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
