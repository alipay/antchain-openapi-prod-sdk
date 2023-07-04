// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DetailAapApplicationinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名称
    @NameInMap("name")
    public String name;

    // 镜像
    @NameInMap("image")
    public String image;

    // 副本数
    @NameInMap("replicas")
    public Long replicas;

    // 容器详情
    @NameInMap("pod_instances")
    public java.util.List<ContainerInstance> podInstances;

    // 应用版本
    @NameInMap("version")
    public String version;

    public static DetailAapApplicationinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAapApplicationinstanceResponse self = new DetailAapApplicationinstanceResponse();
        return TeaModel.build(map, self);
    }

    public DetailAapApplicationinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAapApplicationinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAapApplicationinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAapApplicationinstanceResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailAapApplicationinstanceResponse setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DetailAapApplicationinstanceResponse setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public DetailAapApplicationinstanceResponse setPodInstances(java.util.List<ContainerInstance> podInstances) {
        this.podInstances = podInstances;
        return this;
    }
    public java.util.List<ContainerInstance> getPodInstances() {
        return this.podInstances;
    }

    public DetailAapApplicationinstanceResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
