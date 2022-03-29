// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasAppDto extends TeaModel {
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

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

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

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 应用所属的上层所有祖先分组
    @NameInMap("ancestor_app_groups")
    public java.util.List<TraasAppGroupDto> ancestorAppGroups;

    // app_group_uuid
    @NameInMap("app_group_uuid")
    public String appGroupUuid;

    // app_group_name
    @NameInMap("app_group_name")
    public String appGroupName;

    // app_server_count
    @NameInMap("app_server_count")
    public Long appServerCount;

    public static TraasAppDto build(java.util.Map<String, ?> map) throws Exception {
        TraasAppDto self = new TraasAppDto();
        return TeaModel.build(map, self);
    }

    public TraasAppDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasAppDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasAppDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TraasAppDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasAppDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasAppDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasAppDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasAppDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasAppDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasAppDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TraasAppDto setAncestorAppGroups(java.util.List<TraasAppGroupDto> ancestorAppGroups) {
        this.ancestorAppGroups = ancestorAppGroups;
        return this;
    }
    public java.util.List<TraasAppGroupDto> getAncestorAppGroups() {
        return this.ancestorAppGroups;
    }

    public TraasAppDto setAppGroupUuid(String appGroupUuid) {
        this.appGroupUuid = appGroupUuid;
        return this;
    }
    public String getAppGroupUuid() {
        return this.appGroupUuid;
    }

    public TraasAppDto setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public TraasAppDto setAppServerCount(Long appServerCount) {
        this.appServerCount = appServerCount;
        return this;
    }
    public Long getAppServerCount() {
        return this.appServerCount;
    }

}
