// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasTenantDto extends TeaModel {
    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    public String displayName;

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // source_from
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    public String extension;

    public static TraasTenantDto build(java.util.Map<String, ?> map) throws Exception {
        TraasTenantDto self = new TraasTenantDto();
        return TeaModel.build(map, self);
    }

    public TraasTenantDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasTenantDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasTenantDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TraasTenantDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasTenantDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasTenantDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
