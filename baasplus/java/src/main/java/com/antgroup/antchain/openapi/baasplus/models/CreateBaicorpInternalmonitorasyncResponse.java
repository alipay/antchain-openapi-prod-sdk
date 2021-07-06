// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CreateBaicorpInternalmonitorasyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 检测时长，单位为天
    @NameInMap("monitor_duration")
    public Long monitorDuration;

    // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
    @NameInMap("start_date")
    public Long startDate;

    // 业务方任务id，业务方保证唯一
    @NameInMap("task_id")
    public String taskId;

    public static CreateBaicorpInternalmonitorasyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaicorpInternalmonitorasyncResponse self = new CreateBaicorpInternalmonitorasyncResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaicorpInternalmonitorasyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaicorpInternalmonitorasyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaicorpInternalmonitorasyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaicorpInternalmonitorasyncResponse setMonitorDuration(Long monitorDuration) {
        this.monitorDuration = monitorDuration;
        return this;
    }
    public Long getMonitorDuration() {
        return this.monitorDuration;
    }

    public CreateBaicorpInternalmonitorasyncResponse setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public CreateBaicorpInternalmonitorasyncResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
