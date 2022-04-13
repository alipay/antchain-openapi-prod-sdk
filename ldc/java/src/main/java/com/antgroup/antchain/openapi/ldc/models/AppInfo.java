// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppInfo extends TeaModel {
    // buildpack版本。
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 应用描述。
    @NameInMap("description")
    public String description;

    // 应用id。
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用owner。
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 技术栈。
    @NameInMap("techstack_identity")
    @Validation(required = true)
    public String techstackIdentity;

    // ownerId
    @NameInMap("owner_id")
    public String ownerId;

    public static AppInfo build(java.util.Map<String, ?> map) throws Exception {
        AppInfo self = new AppInfo();
        return TeaModel.build(map, self);
    }

    public AppInfo setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public AppInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public AppInfo setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public AppInfo setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
