// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackRegionRelationDetail extends TeaModel {
    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    // buildpackTenantId
    @NameInMap("buildpack_tenant_id")
    public String buildpackTenantId;

    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // fileChecksum
    @NameInMap("file_checksum")
    public String fileChecksum;

    // fileLocation
    @NameInMap("file_location")
    public String fileLocation;

    // fileSize
    @NameInMap("file_size")
    public Long fileSize;

    // fileStatus
    @NameInMap("file_status")
    public String fileStatus;

    // fromRegionId
    @NameInMap("from_region_id")
    public String fromRegionId;

    // id
    @NameInMap("id")
    public String id;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // objectName
    @NameInMap("object_name")
    public String objectName;

    // originalFileName
    @NameInMap("original_file_name")
    public String originalFileName;

    // readableFileSize
    @NameInMap("readable_file_size")
    public String readableFileSize;

    // RegionDto
    @NameInMap("region")
    public Region region;

    public static BuildpackRegionRelationDetail build(java.util.Map<String, ?> map) throws Exception {
        BuildpackRegionRelationDetail self = new BuildpackRegionRelationDetail();
        return TeaModel.build(map, self);
    }

    public BuildpackRegionRelationDetail setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public BuildpackRegionRelationDetail setBuildpackTenantId(String buildpackTenantId) {
        this.buildpackTenantId = buildpackTenantId;
        return this;
    }
    public String getBuildpackTenantId() {
        return this.buildpackTenantId;
    }

    public BuildpackRegionRelationDetail setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public BuildpackRegionRelationDetail setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum;
        return this;
    }
    public String getFileChecksum() {
        return this.fileChecksum;
    }

    public BuildpackRegionRelationDetail setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public BuildpackRegionRelationDetail setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public BuildpackRegionRelationDetail setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }

    public BuildpackRegionRelationDetail setFromRegionId(String fromRegionId) {
        this.fromRegionId = fromRegionId;
        return this;
    }
    public String getFromRegionId() {
        return this.fromRegionId;
    }

    public BuildpackRegionRelationDetail setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackRegionRelationDetail setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public BuildpackRegionRelationDetail setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public BuildpackRegionRelationDetail setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public BuildpackRegionRelationDetail setReadableFileSize(String readableFileSize) {
        this.readableFileSize = readableFileSize;
        return this;
    }
    public String getReadableFileSize() {
        return this.readableFileSize;
    }

    public BuildpackRegionRelationDetail setRegion(Region region) {
        this.region = region;
        return this;
    }
    public Region getRegion() {
        return this.region;
    }

}
