// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditstatusLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信审核状态
    // 0. 授信成功
    // 1. 授信失败
    // 2. 授信中（重试查询）
    // 3. 查无此单（按1授信失败处理，订单轮询至下一资方）
    @NameInMap("audit_state")
    public Long auditState;

    // 业务错误码
    // 无异常=0 ，不同异常，返回不同的code
    @NameInMap("error_code")
    public Long errorCode;

    // 授信失败必填，描述具体的失败原因，用于运营分析
    @NameInMap("msg")
    public String msg;

    // 授信成功必填,授信成功后，资方的授信编号，后续用信/支用时用到
    @NameInMap("credit_no")
    public String creditNo;

    // 授信批准的额度，授信成功必填，单位:元
    @NameInMap("credit_amt")
    public Long creditAmt;

    // 授信生效日期，授信审核通过时必填，格式：yyyy-MM-dd
    @NameInMap("credit_valid_date")
    public String creditValidDate;

    // 授信失效日期，授信审核通过时必填，格式：yyyy-MM-dd  ,如果授信的当前日期大于
    // 等于失效日期,就认为失效
    @NameInMap("credit_expire_date")
    public String creditExpireDate;

    public static QueryDubbridgeCreditstatusLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditstatusLxResponse self = new QueryDubbridgeCreditstatusLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditstatusLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCreditstatusLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCreditstatusLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCreditstatusLxResponse setAuditState(Long auditState) {
        this.auditState = auditState;
        return this;
    }
    public Long getAuditState() {
        return this.auditState;
    }

    public QueryDubbridgeCreditstatusLxResponse setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryDubbridgeCreditstatusLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeCreditstatusLxResponse setCreditNo(String creditNo) {
        this.creditNo = creditNo;
        return this;
    }
    public String getCreditNo() {
        return this.creditNo;
    }

    public QueryDubbridgeCreditstatusLxResponse setCreditAmt(Long creditAmt) {
        this.creditAmt = creditAmt;
        return this;
    }
    public Long getCreditAmt() {
        return this.creditAmt;
    }

    public QueryDubbridgeCreditstatusLxResponse setCreditValidDate(String creditValidDate) {
        this.creditValidDate = creditValidDate;
        return this;
    }
    public String getCreditValidDate() {
        return this.creditValidDate;
    }

    public QueryDubbridgeCreditstatusLxResponse setCreditExpireDate(String creditExpireDate) {
        this.creditExpireDate = creditExpireDate;
        return this;
    }
    public String getCreditExpireDate() {
        return this.creditExpireDate;
    }

}
