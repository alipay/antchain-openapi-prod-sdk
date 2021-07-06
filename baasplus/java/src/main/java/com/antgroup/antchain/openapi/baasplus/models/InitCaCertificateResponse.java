// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitCaCertificateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 证书序列号
    @NameInMap("cert_sn")
    public String certSn;

    // 证书内容
    @NameInMap("p10")
    public String p10;

    public static InitCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        InitCaCertificateResponse self = new InitCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public InitCaCertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitCaCertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitCaCertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitCaCertificateResponse setCertSn(String certSn) {
        this.certSn = certSn;
        return this;
    }
    public String getCertSn() {
        return this.certSn;
    }

    public InitCaCertificateResponse setP10(String p10) {
        this.p10 = p10;
        return this;
    }
    public String getP10() {
        return this.p10;
    }

}
