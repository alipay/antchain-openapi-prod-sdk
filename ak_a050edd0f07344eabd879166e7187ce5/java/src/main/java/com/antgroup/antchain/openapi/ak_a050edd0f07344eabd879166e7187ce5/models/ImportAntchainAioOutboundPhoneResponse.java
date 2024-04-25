// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class ImportAntchainAioOutboundPhoneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("success")
    public Boolean success;

    // 返回码
    @NameInMap("code")
    public String code;

    // 描述
    @NameInMap("message")
    public String message;

    // 内容
    @NameInMap("data")
    public OutboundPhoneResponseData data;

    public static ImportAntchainAioOutboundPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAntchainAioOutboundPhoneResponse self = new ImportAntchainAioOutboundPhoneResponse();
        return TeaModel.build(map, self);
    }

    public ImportAntchainAioOutboundPhoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportAntchainAioOutboundPhoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportAntchainAioOutboundPhoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportAntchainAioOutboundPhoneResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportAntchainAioOutboundPhoneResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportAntchainAioOutboundPhoneResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportAntchainAioOutboundPhoneResponse setData(OutboundPhoneResponseData data) {
        this.data = data;
        return this;
    }
    public OutboundPhoneResponseData getData() {
        return this.data;
    }

}
