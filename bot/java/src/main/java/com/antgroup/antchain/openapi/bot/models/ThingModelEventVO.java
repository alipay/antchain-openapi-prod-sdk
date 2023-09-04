// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ThingModelEventVO extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 物模型功能Id
    @NameInMap("feature_id")
    @Validation(required = true)
    public String featureId;

    // 业务标识
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 事件属性列表
    @NameInMap("event_properties")
    @Validation(required = true)
    public String eventProperties;

    public static ThingModelEventVO build(java.util.Map<String, ?> map) throws Exception {
        ThingModelEventVO self = new ThingModelEventVO();
        return TeaModel.build(map, self);
    }

    public ThingModelEventVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThingModelEventVO setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public ThingModelEventVO setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ThingModelEventVO setEventProperties(String eventProperties) {
        this.eventProperties = eventProperties;
        return this;
    }
    public String getEventProperties() {
        return this.eventProperties;
    }

}
