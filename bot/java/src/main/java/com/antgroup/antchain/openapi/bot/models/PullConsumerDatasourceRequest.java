// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PullConsumerDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消费者id
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 分页游标
    @NameInMap("cursor")
    @Validation(required = true)
    public String cursor;

    // 获取的时间范围
    @NameInMap("time_span")
    public java.util.List<String> timeSpan;

    // 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
    @NameInMap("device_type")
    public String deviceType;

    public static PullConsumerDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PullConsumerDatasourceRequest self = new PullConsumerDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public PullConsumerDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullConsumerDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullConsumerDatasourceRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public PullConsumerDatasourceRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public PullConsumerDatasourceRequest setTimeSpan(java.util.List<String> timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }
    public java.util.List<String> getTimeSpan() {
        return this.timeSpan;
    }

    public PullConsumerDatasourceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

}
