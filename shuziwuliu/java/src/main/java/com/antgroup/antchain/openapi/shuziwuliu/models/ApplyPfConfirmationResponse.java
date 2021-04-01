// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyPfConfirmationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资提款确认书 hash	
    // 
    @NameInMap("confirmation_hash")
    public String confirmationHash;

    // 融资提款确认书 OSSkey
    // 
    // 
    @NameInMap("confirmation_oss_key")
    public String confirmationOssKey;

    // 贷款起始日期，格式：yyyyMMdd	
    // 
    // 
    @NameInMap("loan_start_time")
    public String loanStartTime;

    // 贷款到期日期，格式：yyyyMMdd	
    // 
    // 
    @NameInMap("loan_end_time")
    public String loanEndTime;

    // 还款方式
    // 
    // 
    @NameInMap("repayment")
    public String repayment;

    // 贷款利率
    @NameInMap("etrd_ln_int_rt")
    public String etrdLnIntRt;

    public static ApplyPfConfirmationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPfConfirmationResponse self = new ApplyPfConfirmationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPfConfirmationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPfConfirmationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPfConfirmationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPfConfirmationResponse setConfirmationHash(String confirmationHash) {
        this.confirmationHash = confirmationHash;
        return this;
    }
    public String getConfirmationHash() {
        return this.confirmationHash;
    }

    public ApplyPfConfirmationResponse setConfirmationOssKey(String confirmationOssKey) {
        this.confirmationOssKey = confirmationOssKey;
        return this;
    }
    public String getConfirmationOssKey() {
        return this.confirmationOssKey;
    }

    public ApplyPfConfirmationResponse setLoanStartTime(String loanStartTime) {
        this.loanStartTime = loanStartTime;
        return this;
    }
    public String getLoanStartTime() {
        return this.loanStartTime;
    }

    public ApplyPfConfirmationResponse setLoanEndTime(String loanEndTime) {
        this.loanEndTime = loanEndTime;
        return this;
    }
    public String getLoanEndTime() {
        return this.loanEndTime;
    }

    public ApplyPfConfirmationResponse setRepayment(String repayment) {
        this.repayment = repayment;
        return this;
    }
    public String getRepayment() {
        return this.repayment;
    }

    public ApplyPfConfirmationResponse setEtrdLnIntRt(String etrdLnIntRt) {
        this.etrdLnIntRt = etrdLnIntRt;
        return this;
    }
    public String getEtrdLnIntRt() {
        return this.etrdLnIntRt;
    }

}
