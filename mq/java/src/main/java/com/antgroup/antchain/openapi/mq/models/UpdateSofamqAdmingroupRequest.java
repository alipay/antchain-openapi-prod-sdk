// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqAdmingroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // group名
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需创建的 Topic 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 设置读消息开关
    @NameInMap("read_enable")
    @Validation(required = true)
    public Boolean readEnable;

    // 生效范围，三板斧使用
    @NameInMap("scope")
    public String scope;

    // 重试队列读队列数
    @NameInMap("retry_read_queue_num")
    public Long retryReadQueueNum;

    // 重试队列写队列数
    @NameInMap("retry_write_queue_num")
    public Long retryWriteQueueNum;

    // 设置该重试队列的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
    @NameInMap("retry_perm")
    public Long retryPerm;

    public static UpdateSofamqAdmingroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqAdmingroupRequest self = new UpdateSofamqAdmingroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqAdmingroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqAdmingroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqAdmingroupRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateSofamqAdmingroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateSofamqAdmingroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqAdmingroupRequest setReadEnable(Boolean readEnable) {
        this.readEnable = readEnable;
        return this;
    }
    public Boolean getReadEnable() {
        return this.readEnable;
    }

    public UpdateSofamqAdmingroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSofamqAdmingroupRequest setRetryReadQueueNum(Long retryReadQueueNum) {
        this.retryReadQueueNum = retryReadQueueNum;
        return this;
    }
    public Long getRetryReadQueueNum() {
        return this.retryReadQueueNum;
    }

    public UpdateSofamqAdmingroupRequest setRetryWriteQueueNum(Long retryWriteQueueNum) {
        this.retryWriteQueueNum = retryWriteQueueNum;
        return this;
    }
    public Long getRetryWriteQueueNum() {
        return this.retryWriteQueueNum;
    }

    public UpdateSofamqAdmingroupRequest setRetryPerm(Long retryPerm) {
        this.retryPerm = retryPerm;
        return this;
    }
    public Long getRetryPerm() {
        return this.retryPerm;
    }

}
