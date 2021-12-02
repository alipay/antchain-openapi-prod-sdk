// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class AttributeGroup extends TeaModel {
    // id
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    public String displayName;

    // display_properties
    @NameInMap("display_properties")
    public String displayProperties;

    public static AttributeGroup build(java.util.Map<String, ?> map) throws Exception {
        AttributeGroup self = new AttributeGroup();
        return TeaModel.build(map, self);
    }

    public AttributeGroup setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public AttributeGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AttributeGroup setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AttributeGroup setDisplayProperties(String displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public String getDisplayProperties() {
        return this.displayProperties;
    }

}
