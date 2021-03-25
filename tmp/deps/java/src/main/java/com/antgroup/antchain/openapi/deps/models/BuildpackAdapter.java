// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackAdapter extends TeaModel {
    // buildpackArch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // supportedOS
    @NameInMap("supported_o_s")
    public java.util.List<BuildpackOS> supportedOS;

    // supportedRegions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelationDetail> supportedRegions;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    public static BuildpackAdapter build(java.util.Map<String, ?> map) throws Exception {
        BuildpackAdapter self = new BuildpackAdapter();
        return TeaModel.build(map, self);
    }

    public BuildpackAdapter setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public BuildpackAdapter setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public BuildpackAdapter setSupportedOS(java.util.List<BuildpackOS> supportedOS) {
        this.supportedOS = supportedOS;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOS() {
        return this.supportedOS;
    }

    public BuildpackAdapter setSupportedRegions(java.util.List<BuildpackRegionRelationDetail> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelationDetail> getSupportedRegions() {
        return this.supportedRegions;
    }

    public BuildpackAdapter setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

}
