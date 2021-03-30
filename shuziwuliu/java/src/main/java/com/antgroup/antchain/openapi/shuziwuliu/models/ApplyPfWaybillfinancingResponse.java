// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyPfWaybillfinancingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资支用Id
    @NameInMap("financing_id")
    public String financingId;

    // 申请状态，
    // 融资申请失败 IN_VALID
    // 融资申请失败 F_APPLY_FAIL
    // 融资申请成功 F_APPLY_SUC
    // 融资申请成功 COMMIT
    // 融资核验中 VERIFYING
    // 融资核验失败 VERIFY_FAILURE
    // 融资订单生成成功 P_WITHDRAW
    // 融资成功 A_WITHDRAW
    // 融资失败 EXPIRED
    @NameInMap("status")
    public String status;

    public static ApplyPfWaybillfinancingResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPfWaybillfinancingResponse self = new ApplyPfWaybillfinancingResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPfWaybillfinancingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPfWaybillfinancingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPfWaybillfinancingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPfWaybillfinancingResponse setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

    public ApplyPfWaybillfinancingResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
