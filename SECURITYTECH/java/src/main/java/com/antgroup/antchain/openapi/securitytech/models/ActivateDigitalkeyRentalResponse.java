// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ActivateDigitalkeyRentalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主钥匙ID
    @NameInMap("master_key_id")
    public String masterKeyId;

    public static ActivateDigitalkeyRentalResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateDigitalkeyRentalResponse self = new ActivateDigitalkeyRentalResponse();
        return TeaModel.build(map, self);
    }

    public ActivateDigitalkeyRentalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ActivateDigitalkeyRentalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ActivateDigitalkeyRentalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ActivateDigitalkeyRentalResponse setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }
    public String getMasterKeyId() {
        return this.masterKeyId;
    }

}
