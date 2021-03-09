// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetRegionAliasbyidRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // providerId
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // iaasConnType
    @NameInMap("iaas_conn_type")
    @Validation(required = true)
    public String iaasConnType;

    public static GetRegionAliasbyidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegionAliasbyidRequest self = new GetRegionAliasbyidRequest();
        return TeaModel.build(map, self);
    }

    public GetRegionAliasbyidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRegionAliasbyidRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRegionAliasbyidRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public GetRegionAliasbyidRequest setIaasConnType(String iaasConnType) {
        this.iaasConnType = iaasConnType;
        return this;
    }
    public String getIaasConnType() {
        return this.iaasConnType;
    }

}
