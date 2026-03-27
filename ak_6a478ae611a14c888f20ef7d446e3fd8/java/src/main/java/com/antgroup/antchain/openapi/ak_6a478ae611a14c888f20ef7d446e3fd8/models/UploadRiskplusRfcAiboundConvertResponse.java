// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6a478ae611a14c888f20ef7d446e3fd8.models;

import com.aliyun.tea.*;

public class UploadRiskplusRfcAiboundConvertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // content
    @NameInMap("content")
    public String content;

    public static UploadRiskplusRfcAiboundConvertResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRiskplusRfcAiboundConvertResponse self = new UploadRiskplusRfcAiboundConvertResponse();
        return TeaModel.build(map, self);
    }

    public UploadRiskplusRfcAiboundConvertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadRiskplusRfcAiboundConvertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadRiskplusRfcAiboundConvertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadRiskplusRfcAiboundConvertResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
