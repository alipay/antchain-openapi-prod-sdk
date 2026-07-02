// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyTechintegrationSkushipResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付芯证书列表
    @NameInMap("data")
    public java.util.List<String> data;

    // 证书拉取任务ID
    @NameInMap("task_id")
    public String taskId;

    // 证书拉取任务批次
    @NameInMap("task_batch_num")
    public String taskBatchNum;

    public static ApplyTechintegrationSkushipResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTechintegrationSkushipResponse self = new ApplyTechintegrationSkushipResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTechintegrationSkushipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyTechintegrationSkushipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyTechintegrationSkushipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyTechintegrationSkushipResponse setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ApplyTechintegrationSkushipResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ApplyTechintegrationSkushipResponse setTaskBatchNum(String taskBatchNum) {
        this.taskBatchNum = taskBatchNum;
        return this;
    }
    public String getTaskBatchNum() {
        return this.taskBatchNum;
    }

}
