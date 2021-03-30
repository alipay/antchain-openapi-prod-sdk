// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CheckPfVoucherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果
    @NameInMap("check_results")
    public java.util.List<PfVoucherCheckResult> checkResults;

    public static CheckPfVoucherResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPfVoucherResponse self = new CheckPfVoucherResponse();
        return TeaModel.build(map, self);
    }

    public CheckPfVoucherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckPfVoucherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckPfVoucherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckPfVoucherResponse setCheckResults(java.util.List<PfVoucherCheckResult> checkResults) {
        this.checkResults = checkResults;
        return this;
    }
    public java.util.List<PfVoucherCheckResult> getCheckResults() {
        return this.checkResults;
    }

}
