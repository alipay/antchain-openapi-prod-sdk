// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class MayaStreamResult extends TeaModel {
    // maya响应数据
    @NameInMap("data")
    @Validation(required = true)
    public MayaRedGptResponseDTO data;

    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 错误码
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误信息
    @NameInMap("error_msg")
    @Validation(required = true)
    public String errorMsg;

    public static MayaStreamResult build(java.util.Map<String, ?> map) throws Exception {
        MayaStreamResult self = new MayaStreamResult();
        return TeaModel.build(map, self);
    }

    public MayaStreamResult setData(MayaRedGptResponseDTO data) {
        this.data = data;
        return this;
    }
    public MayaRedGptResponseDTO getData() {
        return this.data;
    }

    public MayaStreamResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MayaStreamResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MayaStreamResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
