// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class DeleteTrustloginTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true, false
    @NameInMap("result")
    public Boolean result;

    public static DeleteTrustloginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrustloginTokenResponse self = new DeleteTrustloginTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrustloginTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteTrustloginTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteTrustloginTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteTrustloginTokenResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
