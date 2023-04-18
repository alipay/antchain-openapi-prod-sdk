// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31a66bf9ba7c431fa33f8eed7c26ebd2.models;

import com.aliyun.tea.*;

public class BizResult extends TeaModel {
    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 是否重试
    @NameInMap("need_retry")
    @Validation(required = true)
    public Boolean needRetry;

    // 失败错误信息
    @NameInMap("error_view_msg")
    public String errorViewMsg;

    // 成功返回信息，与function相匹配
    @NameInMap("encoded_result_obj")
    public String encodedResultObj;

    public static BizResult build(java.util.Map<String, ?> map) throws Exception {
        BizResult self = new BizResult();
        return TeaModel.build(map, self);
    }

    public BizResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BizResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BizResult setNeedRetry(Boolean needRetry) {
        this.needRetry = needRetry;
        return this;
    }
    public Boolean getNeedRetry() {
        return this.needRetry;
    }

    public BizResult setErrorViewMsg(String errorViewMsg) {
        this.errorViewMsg = errorViewMsg;
        return this;
    }
    public String getErrorViewMsg() {
        return this.errorViewMsg;
    }

    public BizResult setEncodedResultObj(String encodedResultObj) {
        this.encodedResultObj = encodedResultObj;
        return this;
    }
    public String getEncodedResultObj() {
        return this.encodedResultObj;
    }

}
