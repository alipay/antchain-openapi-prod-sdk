// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ZoneDto extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // iaasProviderId
    @NameInMap("iaas_provider_id")
    @Validation(required = true)
    public String iaasProviderId;

    // displayName
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // no
    @NameInMap("no")
    @Validation(required = true)
    public Long no;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static ZoneDto build(java.util.Map<String, ?> map) throws Exception {
        ZoneDto self = new ZoneDto();
        return TeaModel.build(map, self);
    }

    public ZoneDto setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ZoneDto setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public ZoneDto setIaasProviderId(String iaasProviderId) {
        this.iaasProviderId = iaasProviderId;
        return this;
    }
    public String getIaasProviderId() {
        return this.iaasProviderId;
    }

    public ZoneDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ZoneDto setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ZoneDto setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ZoneDto setNo(Long no) {
        this.no = no;
        return this;
    }
    public Long getNo() {
        return this.no;
    }

    public ZoneDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ZoneDto setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ZoneDto setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public ZoneDto setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
