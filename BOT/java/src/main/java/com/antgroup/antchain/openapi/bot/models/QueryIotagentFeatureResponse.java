// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentFeatureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ThingModelFeatureList
    @NameInMap("data")
    public java.util.List<ThingModelFeatureResponse> data;

    public static QueryIotagentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentFeatureResponse self = new QueryIotagentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotagentFeatureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotagentFeatureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotagentFeatureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotagentFeatureResponse setData(java.util.List<ThingModelFeatureResponse> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ThingModelFeatureResponse> getData() {
        return this.data;
    }

}
