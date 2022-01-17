// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiTestParamVO extends TeaModel {
    // location
    @NameInMap("location")
    public String location;

    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static ApiTestParamVO build(java.util.Map<String, ?> map) throws Exception {
        ApiTestParamVO self = new ApiTestParamVO();
        return TeaModel.build(map, self);
    }

    public ApiTestParamVO setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ApiTestParamVO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ApiTestParamVO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
