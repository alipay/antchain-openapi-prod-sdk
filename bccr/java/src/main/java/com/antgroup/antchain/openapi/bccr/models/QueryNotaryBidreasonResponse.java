// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryBidreasonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申办事由列表
    @NameInMap("bid_reason_list")
    public java.util.List<BidReason> bidReasonList;

    public static QueryNotaryBidreasonResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryBidreasonResponse self = new QueryNotaryBidreasonResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotaryBidreasonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotaryBidreasonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotaryBidreasonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotaryBidreasonResponse setBidReasonList(java.util.List<BidReason> bidReasonList) {
        this.bidReasonList = bidReasonList;
        return this;
    }
    public java.util.List<BidReason> getBidReasonList() {
        return this.bidReasonList;
    }

}
