// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerLeadprefilterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 咨询返回值，是：Y，否：N
    @NameInMap("permit")
    public String permit;

    public static QueryAntchainAtoInnerLeadprefilterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerLeadprefilterResponse self = new QueryAntchainAtoInnerLeadprefilterResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerLeadprefilterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoInnerLeadprefilterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoInnerLeadprefilterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoInnerLeadprefilterResponse setPermit(String permit) {
        this.permit = permit;
        return this;
    }
    public String getPermit() {
        return this.permit;
    }

}
