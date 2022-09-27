// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class QueryMap extends TeaModel {
    // 查询枚举：QueryTypeEnum
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 查询参数
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
