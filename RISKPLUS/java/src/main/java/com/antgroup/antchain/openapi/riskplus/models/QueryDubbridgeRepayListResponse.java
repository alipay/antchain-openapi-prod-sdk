// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayListResponse extends TeaModel {
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
    @NameInMap("repay_result_list")
    public java.util.List<RepayResult> repayResultList;

    public static QueryDubbridgeRepayListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayListResponse self = new QueryDubbridgeRepayListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepayListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepayListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepayListResponse setRepayResultList(java.util.List<RepayResult> repayResultList) {
        this.repayResultList = repayResultList;
        return this;
    }
    public java.util.List<RepayResult> getRepayResultList() {
        return this.repayResultList;
    }

}
