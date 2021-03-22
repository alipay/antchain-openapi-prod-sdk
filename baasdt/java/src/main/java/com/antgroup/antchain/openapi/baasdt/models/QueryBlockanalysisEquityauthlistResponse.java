// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisEquityauthlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 商品授权信息（一客一价信息）列表
    @NameInMap("equity_auth_list")
    public java.util.List<EquityAuthInfo> equityAuthList;

    public static QueryBlockanalysisEquityauthlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisEquityauthlistResponse self = new QueryBlockanalysisEquityauthlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisEquityauthlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisEquityauthlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisEquityauthlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisEquityauthlistResponse setEquityAuthList(java.util.List<EquityAuthInfo> equityAuthList) {
        this.equityAuthList = equityAuthList;
        return this;
    }
    public java.util.List<EquityAuthInfo> getEquityAuthList() {
        return this.equityAuthList;
    }

}
