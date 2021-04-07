// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceComputertypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // zone name
    @NameInMap("zone")
    public String zone;

    // 实例规格族
    @NameInMap("instance_type_family")
    @Validation(required = true)
    public String instanceTypeFamily;

    public static ListResourceComputertypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceComputertypeRequest self = new ListResourceComputertypeRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceComputertypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListResourceComputertypeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListResourceComputertypeRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public ListResourceComputertypeRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

}
