// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saastest16.models;

import com.aliyun.tea.*;

public class QueryMap extends TeaModel {
    // 键值
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 额外用户信息
    @NameInMap("value")
    public java.util.List<NameValuePair> value;

    public static QueryMap build(java.util.Map<String, ?> map) throws Exception {
        QueryMap self = new QueryMap();
        return TeaModel.build(map, self);
    }

    public QueryMap setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMap setValue(java.util.List<NameValuePair> value) {
        this.value = value;
        return this;
    }
    public java.util.List<NameValuePair> getValue() {
        return this.value;
    }

}
