// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Cloud extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // identity
    @NameInMap("identity")
    public String identity;

    // name
    @NameInMap("name")
    public String name;

    // platforms
    @NameInMap("platforms")
    public java.util.List<CloudPlatform> platforms;

    public static Cloud build(java.util.Map<String, ?> map) throws Exception {
        Cloud self = new Cloud();
        return TeaModel.build(map, self);
    }

    public Cloud setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Cloud setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Cloud setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cloud setPlatforms(java.util.List<CloudPlatform> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<CloudPlatform> getPlatforms() {
        return this.platforms;
    }

}
