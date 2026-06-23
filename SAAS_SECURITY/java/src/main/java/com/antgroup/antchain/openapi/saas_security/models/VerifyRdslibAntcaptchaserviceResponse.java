// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class VerifyRdslibAntcaptchaserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否是机器人
    @NameInMap("data")
    public RdslibAntcaptchaservice data;

    public static VerifyRdslibAntcaptchaserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyRdslibAntcaptchaserviceResponse self = new VerifyRdslibAntcaptchaserviceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyRdslibAntcaptchaserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyRdslibAntcaptchaserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyRdslibAntcaptchaserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyRdslibAntcaptchaserviceResponse setData(RdslibAntcaptchaservice data) {
        this.data = data;
        return this;
    }
    public RdslibAntcaptchaservice getData() {
        return this.data;
    }

}
