// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.watermark.models;

import com.aliyun.tea.*;

public class QueryAntdigitalEraprodWatermarkFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("result_json")
    public String resultJson;

    public static QueryAntdigitalEraprodWatermarkFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalEraprodWatermarkFileResponse self = new QueryAntdigitalEraprodWatermarkFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalEraprodWatermarkFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalEraprodWatermarkFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalEraprodWatermarkFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalEraprodWatermarkFileResponse setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
