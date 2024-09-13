// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryTemplateStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 彩信模版状态查询结果
    @NameInMap("data")
    public QueryTemplateStatusRes data;

    public static QueryTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateStatusResponse self = new QueryTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTemplateStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTemplateStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTemplateStatusResponse setData(QueryTemplateStatusRes data) {
        this.data = data;
        return this;
    }
    public QueryTemplateStatusRes getData() {
        return this.data;
    }

}
