// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.idproofing.models;

import com.aliyun.tea.*;

public class VerifyZolozhkRaasIdentityAadhaarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static VerifyZolozhkRaasIdentityAadhaarResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozhkRaasIdentityAadhaarResponse self = new VerifyZolozhkRaasIdentityAadhaarResponse();
        return TeaModel.build(map, self);
    }

    public VerifyZolozhkRaasIdentityAadhaarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyZolozhkRaasIdentityAadhaarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyZolozhkRaasIdentityAadhaarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
