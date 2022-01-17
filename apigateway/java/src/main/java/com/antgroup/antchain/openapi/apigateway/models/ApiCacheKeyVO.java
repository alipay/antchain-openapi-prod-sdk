// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiCacheKeyVO extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // location
    @NameInMap("location")
    public String location;

    public static ApiCacheKeyVO build(java.util.Map<String, ?> map) throws Exception {
        ApiCacheKeyVO self = new ApiCacheKeyVO();
        return TeaModel.build(map, self);
    }

    public ApiCacheKeyVO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ApiCacheKeyVO setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
