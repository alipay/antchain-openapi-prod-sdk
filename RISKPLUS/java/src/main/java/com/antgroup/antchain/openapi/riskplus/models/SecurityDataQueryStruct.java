// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SecurityDataQueryStruct extends TeaModel {
    // 请求数据参数
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 请求数据类型
    /**
     * <strong>example:</strong>
     * <p>IP</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 请求数据版本
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static SecurityDataQueryStruct build(java.util.Map<String, ?> map) throws Exception {
        SecurityDataQueryStruct self = new SecurityDataQueryStruct();
        return TeaModel.build(map, self);
    }

    public SecurityDataQueryStruct setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SecurityDataQueryStruct setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SecurityDataQueryStruct setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
