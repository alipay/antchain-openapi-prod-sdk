// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class BizErrorInfo extends TeaModel {
    // code
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 异常信息
    /**
     * <strong>example:</strong>
     * <p>error_msg</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // params
    /**
     * <strong>example:</strong>
     * <p>params</p>
     */
    @NameInMap("params")
    public String params;

    public static BizErrorInfo build(java.util.Map<String, ?> map) throws Exception {
        BizErrorInfo self = new BizErrorInfo();
        return TeaModel.build(map, self);
    }

    public BizErrorInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BizErrorInfo setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BizErrorInfo setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
