// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证核验结果
    @NameInMap("notary_check_results")
    public java.util.List<NotaryCheckResult> notaryCheckResults;

    public static CheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckStatusResponse self = new CheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckStatusResponse setNotaryCheckResults(java.util.List<NotaryCheckResult> notaryCheckResults) {
        this.notaryCheckResults = notaryCheckResults;
        return this;
    }
    public java.util.List<NotaryCheckResult> getNotaryCheckResults() {
        return this.notaryCheckResults;
    }

}
