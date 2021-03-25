// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackRegionRelation extends TeaModel {
    // 技术栈版本的id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // 技术栈租户ID
    @NameInMap("buildpack_tenant_id")
    public String buildpackTenantId;

    // 文件的checksum
    @NameInMap("file_checksum")
    public String fileChecksum;

    // 文件存储地址
    @NameInMap("file_location")
    public String fileLocation;

    // 文件大小，类似1100
    @NameInMap("file_size")
    public Long fileSize;

    // 文件状态
    @NameInMap("file_status")
    public String fileStatus;

    // 文件的初始名称
    @NameInMap("original_file_name")
    public String originalFileName;

    // 文件可读的大小，类似1.1MB
    @NameInMap("readable_file_size")
    public String readableFileSize;

    // region的ID
    @NameInMap("region_id")
    public String regionId;

    // region的标识符
    @NameInMap("region_identity")
    public String regionIdentity;

    // region的名称
    @NameInMap("region_name")
    public String regionName;

    // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
    @NameInMap("storage_type")
    public String storageType;

    public static BuildpackRegionRelation build(java.util.Map<String, ?> map) throws Exception {
        BuildpackRegionRelation self = new BuildpackRegionRelation();
        return TeaModel.build(map, self);
    }

    public BuildpackRegionRelation setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public BuildpackRegionRelation setBuildpackTenantId(String buildpackTenantId) {
        this.buildpackTenantId = buildpackTenantId;
        return this;
    }
    public String getBuildpackTenantId() {
        return this.buildpackTenantId;
    }

    public BuildpackRegionRelation setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum;
        return this;
    }
    public String getFileChecksum() {
        return this.fileChecksum;
    }

    public BuildpackRegionRelation setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public BuildpackRegionRelation setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public BuildpackRegionRelation setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }

    public BuildpackRegionRelation setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public BuildpackRegionRelation setReadableFileSize(String readableFileSize) {
        this.readableFileSize = readableFileSize;
        return this;
    }
    public String getReadableFileSize() {
        return this.readableFileSize;
    }

    public BuildpackRegionRelation setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BuildpackRegionRelation setRegionIdentity(String regionIdentity) {
        this.regionIdentity = regionIdentity;
        return this;
    }
    public String getRegionIdentity() {
        return this.regionIdentity;
    }

    public BuildpackRegionRelation setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public BuildpackRegionRelation setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
