// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboardprefilterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 前筛商户数据看板
    @NameInMap("merchants")
    public String merchants;

    public static QueryInnerSppdashboardprefilterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboardprefilterResponse self = new QueryInnerSppdashboardprefilterResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboardprefilterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboardprefilterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboardprefilterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboardprefilterResponse setMerchants(String merchants) {
        this.merchants = merchants;
        return this;
    }
    public String getMerchants() {
        return this.merchants;
    }

}
