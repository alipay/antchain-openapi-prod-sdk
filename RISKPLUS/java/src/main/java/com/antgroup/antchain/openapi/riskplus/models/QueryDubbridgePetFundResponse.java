// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgePetFundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户资金信息
    @NameInMap("fund_list")
    public java.util.List<UserFundInfo> fundList;

    public static QueryDubbridgePetFundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgePetFundResponse self = new QueryDubbridgePetFundResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgePetFundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgePetFundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgePetFundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgePetFundResponse setFundList(java.util.List<UserFundInfo> fundList) {
        this.fundList = fundList;
        return this;
    }
    public java.util.List<UserFundInfo> getFundList() {
        return this.fundList;
    }

}
