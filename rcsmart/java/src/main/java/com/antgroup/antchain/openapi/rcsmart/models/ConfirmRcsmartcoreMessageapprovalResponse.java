// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rcsmart.models;

import com.aliyun.tea.*;

public class ConfirmRcsmartcoreMessageapprovalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("code")
    public String code;

    // 返回码描述
    @NameInMap("msg")
    public String msg;

    // 业务处理结果码
    @NameInMap("sub_code")
    public String subCode;

    // 返回的提示信息
    @NameInMap("sub_msg")
    public String subMsg;

    // 是否可重试
    @NameInMap("retry")
    public Boolean retry;

    public static ConfirmRcsmartcoreMessageapprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRcsmartcoreMessageapprovalResponse self = new ConfirmRcsmartcoreMessageapprovalResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public ConfirmRcsmartcoreMessageapprovalResponse setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

}
