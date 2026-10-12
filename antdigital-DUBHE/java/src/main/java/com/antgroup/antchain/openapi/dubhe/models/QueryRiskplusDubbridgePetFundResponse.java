// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgePetFundResponse extends TeaModel {
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

    public static QueryRiskplusDubbridgePetFundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgePetFundResponse self = new QueryRiskplusDubbridgePetFundResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgePetFundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusDubbridgePetFundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusDubbridgePetFundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusDubbridgePetFundResponse setFundList(java.util.List<UserFundInfo> fundList) {
        this.fundList = fundList;
        return this;
    }
    public java.util.List<UserFundInfo> getFundList() {
        return this.fundList;
    }

}
