// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class MayaStreamResult extends TeaModel {
    // maya响应数据
    @NameInMap("data")
    @Validation(required = true)
    public MayaRedGptResponseDTO data;

    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>maya平台调用失败</p>
     */
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
