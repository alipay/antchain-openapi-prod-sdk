// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCertClaimurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 证书平台支付宝小程序查验存证的url
    @NameInMap("mini_url")
    public String miniUrl;

    public static CreateAuthCertClaimurlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCertClaimurlResponse self = new CreateAuthCertClaimurlResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthCertClaimurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAuthCertClaimurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAuthCertClaimurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAuthCertClaimurlResponse setMiniUrl(String miniUrl) {
        this.miniUrl = miniUrl;
        return this;
    }
    public String getMiniUrl() {
        return this.miniUrl;
    }

}
