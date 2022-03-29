// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XKeyJson extends TeaModel {
    //  
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // json string
    @NameInMap("json")
    @Validation(required = true)
    public String json;

    public static XKeyJson build(java.util.Map<String, ?> map) throws Exception {
        XKeyJson self = new XKeyJson();
        return TeaModel.build(map, self);
    }

    public XKeyJson setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public XKeyJson setJson(String json) {
        this.json = json;
        return this;
    }
    public String getJson() {
        return this.json;
    }

}
