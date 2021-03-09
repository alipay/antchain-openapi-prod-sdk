// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Disk extends TeaModel {
    // ssd, cloud_efficiency
    @NameInMap("category")
    public String category;

    // disk related computer info
    @NameInMap("computer")
    public DiskComputer computer;

    // 是否同时删除自动快照
    @NameInMap("delete_auto_snapshot")
    public Boolean deleteAutoSnapshot;

    // 磁盘是否随container一起释放
    @NameInMap("delete_with_computer")
    public Boolean deleteWithComputer;

    // device info
    @NameInMap("device")
    public String device;

    // 磁盘是否执行自动快照策略
    @NameInMap("enable_auto_snapshot")
    public Boolean enableAutoSnapshot;

    // iaasId
    @NameInMap("iaas_id")
    public String iaasId;

    // id
    @NameInMap("id")
    public String id;

    // 创建磁盘的镜像
    @NameInMap("image_id")
    public String imageId;

    // name
    @NameInMap("name")
    public String name;

    // 磁盘是否可卸载
    @NameInMap("portable")
    public Boolean portable;

    // providerId
    @NameInMap("provider_id")
    public String providerId;

    // regionId
    @NameInMap("region_id")
    public String regionId;

    // disk size
    @NameInMap("size")
    public Long size;

    // disk status
    @NameInMap("status")
    public String status;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // SYSTEM, DATA
    @NameInMap("type")
    public String type;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    public static Disk build(java.util.Map<String, ?> map) throws Exception {
        Disk self = new Disk();
        return TeaModel.build(map, self);
    }

    public Disk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Disk setComputer(DiskComputer computer) {
        this.computer = computer;
        return this;
    }
    public DiskComputer getComputer() {
        return this.computer;
    }

    public Disk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public Disk setDeleteWithComputer(Boolean deleteWithComputer) {
        this.deleteWithComputer = deleteWithComputer;
        return this;
    }
    public Boolean getDeleteWithComputer() {
        return this.deleteWithComputer;
    }

    public Disk setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public Disk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
        this.enableAutoSnapshot = enableAutoSnapshot;
        return this;
    }
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public Disk setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public Disk setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Disk setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Disk setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Disk setPortable(Boolean portable) {
        this.portable = portable;
        return this;
    }
    public Boolean getPortable() {
        return this.portable;
    }

    public Disk setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public Disk setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Disk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public Disk setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Disk setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Disk setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Disk setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Disk setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public Disk setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Disk setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
