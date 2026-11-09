// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    // 编码
    /**
     * <strong>example:</strong>
     * <p>IS_OK</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 值
    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("value")
    public String value;

    public static Tag build(java.util.Map<String, ?> map) throws Exception {
        Tag self = new Tag();
        return TeaModel.build(map, self);
    }

    public Tag setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Tag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
