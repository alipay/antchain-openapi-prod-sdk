// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetAccessorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // Accessor关联的accessKey
    @NameInMap("access_key_id")
    public String accessKeyId;

    // 租户唯一标识
    @NameInMap("tenant")
    public String tenant;

    // 操作员或服务账号唯一ID
    @NameInMap("user_id")
    public String userId;

    public static GetAccessorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessorRequest self = new GetAccessorRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAccessorRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetAccessorRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetAccessorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
