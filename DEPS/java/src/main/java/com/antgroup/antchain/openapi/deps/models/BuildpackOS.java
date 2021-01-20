// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackOS extends TeaModel {
    // creationTime
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // 描述
    @NameInMap("description")
    public String description;

    // extraInfo
    @NameInMap("extra_info")
    public String extraInfo;

    // 全名
    @NameInMap("full_name")
    public String fullName;

    // id
    @NameInMap("id")
    public Long id;

    // modificationTime
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // 名字
    @NameInMap("name")
    public String name;

    // 操作系统位数
    @NameInMap("os_bit")
    public Long osBit;

    // supportedCloudDisplayNames
    @NameInMap("supported_cloud_display_names")
    public java.util.List<String> supportedCloudDisplayNames;

    // supportedCloudNames
    @NameInMap("supported_cloud_names")
    public java.util.List<String> supportedCloudNames;

    // 版本
    @NameInMap("version")
    public String version;

    // 操作系统位数，e.g. 32 or 64
    @NameInMap("os_bit_num")
    public Long osBitNum;

    public static BuildpackOS build(java.util.Map<String, ?> map) throws Exception {
        BuildpackOS self = new BuildpackOS();
        return TeaModel.build(map, self);
    }

    public BuildpackOS setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public BuildpackOS setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackOS setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BuildpackOS setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public BuildpackOS setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BuildpackOS setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public BuildpackOS setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BuildpackOS setOsBit(Long osBit) {
        this.osBit = osBit;
        return this;
    }
    public Long getOsBit() {
        return this.osBit;
    }

    public BuildpackOS setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
        this.supportedCloudDisplayNames = supportedCloudDisplayNames;
        return this;
    }
    public java.util.List<String> getSupportedCloudDisplayNames() {
        return this.supportedCloudDisplayNames;
    }

    public BuildpackOS setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
        this.supportedCloudNames = supportedCloudNames;
        return this;
    }
    public java.util.List<String> getSupportedCloudNames() {
        return this.supportedCloudNames;
    }

    public BuildpackOS setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BuildpackOS setOsBitNum(Long osBitNum) {
        this.osBitNum = osBitNum;
        return this;
    }
    public Long getOsBitNum() {
        return this.osBitNum;
    }

}
