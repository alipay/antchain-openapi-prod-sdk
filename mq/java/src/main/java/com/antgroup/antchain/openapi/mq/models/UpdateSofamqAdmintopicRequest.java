// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqAdmintopicRequest extends TeaModel {
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

    // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
    @NameInMap("perm")
    public Long perm;

    // 读队列数
    @NameInMap("read_queue_num")
    public Long readQueueNum;

    // topic名
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 写队列数
    @NameInMap("write_queue_num")
    public Long writeQueueNum;

    // 生效范围，三板斧使用
    @NameInMap("scope")
    public String scope;

    // 标识该 topic 的消息是否具有优先级
    @NameInMap("priority")
    public Boolean priority;

    public static UpdateSofamqAdmintopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqAdmintopicRequest self = new UpdateSofamqAdmintopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqAdmintopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqAdmintopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqAdmintopicRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateSofamqAdmintopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqAdmintopicRequest setPerm(Long perm) {
        this.perm = perm;
        return this;
    }
    public Long getPerm() {
        return this.perm;
    }

    public UpdateSofamqAdmintopicRequest setReadQueueNum(Long readQueueNum) {
        this.readQueueNum = readQueueNum;
        return this;
    }
    public Long getReadQueueNum() {
        return this.readQueueNum;
    }

    public UpdateSofamqAdmintopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateSofamqAdmintopicRequest setWriteQueueNum(Long writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
        return this;
    }
    public Long getWriteQueueNum() {
        return this.writeQueueNum;
    }

    public UpdateSofamqAdmintopicRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSofamqAdmintopicRequest setPriority(Boolean priority) {
        this.priority = priority;
        return this;
    }
    public Boolean getPriority() {
        return this.priority;
    }

}
