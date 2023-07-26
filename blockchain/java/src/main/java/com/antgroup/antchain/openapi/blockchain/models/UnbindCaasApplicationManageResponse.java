// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnbindCaasApplicationManageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应版本号
    @NameInMap("version")
    public String version;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 异常码
    @NameInMap("error_code")
    public String errorCode;

    // 异常信息
    @NameInMap("error_msg")
    public String errorMsg;

    public static UnbindCaasApplicationManageResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindCaasApplicationManageResponse self = new UnbindCaasApplicationManageResponse();
        return TeaModel.build(map, self);
    }

    public UnbindCaasApplicationManageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnbindCaasApplicationManageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnbindCaasApplicationManageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnbindCaasApplicationManageResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UnbindCaasApplicationManageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UnbindCaasApplicationManageResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnbindCaasApplicationManageResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
