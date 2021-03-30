// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfFinancingqualificationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求号
    @NameInMap("apl_seq_no")
    public String aplSeqNo;

    // 申请日期
    @NameInMap("app_date")
    public String appDate;

    // 审批通过时间
    // 
    // 
    @NameInMap("approve_date")
    public String approveDate;

    // 额度协议文件编号
    // 
    // 
    @NameInMap("amnt_agrmnt_fn")
    public String amntAgrmntFn;

    // 处理状态
    // A01-审批中
    // A02-审批失败
    // A03-审批通过
    // A04-审批作废
    @NameInMap("proce_status")
    public String proceStatus;

    // 失败原因
    @NameInMap("fail_rslt")
    public String failRslt;

    // 错误码
    @NameInMap("gen_reason")
    public String genReason;

    public static QueryPfFinancingqualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfFinancingqualificationResponse self = new QueryPfFinancingqualificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfFinancingqualificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfFinancingqualificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfFinancingqualificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfFinancingqualificationResponse setAplSeqNo(String aplSeqNo) {
        this.aplSeqNo = aplSeqNo;
        return this;
    }
    public String getAplSeqNo() {
        return this.aplSeqNo;
    }

    public QueryPfFinancingqualificationResponse setAppDate(String appDate) {
        this.appDate = appDate;
        return this;
    }
    public String getAppDate() {
        return this.appDate;
    }

    public QueryPfFinancingqualificationResponse setApproveDate(String approveDate) {
        this.approveDate = approveDate;
        return this;
    }
    public String getApproveDate() {
        return this.approveDate;
    }

    public QueryPfFinancingqualificationResponse setAmntAgrmntFn(String amntAgrmntFn) {
        this.amntAgrmntFn = amntAgrmntFn;
        return this;
    }
    public String getAmntAgrmntFn() {
        return this.amntAgrmntFn;
    }

    public QueryPfFinancingqualificationResponse setProceStatus(String proceStatus) {
        this.proceStatus = proceStatus;
        return this;
    }
    public String getProceStatus() {
        return this.proceStatus;
    }

    public QueryPfFinancingqualificationResponse setFailRslt(String failRslt) {
        this.failRslt = failRslt;
        return this;
    }
    public String getFailRslt() {
        return this.failRslt;
    }

    public QueryPfFinancingqualificationResponse setGenReason(String genReason) {
        this.genReason = genReason;
        return this;
    }
    public String getGenReason() {
        return this.genReason;
    }

}
