// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheRepayListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款计划查询结果
    @NameInMap("repay_ref_list")
    public java.util.List<RepayRef> repayRefList;

    public static QueryDubheRepayListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheRepayListResponse self = new QueryDubheRepayListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubheRepayListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubheRepayListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubheRepayListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubheRepayListResponse setRepayRefList(java.util.List<RepayRef> repayRefList) {
        this.repayRefList = repayRefList;
        return this;
    }
    public java.util.List<RepayRef> getRepayRefList() {
        return this.repayRefList;
    }

}
