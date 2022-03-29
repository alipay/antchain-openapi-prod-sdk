// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryUserTopicqueueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需查询的 Topic 所在的 Cell
    // 
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 需要查询的Topic对应的实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // Topic名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QueryUserTopicqueueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTopicqueueRequest self = new QueryUserTopicqueueRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserTopicqueueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserTopicqueueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserTopicqueueRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryUserTopicqueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryUserTopicqueueRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
