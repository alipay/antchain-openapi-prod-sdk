// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitUsabilitytrendResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用可用性趋势列表
    @NameInMap("data")
    public java.util.List<AppPortraitAppUsabilityTrendQuery> data;

    public static QueryAppportraitUsabilitytrendResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppportraitUsabilitytrendResponse self = new QueryAppportraitUsabilitytrendResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppportraitUsabilitytrendResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppportraitUsabilitytrendResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppportraitUsabilitytrendResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppportraitUsabilitytrendResponse setData(java.util.List<AppPortraitAppUsabilityTrendQuery> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAppUsabilityTrendQuery> getData() {
        return this.data;
    }

}
