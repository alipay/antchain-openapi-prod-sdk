// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Region extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
    @NameInMap("instancestatus")
    @Validation(required = true)
    public String instancestatus;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // properties
    @NameInMap("properties")
    public java.util.List<Property> properties;

    public static Region build(java.util.Map<String, ?> map) throws Exception {
        Region self = new Region();
        return TeaModel.build(map, self);
    }

    public Region setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Region setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Region setInstancestatus(String instancestatus) {
        this.instancestatus = instancestatus;
        return this;
    }
    public String getInstancestatus() {
        return this.instancestatus;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Region setProperties(java.util.List<Property> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<Property> getProperties() {
        return this.properties;
    }

}
