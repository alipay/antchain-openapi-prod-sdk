// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defininstchannel.models;

import com.aliyun.tea.*;

public class SubmitFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务返回参数
    @NameInMap("biz_result")
    public BizResult bizResult;

    public static SubmitFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileResponse self = new SubmitFileResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitFileResponse setBizResult(BizResult bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public BizResult getBizResult() {
        return this.bizResult;
    }

}
