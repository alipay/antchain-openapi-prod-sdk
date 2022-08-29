// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RuntimeResult extends TeaModel {
    // 上传成功
    @NameInMap("code")
    @Validation(required = true)
    public Long code;

    // true代表上传成功，false代表上传失败
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 上文件传成功
    @NameInMap("resultmsg")
    @Validation(required = true)
    public String resultmsg;

    // 文件上传结果
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static RuntimeResult build(java.util.Map<String, ?> map) throws Exception {
        RuntimeResult self = new RuntimeResult();
        return TeaModel.build(map, self);
    }

    public RuntimeResult setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public RuntimeResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RuntimeResult setResultmsg(String resultmsg) {
        this.resultmsg = resultmsg;
        return this;
    }
    public String getResultmsg() {
        return this.resultmsg;
    }

    public RuntimeResult setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
