// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class AllSofamqSchemaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sofamq的instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 查询Schema的Topic名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static AllSofamqSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        AllSofamqSchemaRequest self = new AllSofamqSchemaRequest();
        return TeaModel.build(map, self);
    }

    public AllSofamqSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllSofamqSchemaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllSofamqSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllSofamqSchemaRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
