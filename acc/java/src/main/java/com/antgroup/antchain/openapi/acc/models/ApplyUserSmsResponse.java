// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ApplyUserSmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 短信重新触发url
    // 
    // 
    @NameInMap("sms_resend_url")
    public String smsResendUrl;

    // 核验id
    // 
    // 
    @NameInMap("verify_id")
    public String verifyId;

    // did_24c93459216945468fdf1d899c521910
    @NameInMap("did")
    public String did;

    public static ApplyUserSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyUserSmsResponse self = new ApplyUserSmsResponse();
        return TeaModel.build(map, self);
    }

    public ApplyUserSmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyUserSmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyUserSmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyUserSmsResponse setSmsResendUrl(String smsResendUrl) {
        this.smsResendUrl = smsResendUrl;
        return this;
    }
    public String getSmsResendUrl() {
        return this.smsResendUrl;
    }

    public ApplyUserSmsResponse setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public ApplyUserSmsResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
