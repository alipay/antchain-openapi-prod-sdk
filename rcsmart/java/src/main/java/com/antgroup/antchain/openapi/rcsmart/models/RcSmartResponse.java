// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rcsmart.models;

import com.aliyun.tea.*;

public class RcSmartResponse extends TeaModel {
    // 100001
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回码描述
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // 业务处理结果码
    @NameInMap("sub_code")
    public String subCode;

    // 返回的提示信息
    @NameInMap("sub_msg")
    public String subMsg;

    // 可否重试
    @NameInMap("retry")
    @Validation(required = true)
    public Boolean retry;

    public static RcSmartResponse build(java.util.Map<String, ?> map) throws Exception {
        RcSmartResponse self = new RcSmartResponse();
        return TeaModel.build(map, self);
    }

    public RcSmartResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RcSmartResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public RcSmartResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RcSmartResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public RcSmartResponse setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

}
