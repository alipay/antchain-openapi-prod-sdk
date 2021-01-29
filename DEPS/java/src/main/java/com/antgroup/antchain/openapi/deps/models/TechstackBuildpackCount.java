// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class TechstackBuildpackCount extends TeaModel {
    // buildpackCount
    @NameInMap("buildpack_count")
    public Long buildpackCount;

    // creation_time
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // description
    @NameInMap("description")
    public String description;

    // extra_info
    @NameInMap("extra_info")
    public String extraInfo;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    public String identity;

    // modification_time
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // scope
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static TechstackBuildpackCount build(java.util.Map<String, ?> map) throws Exception {
        TechstackBuildpackCount self = new TechstackBuildpackCount();
        return TeaModel.build(map, self);
    }

    public TechstackBuildpackCount setBuildpackCount(Long buildpackCount) {
        this.buildpackCount = buildpackCount;
        return this;
    }
    public Long getBuildpackCount() {
        return this.buildpackCount;
    }

    public TechstackBuildpackCount setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public TechstackBuildpackCount setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TechstackBuildpackCount setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public TechstackBuildpackCount setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TechstackBuildpackCount setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public TechstackBuildpackCount setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public TechstackBuildpackCount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TechstackBuildpackCount setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TechstackBuildpackCount setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
