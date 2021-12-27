// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyFinserviceZhimaIdentifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
