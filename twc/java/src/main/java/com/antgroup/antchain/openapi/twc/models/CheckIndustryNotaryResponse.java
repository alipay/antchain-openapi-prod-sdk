// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckIndustryNotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果数组
    @NameInMap("notary_check_results")
    public java.util.List<NotaryCheckResult> notaryCheckResults;

    public static CheckIndustryNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIndustryNotaryResponse self = new CheckIndustryNotaryResponse();
        return TeaModel.build(map, self);
    }

    public CheckIndustryNotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckIndustryNotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckIndustryNotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckIndustryNotaryResponse setNotaryCheckResults(java.util.List<NotaryCheckResult> notaryCheckResults) {
        this.notaryCheckResults = notaryCheckResults;
        return this;
    }
    public java.util.List<NotaryCheckResult> getNotaryCheckResults() {
        return this.notaryCheckResults;
    }

}
