// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuetransferResponse extends TeaModel {
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

    // 转让失败金额
    @NameInMap("fail_amt")
    public String failAmt;

    // 信用凭证号
    @NameInMap("issue_id")
    public String issueId;

    // 请求时传入的全局业务号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 转入方分布式数字身份
    @NameInMap("payee_did")
    public String payeeDid;

    // 转出方分布式数字身份
    @NameInMap("payer_did")
    public String payerDid;

    // 产品id
    @NameInMap("product_id")
    public String productId;

    // 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
    @NameInMap("status")
    public Long status;

    // 转让成功金额
    @NameInMap("success_amt")
    public String successAmt;

    public static QueryCreditIssuetransferResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuetransferResponse self = new QueryCreditIssuetransferResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuetransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssuetransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssuetransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssuetransferResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public QueryCreditIssuetransferResponse setFailAmt(String failAmt) {
        this.failAmt = failAmt;
        return this;
    }
    public String getFailAmt() {
        return this.failAmt;
    }

    public QueryCreditIssuetransferResponse setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssuetransferResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public QueryCreditIssuetransferResponse setPayeeDid(String payeeDid) {
        this.payeeDid = payeeDid;
        return this;
    }
    public String getPayeeDid() {
        return this.payeeDid;
    }

    public QueryCreditIssuetransferResponse setPayerDid(String payerDid) {
        this.payerDid = payerDid;
        return this;
    }
    public String getPayerDid() {
        return this.payerDid;
    }

    public QueryCreditIssuetransferResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditIssuetransferResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryCreditIssuetransferResponse setSuccessAmt(String successAmt) {
        this.successAmt = successAmt;
        return this;
    }
    public String getSuccessAmt() {
        return this.successAmt;
    }

}
