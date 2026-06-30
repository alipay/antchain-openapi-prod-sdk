// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class BizParam extends TeaModel {
    // 参数类型枚举，mobile、cert、biz_license
    /**
     * <strong>example:</strong>
     * <p>·</p>
     */
    @NameInMap("param_key")
    @Validation(required = true)
    public String paramKey;

    // 值，如加密后的手机号
    /**
     * <strong>example:</strong>
     * <p>·</p>
     */
    @NameInMap("param_value")
    @Validation(required = true)
    public String paramValue;

    public static BizParam build(java.util.Map<String, ?> map) throws Exception {
        BizParam self = new BizParam();
        return TeaModel.build(map, self);
    }

    public BizParam setParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }
    public String getParamKey() {
        return this.paramKey;
    }

    public BizParam setParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }
    public String getParamValue() {
        return this.paramValue;
    }

}
