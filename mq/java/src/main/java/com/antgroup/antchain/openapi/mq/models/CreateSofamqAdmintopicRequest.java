// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqAdmintopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 需创建的 Topic 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
    @NameInMap("message_type")
    @Validation(required = true)
    public Long messageType;

    // Topic 的备注信息
    @NameInMap("remark")
    public String remark;

    // 生效范围，为三板斧使用
    @NameInMap("scope")
    public String scope;

    // 需创建的 Topic 的名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // Topic 权限，6为可读可写，4为可读
    @NameInMap("perm")
    public String perm;

    // Topic 所属的应用名称，要求 app name 在 appinfo 上可查
    @NameInMap("owner")
    public String owner;

    // 标识该 topic 的消息是否具有优先级
    @NameInMap("priority")
    public Boolean priority;

    public static CreateSofamqAdmintopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqAdmintopicRequest self = new CreateSofamqAdmintopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqAdmintopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqAdmintopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqAdmintopicRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqAdmintopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqAdmintopicRequest setMessageType(Long messageType) {
        this.messageType = messageType;
        return this;
    }
    public Long getMessageType() {
        return this.messageType;
    }

    public CreateSofamqAdmintopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSofamqAdmintopicRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSofamqAdmintopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public CreateSofamqAdmintopicRequest setPerm(String perm) {
        this.perm = perm;
        return this;
    }
    public String getPerm() {
        return this.perm;
    }

    public CreateSofamqAdmintopicRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateSofamqAdmintopicRequest setPriority(Boolean priority) {
        this.priority = priority;
        return this;
    }
    public Boolean getPriority() {
        return this.priority;
    }

}
