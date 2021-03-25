// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackCompositeVO extends TeaModel {
    // app_service_count
    @NameInMap("app_service_count")
    public Long appServiceCount;

    // creator
    @NameInMap("creator")
    public UserDTO creator;

    // origin_type
    @NameInMap("origin_type")
    public String originType;

    // publisher
    @NameInMap("publisher")
    public UserDTO publisher;

    // supported_o_s
    @NameInMap("supported_o_s")
    public java.util.List<BuildpackOS> supportedOS;

    // supported_regions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelationDetail> supportedRegions;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // id
    @NameInMap("id")
    public String id;

    // description
    @NameInMap("description")
    public String description;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    public static BuildpackCompositeVO build(java.util.Map<String, ?> map) throws Exception {
        BuildpackCompositeVO self = new BuildpackCompositeVO();
        return TeaModel.build(map, self);
    }

    public BuildpackCompositeVO setAppServiceCount(Long appServiceCount) {
        this.appServiceCount = appServiceCount;
        return this;
    }
    public Long getAppServiceCount() {
        return this.appServiceCount;
    }

    public BuildpackCompositeVO setCreator(UserDTO creator) {
        this.creator = creator;
        return this;
    }
    public UserDTO getCreator() {
        return this.creator;
    }

    public BuildpackCompositeVO setOriginType(String originType) {
        this.originType = originType;
        return this;
    }
    public String getOriginType() {
        return this.originType;
    }

    public BuildpackCompositeVO setPublisher(UserDTO publisher) {
        this.publisher = publisher;
        return this;
    }
    public UserDTO getPublisher() {
        return this.publisher;
    }

    public BuildpackCompositeVO setSupportedOS(java.util.List<BuildpackOS> supportedOS) {
        this.supportedOS = supportedOS;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOS() {
        return this.supportedOS;
    }

    public BuildpackCompositeVO setSupportedRegions(java.util.List<BuildpackRegionRelationDetail> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelationDetail> getSupportedRegions() {
        return this.supportedRegions;
    }

    public BuildpackCompositeVO setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public BuildpackCompositeVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackCompositeVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackCompositeVO setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

}
