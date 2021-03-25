// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Region extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // iaasProviderId
    @NameInMap("iaas_provider_id")
    public String iaasProviderId;

    // region名称
    @NameInMap("id")
    public String id;

    // identity
    @NameInMap("identity")
    public String identity;

    // region显示名称
    @NameInMap("name")
    public String name;

    // networkType
    @NameInMap("network_type")
    public String networkType;

    // state
    @NameInMap("state")
    public String state;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // zoneDtos
    @NameInMap("zone_dtos")
    public String zoneDtos;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    // fileStatus
    @NameInMap("file_status")
    public String fileStatus;

    // fileLocation
    @NameInMap("file_location")
    public String fileLocation;

    // objectName
    @NameInMap("object_name")
    public String objectName;

    // fileSize
    @NameInMap("file_size")
    public Long fileSize;

    // readableFileSize
    @NameInMap("readable_file_size")
    public String readableFileSize;

    // fileChecksum
    @NameInMap("file_checksum")
    public String fileChecksum;

    // originalFileName
    @NameInMap("original_file_name")
    public String originalFileName;

    // buildpackTenantId
    @NameInMap("buildpack_tenant_id")
    public String buildpackTenantId;

    // fromRegionId
    @NameInMap("from_region_id")
    public String fromRegionId;

    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

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

    public Region setIaasProviderId(String iaasProviderId) {
        this.iaasProviderId = iaasProviderId;
        return this;
    }
    public String getIaasProviderId() {
        return this.iaasProviderId;
    }

    public Region setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Region setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Region setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public Region setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Region setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Region setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public Region setZoneDtos(String zoneDtos) {
        this.zoneDtos = zoneDtos;
        return this;
    }
    public String getZoneDtos() {
        return this.zoneDtos;
    }

    public Region setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public Region setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }

    public Region setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public Region setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public Region setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public Region setReadableFileSize(String readableFileSize) {
        this.readableFileSize = readableFileSize;
        return this;
    }
    public String getReadableFileSize() {
        return this.readableFileSize;
    }

    public Region setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum;
        return this;
    }
    public String getFileChecksum() {
        return this.fileChecksum;
    }

    public Region setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public Region setBuildpackTenantId(String buildpackTenantId) {
        this.buildpackTenantId = buildpackTenantId;
        return this;
    }
    public String getBuildpackTenantId() {
        return this.buildpackTenantId;
    }

    public Region setFromRegionId(String fromRegionId) {
        this.fromRegionId = fromRegionId;
        return this;
    }
    public String getFromRegionId() {
        return this.fromRegionId;
    }

    public Region setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Region setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

}
