// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecWithdrawCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 兑现状态：ACCEPTED / FAILED
    @NameInMap("withdraw_status")
    public String withdrawStatus;

    // 税优签约链接
    @NameInMap("sign_url")
    public String signUrl;

    public static ExecWithdrawCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecWithdrawCreateResponse self = new ExecWithdrawCreateResponse();
        return TeaModel.build(map, self);
    }

    public ExecWithdrawCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecWithdrawCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecWithdrawCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecWithdrawCreateResponse setWithdrawStatus(String withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
        return this;
    }
    public String getWithdrawStatus() {
        return this.withdrawStatus;
    }

    public ExecWithdrawCreateResponse setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
