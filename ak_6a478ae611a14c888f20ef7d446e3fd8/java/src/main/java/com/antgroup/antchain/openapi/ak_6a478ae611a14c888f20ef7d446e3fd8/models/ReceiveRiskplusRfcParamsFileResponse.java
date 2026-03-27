// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6a478ae611a14c888f20ef7d446e3fd8.models;

import com.aliyun.tea.*;

public class ReceiveRiskplusRfcParamsFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件上传响应参数
    @NameInMap("content")
    public String content;

    public static ReceiveRiskplusRfcParamsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveRiskplusRfcParamsFileResponse self = new ReceiveRiskplusRfcParamsFileResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveRiskplusRfcParamsFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReceiveRiskplusRfcParamsFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReceiveRiskplusRfcParamsFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReceiveRiskplusRfcParamsFileResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
