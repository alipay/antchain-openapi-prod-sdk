// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateConsumerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消费者名称
    @NameInMap("consumer_name")
    @Validation(required = true)
    public String consumerName;

    public static CreateConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerRequest self = new CreateConsumerRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumerRequest setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }
    public String getConsumerName() {
        return this.consumerName;
    }

}
