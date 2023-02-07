// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Feature extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // cloud_name
    @NameInMap("cloud_name")
    @Validation(required = true)
    public String cloudName;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // feature_name
    @NameInMap("feature_name")
    @Validation(required = true)
    public String featureName;

    // content
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // conditional_content
    @NameInMap("conditional_content")
    public String conditionalContent;

    // utc_create
    // 
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static Feature build(java.util.Map<String, ?> map) throws Exception {
        Feature self = new Feature();
        return TeaModel.build(map, self);
    }

    public Feature setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Feature setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public Feature setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Feature setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Feature setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public Feature setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Feature setConditionalContent(String conditionalContent) {
        this.conditionalContent = conditionalContent;
        return this;
    }
    public String getConditionalContent() {
        return this.conditionalContent;
    }

    public Feature setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Feature setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
