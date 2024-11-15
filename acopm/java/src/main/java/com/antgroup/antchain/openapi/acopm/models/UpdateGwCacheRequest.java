// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateGwCacheRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 刷新缓存的key
    @NameInMap("cache_key")
    @Validation(required = true)
    public String cacheKey;

    public static UpdateGwCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGwCacheRequest self = new UpdateGwCacheRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGwCacheRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGwCacheRequest setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
        return this;
    }
    public String getCacheKey() {
        return this.cacheKey;
    }

}
