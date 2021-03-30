// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfPledgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账单id
    @NameInMap("bill_id")
    public String billId;

    // 融资主体did
    @NameInMap("financing_subject_did")
    public String financingSubjectDid;

    // 已提交  COMMIT
    // 推送中 PUSHING
    // 推送成功 PUSH_SUC
    // 推送失败 PUSH_FAIL
    @NameInMap("status")
    public String status;

    // 状态描述
    @NameInMap("desc")
    public String desc;

    public static QueryPfPledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfPledgeResponse self = new QueryPfPledgeResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfPledgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfPledgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfPledgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfPledgeResponse setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public QueryPfPledgeResponse setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public QueryPfPledgeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryPfPledgeResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
