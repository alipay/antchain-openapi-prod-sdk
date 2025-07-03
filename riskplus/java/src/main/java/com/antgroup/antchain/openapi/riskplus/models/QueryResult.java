// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryResult extends TeaModel {
    // key
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    public String key;

    // value
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
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
