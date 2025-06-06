// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifyTrustloginTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 验证结果，valid有效，invalid无效
    @NameInMap("result")
    public String result;

    public static VerifyTrustloginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyTrustloginTokenResponse self = new VerifyTrustloginTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyTrustloginTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyTrustloginTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyTrustloginTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyTrustloginTokenResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyTrustloginTokenResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
