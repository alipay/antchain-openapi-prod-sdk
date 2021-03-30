// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuefinanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 错误信息
    @NameInMap("err_msg")
    public String errMsg;

    // 融资失败，回转至无车承运平台失败金额
    @NameInMap("fail_amt")
    public String failAmt;

    // 融资失败，回转至无车承运平台成功金额
    @NameInMap("fail_transfer_amt")
    public String failTransferAmt;

    // 请求时传入的全局业务号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入 
    @NameInMap("status")
    public Long status;

    // 融资成功金额
    @NameInMap("success_amt")
    public String successAmt;

    public static QueryCreditIssuefinanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuefinanceResponse self = new QueryCreditIssuefinanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuefinanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssuefinanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssuefinanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssuefinanceResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public QueryCreditIssuefinanceResponse setFailAmt(String failAmt) {
        this.failAmt = failAmt;
        return this;
    }
    public String getFailAmt() {
        return this.failAmt;
    }

    public QueryCreditIssuefinanceResponse setFailTransferAmt(String failTransferAmt) {
        this.failTransferAmt = failTransferAmt;
        return this;
    }
    public String getFailTransferAmt() {
        return this.failTransferAmt;
    }

    public QueryCreditIssuefinanceResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public QueryCreditIssuefinanceResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryCreditIssuefinanceResponse setSuccessAmt(String successAmt) {
        this.successAmt = successAmt;
        return this;
    }
    public String getSuccessAmt() {
        return this.successAmt;
    }

}
