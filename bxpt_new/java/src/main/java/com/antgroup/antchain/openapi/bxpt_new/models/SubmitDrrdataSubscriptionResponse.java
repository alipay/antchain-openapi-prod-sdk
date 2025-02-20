// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class SubmitDrrdataSubscriptionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务状态
    @NameInMap("status")
    public String status;

    // 返回业务参数
    @NameInMap("biz_result")
    public String bizResult;

    public static SubmitDrrdataSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDrrdataSubscriptionResponse self = new SubmitDrrdataSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDrrdataSubscriptionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitDrrdataSubscriptionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitDrrdataSubscriptionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitDrrdataSubscriptionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubmitDrrdataSubscriptionResponse setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

}
