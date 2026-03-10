// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditamtLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回描述信息
    @NameInMap("msg")
    public String msg;

    // 查询状态，0. 查询成功
    // 1. 查询失败---表示“拒绝”的有效终态，下一步重新调用授信申请接口
    @NameInMap("status")
    public Long status;

    // 剩余可用额度,授信成功必填,单位:元
    @NameInMap("credit_remain_amt")
    public String creditRemainAmt;

    // 授信批准的额度，授信成功必填,单位:元
    @NameInMap("credit_amt")
    public String creditAmt;

    // 授信生效日期，授信审核通过时必填,格式：yyyy-MM-dd
    @NameInMap("credit_valid_date")
    public String creditValidDate;

    // 授信失效日期，授信审核通过时必填,格式：yyyy-MM-dd  
    @NameInMap("credit_expire_date")
    public String creditExpireDate;

    public static QueryDubbridgeCreditamtLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditamtLxResponse self = new QueryDubbridgeCreditamtLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditamtLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCreditamtLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCreditamtLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCreditamtLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeCreditamtLxResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryDubbridgeCreditamtLxResponse setCreditRemainAmt(String creditRemainAmt) {
        this.creditRemainAmt = creditRemainAmt;
        return this;
    }
    public String getCreditRemainAmt() {
        return this.creditRemainAmt;
    }

    public QueryDubbridgeCreditamtLxResponse setCreditAmt(String creditAmt) {
        this.creditAmt = creditAmt;
        return this;
    }
    public String getCreditAmt() {
        return this.creditAmt;
    }

    public QueryDubbridgeCreditamtLxResponse setCreditValidDate(String creditValidDate) {
        this.creditValidDate = creditValidDate;
        return this;
    }
    public String getCreditValidDate() {
        return this.creditValidDate;
    }

    public QueryDubbridgeCreditamtLxResponse setCreditExpireDate(String creditExpireDate) {
        this.creditExpireDate = creditExpireDate;
        return this;
    }
    public String getCreditExpireDate() {
        return this.creditExpireDate;
    }

}
