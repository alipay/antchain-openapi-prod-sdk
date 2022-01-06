// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsGraydataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 推送结果列表
    @NameInMap("push_result")
    public java.util.List<GrayPublishResultItem> pushResult;

    public static AddDdcsGraydataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsGraydataResponse self = new AddDdcsGraydataResponse();
        return TeaModel.build(map, self);
    }

    public AddDdcsGraydataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddDdcsGraydataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddDdcsGraydataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddDdcsGraydataResponse setPushResult(java.util.List<GrayPublishResultItem> pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public java.util.List<GrayPublishResultItem> getPushResult() {
        return this.pushResult;
    }

}
