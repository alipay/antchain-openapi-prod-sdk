// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ThingModelFeatureResponse extends TeaModel {
    @NameInMap("feature_id")
    @Validation(required = true)
    public String featureId;

    @NameInMap("identifier")
    @Validation(required = true)
    public String identifier;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("event_properties")
    @Validation(required = true)
    public String eventProperties;

    public static ThingModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ThingModelFeatureResponse self = new ThingModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public ThingModelFeatureResponse setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public ThingModelFeatureResponse setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ThingModelFeatureResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThingModelFeatureResponse setEventProperties(String eventProperties) {
        this.eventProperties = eventProperties;
        return this;
    }
    public String getEventProperties() {
        return this.eventProperties;
    }

}
