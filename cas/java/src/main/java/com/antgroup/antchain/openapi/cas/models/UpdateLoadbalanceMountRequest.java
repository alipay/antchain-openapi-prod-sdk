// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceMountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // mountMap
    @NameInMap("mount_map")
    public java.util.List<MapStringToIntegerEntity> mountMap;

    // domain
    @NameInMap("domain")
    public String domain;

    public static UpdateLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceMountRequest self = new UpdateLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceMountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLoadbalanceMountRequest setMountMap(java.util.List<MapStringToIntegerEntity> mountMap) {
        this.mountMap = mountMap;
        return this;
    }
    public java.util.List<MapStringToIntegerEntity> getMountMap() {
        return this.mountMap;
    }

    public UpdateLoadbalanceMountRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
