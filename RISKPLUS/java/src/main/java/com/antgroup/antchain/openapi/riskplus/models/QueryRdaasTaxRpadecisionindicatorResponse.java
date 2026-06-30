// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRdaasTaxRpadecisionindicatorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 决策指标
    @NameInMap("data")
    public java.util.List<RdaasTaxDecsionServiceIndicator> data;

    public static QueryRdaasTaxRpadecisionindicatorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRdaasTaxRpadecisionindicatorResponse self = new QueryRdaasTaxRpadecisionindicatorResponse();
        return TeaModel.build(map, self);
    }

    public QueryRdaasTaxRpadecisionindicatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRdaasTaxRpadecisionindicatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRdaasTaxRpadecisionindicatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRdaasTaxRpadecisionindicatorResponse setData(java.util.List<RdaasTaxDecsionServiceIndicator> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RdaasTaxDecsionServiceIndicator> getData() {
        return this.data;
    }

}
