// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiCacheVO extends TeaModel {
    // 是否需要缓存
    @NameInMap("need_cache")
    public Boolean needCache;

    // TTL
    @NameInMap("ttl")
    public Long ttl;

    // cacheKeys
    @NameInMap("cache_keys")
    public java.util.List<ApiCacheKeyVO> cacheKeys;

    public static ApiCacheVO build(java.util.Map<String, ?> map) throws Exception {
        ApiCacheVO self = new ApiCacheVO();
        return TeaModel.build(map, self);
    }

    public ApiCacheVO setNeedCache(Boolean needCache) {
        this.needCache = needCache;
        return this;
    }
    public Boolean getNeedCache() {
        return this.needCache;
    }

    public ApiCacheVO setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public ApiCacheVO setCacheKeys(java.util.List<ApiCacheKeyVO> cacheKeys) {
        this.cacheKeys = cacheKeys;
        return this;
    }
    public java.util.List<ApiCacheKeyVO> getCacheKeys() {
        return this.cacheKeys;
    }

}
