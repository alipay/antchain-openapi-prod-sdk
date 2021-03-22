// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryEquityCreateresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 权益商品创建成功，返回权益ID
    @NameInMap("equity_id")
    public String equityId;

    public static QueryEquityCreateresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEquityCreateresultResponse self = new QueryEquityCreateresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryEquityCreateresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEquityCreateresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEquityCreateresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEquityCreateresultResponse setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

}
