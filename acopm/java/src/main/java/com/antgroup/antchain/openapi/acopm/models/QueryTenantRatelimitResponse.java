// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryTenantRatelimitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 限流信息
    @NameInMap("rate_limit_detail_list")
    public java.util.List<RateLimitDetail> rateLimitDetailList;

    public static QueryTenantRatelimitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantRatelimitResponse self = new QueryTenantRatelimitResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantRatelimitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTenantRatelimitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTenantRatelimitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTenantRatelimitResponse setRateLimitDetailList(java.util.List<RateLimitDetail> rateLimitDetailList) {
        this.rateLimitDetailList = rateLimitDetailList;
        return this;
    }
    public java.util.List<RateLimitDetail> getRateLimitDetailList() {
        return this.rateLimitDetailList;
    }

}
