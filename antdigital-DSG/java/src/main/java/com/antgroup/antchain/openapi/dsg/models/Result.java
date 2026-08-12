// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class Result extends TeaModel {
    // 识别结果
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("result")
    public java.util.List<SensitiveEntity> result;

    // 调用是否成功
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static Result build(java.util.Map<String, ?> map) throws Exception {
        Result self = new Result();
        return TeaModel.build(map, self);
    }

    public Result setResult(java.util.List<SensitiveEntity> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SensitiveEntity> getResult() {
        return this.result;
    }

    public Result setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public Result setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public Result setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
