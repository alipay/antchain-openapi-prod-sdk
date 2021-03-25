// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisOpenedequitiesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 权益商品信息详细信息list
    @NameInMap("equities")
    public java.util.List<OpenedEquity> equities;

    public static QueryBlockanalysisOpenedequitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisOpenedequitiesResponse self = new QueryBlockanalysisOpenedequitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisOpenedequitiesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisOpenedequitiesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisOpenedequitiesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisOpenedequitiesResponse setEquities(java.util.List<OpenedEquity> equities) {
        this.equities = equities;
        return this;
    }
    public java.util.List<OpenedEquity> getEquities() {
        return this.equities;
    }

}
