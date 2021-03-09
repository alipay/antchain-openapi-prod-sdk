// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Zone extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // description
    @NameInMap("description")
    public String description;

    // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
    @NameInMap("instancestatus")
    @Validation(required = true)
    public String instancestatus;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // properties
    @NameInMap("properties")
    @Validation(required = true)
    public java.util.List<Property> properties;

    public static Zone build(java.util.Map<String, ?> map) throws Exception {
        Zone self = new Zone();
        return TeaModel.build(map, self);
    }

    public Zone setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Zone setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Zone setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Zone setInstancestatus(String instancestatus) {
        this.instancestatus = instancestatus;
        return this;
    }
    public String getInstancestatus() {
        return this.instancestatus;
    }

    public Zone setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Zone setProperties(java.util.List<Property> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<Property> getProperties() {
        return this.properties;
    }

}
