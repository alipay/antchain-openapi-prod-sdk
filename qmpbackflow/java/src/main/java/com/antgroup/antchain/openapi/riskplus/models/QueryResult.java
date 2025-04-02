// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryResult extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static QueryResult build(java.util.Map<String, ?> map) throws Exception {
        QueryResult self = new QueryResult();
        return TeaModel.build(map, self);
    }

    public QueryResult setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryResult setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
