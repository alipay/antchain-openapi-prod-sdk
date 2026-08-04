// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SubmitAntchainDasKyaVcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // vcId
    @NameInMap("vc_id")
    public String vcId;

    public static SubmitAntchainDasKyaVcResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainDasKyaVcResponse self = new SubmitAntchainDasKyaVcResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainDasKyaVcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAntchainDasKyaVcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAntchainDasKyaVcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAntchainDasKyaVcResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
