// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConsumptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例ID
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // ldc模式下的cell
    // 
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 消费者groupID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 订阅的topic
    // 
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 是否带上客户端信息
    // 
    @NameInMap("need_client_detail")
    @Validation(required = true)
    public Boolean needClientDetail;

    public static QuerySofamqConsumptionRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConsumptionRequest self = new QuerySofamqConsumptionRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConsumptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConsumptionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConsumptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqConsumptionRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqConsumptionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QuerySofamqConsumptionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public QuerySofamqConsumptionRequest setNeedClientDetail(Boolean needClientDetail) {
        this.needClientDetail = needClientDetail;
        return this;
    }
    public Boolean getNeedClientDetail() {
        return this.needClientDetail;
    }

}
