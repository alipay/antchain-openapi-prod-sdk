// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeAliyunAuthorityResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 权限校验是否通过
    @NameInMap("result")
    public Boolean result;

    // 失败原因
    @NameInMap("reason")
    public String reason;

    // 解决方案
    @NameInMap("solution")
    public String solution;

    public static JudgeAliyunAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeAliyunAuthorityResponse self = new JudgeAliyunAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public JudgeAliyunAuthorityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public JudgeAliyunAuthorityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public JudgeAliyunAuthorityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public JudgeAliyunAuthorityResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public JudgeAliyunAuthorityResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public JudgeAliyunAuthorityResponse setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
