// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_743ccb6d20f546bcb851af6ce09cd478.models;

import com.aliyun.tea.*;

public class QueryIdentityTagFeatureScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务响应结果
    @NameInMap("data")
    public String data;

    public static QueryIdentityTagFeatureScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentityTagFeatureScoreResponse self = new QueryIdentityTagFeatureScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdentityTagFeatureScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdentityTagFeatureScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdentityTagFeatureScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdentityTagFeatureScoreResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
