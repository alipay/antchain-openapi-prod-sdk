// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyFinserviceZhimaIdentifyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
    @NameInMap("data")
    public ZhimaIdentifyResp data;

    public static VerifyFinserviceZhimaIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFinserviceZhimaIdentifyResponse self = new VerifyFinserviceZhimaIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFinserviceZhimaIdentifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyFinserviceZhimaIdentifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyFinserviceZhimaIdentifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyFinserviceZhimaIdentifyResponse setData(ZhimaIdentifyResp data) {
        this.data = data;
        return this;
    }
    public ZhimaIdentifyResp getData() {
        return this.data;
    }

}
