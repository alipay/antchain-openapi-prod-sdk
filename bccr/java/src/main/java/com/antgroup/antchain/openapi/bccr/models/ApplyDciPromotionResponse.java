// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ApplyDciPromotionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // basis数据ID
    @NameInMap("api_task_id")
    public String apiTaskId;

    public static ApplyDciPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDciPromotionResponse self = new ApplyDciPromotionResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDciPromotionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDciPromotionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDciPromotionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDciPromotionResponse setApiTaskId(String apiTaskId) {
        this.apiTaskId = apiTaskId;
        return this;
    }
    public String getApiTaskId() {
        return this.apiTaskId;
    }

}
