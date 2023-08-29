// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class InitAntchainEkycVerificationNativeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实人认证id
    @NameInMap("certify_id")
    public String certifyId;

    // 预留扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    // 产品结果明细，不影响决策
    @NameInMap("result_code_sub")
    public String resultCodeSub;

    // result_code_sub对应的文案
    @NameInMap("result_msg_sub")
    public String resultMsgSub;

    public static InitAntchainEkycVerificationNativeResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainEkycVerificationNativeResponse self = new InitAntchainEkycVerificationNativeResponse();
        return TeaModel.build(map, self);
    }

    public InitAntchainEkycVerificationNativeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitAntchainEkycVerificationNativeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitAntchainEkycVerificationNativeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitAntchainEkycVerificationNativeResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitAntchainEkycVerificationNativeResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public InitAntchainEkycVerificationNativeResponse setResultCodeSub(String resultCodeSub) {
        this.resultCodeSub = resultCodeSub;
        return this;
    }
    public String getResultCodeSub() {
        return this.resultCodeSub;
    }

    public InitAntchainEkycVerificationNativeResponse setResultMsgSub(String resultMsgSub) {
        this.resultMsgSub = resultMsgSub;
        return this;
    }
    public String getResultMsgSub() {
        return this.resultMsgSub;
    }

}
