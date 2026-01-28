// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class BaseResult extends TeaModel {
    // success
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // errorCode
    /**
     * <strong>example:</strong>
     * <p>errorCode</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // message
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // tabledto
    /**
     * <strong>example:</strong>
     * <p>tabledto</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public TableDTO data;

    public static BaseResult build(java.util.Map<String, ?> map) throws Exception {
        BaseResult self = new BaseResult();
        return TeaModel.build(map, self);
    }

    public BaseResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BaseResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BaseResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BaseResult setData(TableDTO data) {
        this.data = data;
        return this;
    }
    public TableDTO getData() {
        return this.data;
    }

}
