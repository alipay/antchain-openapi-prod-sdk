// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class VerifySaasSecurityRdslibAntcaptchaserviceResponse extends TeaModel {
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

    public static VerifySaasSecurityRdslibAntcaptchaserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySaasSecurityRdslibAntcaptchaserviceResponse self = new VerifySaasSecurityRdslibAntcaptchaserviceResponse();
        return TeaModel.build(map, self);
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifySaasSecurityRdslibAntcaptchaserviceResponse setData(RdslibAntcaptchaservice data) {
        this.data = data;
        return this;
    }
    public RdslibAntcaptchaservice getData() {
        return this.data;
    }

}
