// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpackGeneratesignurlRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    public String id;

    // 地域ID
    @NameInMap("region_num")
    public String regionNum;

    public static CreateBuildpackGeneratesignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackGeneratesignurlRequest self = new CreateBuildpackGeneratesignurlRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackGeneratesignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBuildpackGeneratesignurlRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateBuildpackGeneratesignurlRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBuildpackGeneratesignurlRequest setRegionNum(String regionNum) {
        this.regionNum = regionNum;
        return this;
    }
    public String getRegionNum() {
        return this.regionNum;
    }

}
