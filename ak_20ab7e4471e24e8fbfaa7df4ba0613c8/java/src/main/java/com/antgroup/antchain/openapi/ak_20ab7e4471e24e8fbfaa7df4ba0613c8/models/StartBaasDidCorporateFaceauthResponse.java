// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidCorporateFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证ID
    @NameInMap("certify_id")
    public String certifyId;

    // 二维码URL，用户支付宝扫一扫实人认证
    @NameInMap("certify_url")
    public String certifyUrl;

    public static StartBaasDidCorporateFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidCorporateFaceauthResponse self = new StartBaasDidCorporateFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public StartBaasDidCorporateFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartBaasDidCorporateFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartBaasDidCorporateFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartBaasDidCorporateFaceauthResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public StartBaasDidCorporateFaceauthResponse setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

}
