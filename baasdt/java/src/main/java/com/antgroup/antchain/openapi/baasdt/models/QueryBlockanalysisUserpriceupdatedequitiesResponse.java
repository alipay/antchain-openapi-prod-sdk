// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisUserpriceupdatedequitiesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 权益商品信息详细信息list
    @NameInMap("equities")
    public java.util.List<UserPriceEquity> equities;

    public static QueryBlockanalysisUserpriceupdatedequitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisUserpriceupdatedequitiesResponse self = new QueryBlockanalysisUserpriceupdatedequitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisUserpriceupdatedequitiesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisUserpriceupdatedequitiesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisUserpriceupdatedequitiesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisUserpriceupdatedequitiesResponse setEquities(java.util.List<UserPriceEquity> equities) {
        this.equities = equities;
        return this;
    }
    public java.util.List<UserPriceEquity> getEquities() {
        return this.equities;
    }

}
