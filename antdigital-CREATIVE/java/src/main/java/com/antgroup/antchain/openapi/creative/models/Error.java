// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class Error extends TeaModel {
    // 错误码
    /**
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("code")
    public String code;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>参数无效</p>
     */
    @NameInMap("message")
    public String message;

    public static Error build(java.util.Map<String, ?> map) throws Exception {
        Error self = new Error();
        return TeaModel.build(map, self);
    }

    public Error setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Error setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
