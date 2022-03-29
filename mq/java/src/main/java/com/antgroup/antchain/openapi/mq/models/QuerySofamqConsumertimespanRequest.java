// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConsumertimespanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需查询的消费端 Group ID 所在的 Cell
    @NameInMap("cell")
    public String cell;

    // 需查询的消费端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需查询的消费端 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需查询的消费端 Group ID 订阅的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QuerySofamqConsumertimespanRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConsumertimespanRequest self = new QuerySofamqConsumertimespanRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConsumertimespanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConsumertimespanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConsumertimespanRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqConsumertimespanRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QuerySofamqConsumertimespanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqConsumertimespanRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
