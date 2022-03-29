// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class IdTopicQueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static IdTopicQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        IdTopicQueryRequest self = new IdTopicQueryRequest();
        return TeaModel.build(map, self);
    }

    public IdTopicQueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public IdTopicQueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public IdTopicQueryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IdTopicQueryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
