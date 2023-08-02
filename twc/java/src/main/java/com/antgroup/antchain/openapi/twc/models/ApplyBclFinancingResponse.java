// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyBclFinancingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资申请单号
    @NameInMap("financing_apply_no")
    public String financingApplyNo;

    public static ApplyBclFinancingResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBclFinancingResponse self = new ApplyBclFinancingResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBclFinancingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyBclFinancingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyBclFinancingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyBclFinancingResponse setFinancingApplyNo(String financingApplyNo) {
        this.financingApplyNo = financingApplyNo;
        return this;
    }
    public String getFinancingApplyNo() {
        return this.financingApplyNo;
    }

}
