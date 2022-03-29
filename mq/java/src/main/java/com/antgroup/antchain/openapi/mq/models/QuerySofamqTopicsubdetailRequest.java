// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqTopicsubdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需查询的 Topic 所在的单元
    @NameInMap("cell")
    public String cell;

    // 需查询的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需查询的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QuerySofamqTopicsubdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqTopicsubdetailRequest self = new QuerySofamqTopicsubdetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqTopicsubdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqTopicsubdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqTopicsubdetailRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqTopicsubdetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqTopicsubdetailRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
