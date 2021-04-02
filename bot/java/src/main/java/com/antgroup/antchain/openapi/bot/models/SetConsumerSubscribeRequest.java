// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetConsumerSubscribeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消费者Id
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 订阅的发行设备Id列表
    @NameInMap("distribute_device_id_list")
    @Validation(required = true)
    public java.util.List<String> distributeDeviceIdList;

    public static SetConsumerSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumerSubscribeRequest self = new SetConsumerSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumerSubscribeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumerSubscribeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumerSubscribeRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public SetConsumerSubscribeRequest setDistributeDeviceIdList(java.util.List<String> distributeDeviceIdList) {
        this.distributeDeviceIdList = distributeDeviceIdList;
        return this;
    }
    public java.util.List<String> getDistributeDeviceIdList() {
        return this.distributeDeviceIdList;
    }

}
