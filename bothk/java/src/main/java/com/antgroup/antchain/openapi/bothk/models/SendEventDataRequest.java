// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class SendEventDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 事件数据列表
    @NameInMap("event_data_list")
    @Validation(required = true)
    public java.util.List<EventData> eventDataList;

    // 事件数据领域参数
    @NameInMap("event_specs")
    @Validation(required = true)
    public EventSpecs eventSpecs;

    public static SendEventDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendEventDataRequest self = new SendEventDataRequest();
        return TeaModel.build(map, self);
    }

    public SendEventDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendEventDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendEventDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendEventDataRequest setEventDataList(java.util.List<EventData> eventDataList) {
        this.eventDataList = eventDataList;
        return this;
    }
    public java.util.List<EventData> getEventDataList() {
        return this.eventDataList;
    }

    public SendEventDataRequest setEventSpecs(EventSpecs eventSpecs) {
        this.eventSpecs = eventSpecs;
        return this;
    }
    public EventSpecs getEventSpecs() {
        return this.eventSpecs;
    }

}
