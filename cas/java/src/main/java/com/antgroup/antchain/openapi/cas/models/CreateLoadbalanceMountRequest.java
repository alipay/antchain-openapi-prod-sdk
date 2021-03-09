// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceMountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // mount_map
    @NameInMap("mount_map")
    @Validation(required = true)
    public java.util.List<MapStringToIntegerEntity> mountMap;

    // domain
    @NameInMap("domain")
    public String domain;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static CreateLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceMountRequest self = new CreateLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceMountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLoadbalanceMountRequest setMountMap(java.util.List<MapStringToIntegerEntity> mountMap) {
        this.mountMap = mountMap;
        return this;
    }
    public java.util.List<MapStringToIntegerEntity> getMountMap() {
        return this.mountMap;
    }

    public CreateLoadbalanceMountRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
