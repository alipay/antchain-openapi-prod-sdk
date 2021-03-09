// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CellGroup extends TeaModel {
    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // properties
    @NameInMap("properties")
    public java.util.List<Property> properties;

    // instancestatus
    @NameInMap("instancestatus")
    @Validation(required = true)
    public String instancestatus;

    public static CellGroup build(java.util.Map<String, ?> map) throws Exception {
        CellGroup self = new CellGroup();
        return TeaModel.build(map, self);
    }

    public CellGroup setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CellGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CellGroup setProperties(java.util.List<Property> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<Property> getProperties() {
        return this.properties;
    }

    public CellGroup setInstancestatus(String instancestatus) {
        this.instancestatus = instancestatus;
        return this;
    }
    public String getInstancestatus() {
        return this.instancestatus;
    }

}
