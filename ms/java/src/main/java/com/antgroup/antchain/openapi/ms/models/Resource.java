// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    @NameInMap("app_name")
    public String appName;

    @NameInMap("attributes")
    public java.util.List<Attribute> attributes;

    @NameInMap("name")
    public String name;

    @NameInMap("region")
    public String region;

    @NameInMap("resource_id")
    public String resourceId;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Resource setAttributes(java.util.List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<Attribute> getAttributes() {
        return this.attributes;
    }

    public Resource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Resource setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Resource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
