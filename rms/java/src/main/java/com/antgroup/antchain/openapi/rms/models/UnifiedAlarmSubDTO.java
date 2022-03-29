// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmSubDTO extends TeaModel {
    // 订阅者id
    @NameInMap("subscriber")
    @Validation(required = true)
    public String subscriber;

    // 订阅者类型
    @NameInMap("subscriber_type")
    @Validation(required = true)
    public String subscriberType;

    // 订阅者来源
    @NameInMap("subscriber_source")
    @Validation(required = true)
    public String subscriberSource;

    // 告警对象的名称
    @NameInMap("subscriber_name")
    @Validation(required = true)
    public String subscriberName;

    public static UnifiedAlarmSubDTO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmSubDTO self = new UnifiedAlarmSubDTO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmSubDTO setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public UnifiedAlarmSubDTO setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
        return this;
    }
    public String getSubscriberType() {
        return this.subscriberType;
    }

    public UnifiedAlarmSubDTO setSubscriberSource(String subscriberSource) {
        this.subscriberSource = subscriberSource;
        return this;
    }
    public String getSubscriberSource() {
        return this.subscriberSource;
    }

    public UnifiedAlarmSubDTO setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }
    public String getSubscriberName() {
        return this.subscriberName;
    }

}
