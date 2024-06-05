// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerTemplateversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模板的版本详情信息
    @NameInMap("data")
    public String data;

    public static QueryInnerTemplateversionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerTemplateversionResponse self = new QueryInnerTemplateversionResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerTemplateversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerTemplateversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerTemplateversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerTemplateversionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
