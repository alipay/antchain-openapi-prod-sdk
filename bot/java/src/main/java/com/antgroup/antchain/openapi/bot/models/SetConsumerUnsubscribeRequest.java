// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetConsumerUnsubscribeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消费者id
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 发型设备Id列表
    @NameInMap("distribute_device_id_list")
    @Validation(required = true)
    public java.util.List<String> distributeDeviceIdList;

    public static SetConsumerUnsubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumerUnsubscribeRequest self = new SetConsumerUnsubscribeRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumerUnsubscribeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumerUnsubscribeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumerUnsubscribeRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public SetConsumerUnsubscribeRequest setDistributeDeviceIdList(java.util.List<String> distributeDeviceIdList) {
        this.distributeDeviceIdList = distributeDeviceIdList;
        return this;
    }
    public java.util.List<String> getDistributeDeviceIdList() {
        return this.distributeDeviceIdList;
    }

}
