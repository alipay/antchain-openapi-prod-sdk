// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCustomflowtemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模板内容
    @NameInMap("data")
    public OpsCustomFlowTemplate data;

    public static GetCustomflowtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomflowtemplateResponse self = new GetCustomflowtemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomflowtemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCustomflowtemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCustomflowtemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCustomflowtemplateResponse setData(OpsCustomFlowTemplate data) {
        this.data = data;
        return this;
    }
    public OpsCustomFlowTemplate getData() {
        return this.data;
    }

}
