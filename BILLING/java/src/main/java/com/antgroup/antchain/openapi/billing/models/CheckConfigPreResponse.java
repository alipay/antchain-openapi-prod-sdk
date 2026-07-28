// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class CheckConfigPreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 对比对象
    @NameInMap("result")
    public FeeConfChangeVO result;

    public static CheckConfigPreResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigPreResponse self = new CheckConfigPreResponse();
        return TeaModel.build(map, self);
    }

    public CheckConfigPreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckConfigPreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckConfigPreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckConfigPreResponse setResult(FeeConfChangeVO result) {
        this.result = result;
        return this;
    }
    public FeeConfChangeVO getResult() {
        return this.result;
    }

}
