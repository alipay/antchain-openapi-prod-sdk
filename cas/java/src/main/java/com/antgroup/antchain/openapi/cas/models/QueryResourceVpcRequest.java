// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 是否使用缓存进行查询，默认false，使用缓存查询
    @NameInMap("disable_cache")
    public Boolean disableCache;

    // 地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // VPC的id
    @NameInMap("vpc_id")
    public String vpcId;

    public static QueryResourceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceVpcRequest self = new QueryResourceVpcRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceVpcRequest setDisableCache(Boolean disableCache) {
        this.disableCache = disableCache;
        return this;
    }
    public Boolean getDisableCache() {
        return this.disableCache;
    }

    public QueryResourceVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryResourceVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
