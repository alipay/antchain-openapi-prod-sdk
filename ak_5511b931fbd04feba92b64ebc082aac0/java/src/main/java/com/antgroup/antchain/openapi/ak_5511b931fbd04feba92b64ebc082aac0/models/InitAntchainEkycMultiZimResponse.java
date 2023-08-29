// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class InitAntchainEkycMultiZimResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预留扩展结果
    @NameInMap("ext_params")
    public String extParams;

    // 协议
    @NameInMap("protocol")
    public String protocol;

    // 返回码
    @NameInMap("ret_code")
    public String retCode;

    // 明细返回码
    @NameInMap("ret_code_sub")
    public String retCodeSub;

    // 明细返回码对应的文案
    @NameInMap("ret_message_sub")
    public String retMessageSub;

    public static InitAntchainEkycMultiZimResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainEkycMultiZimResponse self = new InitAntchainEkycMultiZimResponse();
        return TeaModel.build(map, self);
    }

    public InitAntchainEkycMultiZimResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitAntchainEkycMultiZimResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitAntchainEkycMultiZimResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitAntchainEkycMultiZimResponse setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public InitAntchainEkycMultiZimResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public InitAntchainEkycMultiZimResponse setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public InitAntchainEkycMultiZimResponse setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
        return this;
    }
    public String getRetCodeSub() {
        return this.retCodeSub;
    }

    public InitAntchainEkycMultiZimResponse setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
        return this;
    }
    public String getRetMessageSub() {
        return this.retMessageSub;
    }

}
