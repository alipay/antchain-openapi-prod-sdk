// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarBatchpubResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批次ID
    @NameInMap("batch_id")
    public String batchId;

    // 总设备数
    @NameInMap("total_count")
    public Long totalCount;

    // 触发模式
    @NameInMap("trigger_mode")
    public String triggerMode;

    // 定时执行时间戳
    @NameInMap("scheduled_time")
    public Long scheduledTime;

    // 状态
    @NameInMap("success")
    public Boolean success;

    public static ExecElectrocarBatchpubResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarBatchpubResponse self = new ExecElectrocarBatchpubResponse();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarBatchpubResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecElectrocarBatchpubResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecElectrocarBatchpubResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecElectrocarBatchpubResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public ExecElectrocarBatchpubResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ExecElectrocarBatchpubResponse setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public ExecElectrocarBatchpubResponse setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    public ExecElectrocarBatchpubResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
