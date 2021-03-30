// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuereceivableResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已清分金额
    @NameInMap("clear_amt")
    public String clearAmt;

    // 代偿金额
    @NameInMap("compensate_amt")
    public String compensateAmt;

    // 错误信息
    @NameInMap("err_msg")
    public String errMsg;

    // 完成日期 long类型字符串
    @NameInMap("finish_date")
    public String finishDate;

    // 是否代偿,true为代偿，false为不代偿
    @NameInMap("has_compensate")
    public Boolean hasCompensate;

    // 信用凭证id
    @NameInMap("issue_id")
    public String issueId;

    // 全局唯一业务号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 外部订单号，也就是凭证发行时传递的支付订单
    @NameInMap("out_order_no")
    public String outOrderNo;

    // 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
    @NameInMap("product_id")
    public String productId;

    // 清分结果状态--- 0：未清分， 1：清分完成
    @NameInMap("status")
    public Long status;

    // 凭证总金额
    @NameInMap("total_amt")
    public String totalAmt;

    // 清分类型--主动清分 、 到期清分
    @NameInMap("type")
    public String type;

    public static QueryCreditIssuereceivableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuereceivableResponse self = new QueryCreditIssuereceivableResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuereceivableResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssuereceivableResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssuereceivableResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssuereceivableResponse setClearAmt(String clearAmt) {
        this.clearAmt = clearAmt;
        return this;
    }
    public String getClearAmt() {
        return this.clearAmt;
    }

    public QueryCreditIssuereceivableResponse setCompensateAmt(String compensateAmt) {
        this.compensateAmt = compensateAmt;
        return this;
    }
    public String getCompensateAmt() {
        return this.compensateAmt;
    }

    public QueryCreditIssuereceivableResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public QueryCreditIssuereceivableResponse setFinishDate(String finishDate) {
        this.finishDate = finishDate;
        return this;
    }
    public String getFinishDate() {
        return this.finishDate;
    }

    public QueryCreditIssuereceivableResponse setHasCompensate(Boolean hasCompensate) {
        this.hasCompensate = hasCompensate;
        return this;
    }
    public Boolean getHasCompensate() {
        return this.hasCompensate;
    }

    public QueryCreditIssuereceivableResponse setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssuereceivableResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public QueryCreditIssuereceivableResponse setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public QueryCreditIssuereceivableResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditIssuereceivableResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryCreditIssuereceivableResponse setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
        return this;
    }
    public String getTotalAmt() {
        return this.totalAmt;
    }

    public QueryCreditIssuereceivableResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
