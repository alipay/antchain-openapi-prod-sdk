// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class RepayInsuranceCbrfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 赔案号
    @NameInMap("claim_no")
    public String claimNo;

    // 客户投保时的标的订单号
    @NameInMap("related_order_no")
    public String relatedOrderNo;

    // 保单号
    @NameInMap("policy_no")
    public String policyNo;

    // 幂等标识。true：幂等结果;false：非幂等结果
    @NameInMap("idem_flag")
    public Boolean idemFlag;

    public static RepayInsuranceCbrfResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayInsuranceCbrfResponse self = new RepayInsuranceCbrfResponse();
        return TeaModel.build(map, self);
    }

    public RepayInsuranceCbrfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RepayInsuranceCbrfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RepayInsuranceCbrfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RepayInsuranceCbrfResponse setClaimNo(String claimNo) {
        this.claimNo = claimNo;
        return this;
    }
    public String getClaimNo() {
        return this.claimNo;
    }

    public RepayInsuranceCbrfResponse setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public RepayInsuranceCbrfResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public RepayInsuranceCbrfResponse setIdemFlag(Boolean idemFlag) {
        this.idemFlag = idemFlag;
        return this;
    }
    public Boolean getIdemFlag() {
        return this.idemFlag;
    }

}
