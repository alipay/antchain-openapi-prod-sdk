// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitHealthscoretrendResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用画像健康分趋势
    @NameInMap("data")
    public java.util.List<AppPortraitAppHealthScoreTrendQuery> data;

    public static QueryAppportraitHealthscoretrendResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppportraitHealthscoretrendResponse self = new QueryAppportraitHealthscoretrendResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppportraitHealthscoretrendResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppportraitHealthscoretrendResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppportraitHealthscoretrendResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppportraitHealthscoretrendResponse setData(java.util.List<AppPortraitAppHealthScoreTrendQuery> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAppHealthScoreTrendQuery> getData() {
        return this.data;
    }

}
