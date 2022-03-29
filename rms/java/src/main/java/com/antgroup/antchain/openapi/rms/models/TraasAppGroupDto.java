// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasAppGroupDto extends TeaModel {
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

    // parent_uuid
    @NameInMap("parent_uuid")
    public String parentUuid;

    // layer
    @NameInMap("layer")
    public Long layer;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // outside_parent_id
    @NameInMap("outside_parent_id")
    public String outsideParentId;

    // source_from
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    public String extension;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static TraasAppGroupDto build(java.util.Map<String, ?> map) throws Exception {
        TraasAppGroupDto self = new TraasAppGroupDto();
        return TeaModel.build(map, self);
    }

    public TraasAppGroupDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasAppGroupDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasAppGroupDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TraasAppGroupDto setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public TraasAppGroupDto setLayer(Long layer) {
        this.layer = layer;
        return this;
    }
    public Long getLayer() {
        return this.layer;
    }

    public TraasAppGroupDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasAppGroupDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasAppGroupDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasAppGroupDto setOutsideParentId(String outsideParentId) {
        this.outsideParentId = outsideParentId;
        return this;
    }
    public String getOutsideParentId() {
        return this.outsideParentId;
    }

    public TraasAppGroupDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasAppGroupDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasAppGroupDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasAppGroupDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
