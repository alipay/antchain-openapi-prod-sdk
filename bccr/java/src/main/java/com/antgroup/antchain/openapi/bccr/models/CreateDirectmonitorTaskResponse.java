// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDirectmonitorTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监测任务id
    @NameInMap("monitor_task_id")
    public String monitorTaskId;

    // 是否存在相似结果
    @NameInMap("is_exist_similar")
    public Boolean isExistSimilar;

    // 监测结果总数量
    @NameInMap("monitor_result_count")
    public Long monitorResultCount;

    public static CreateDirectmonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectmonitorTaskResponse self = new CreateDirectmonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDirectmonitorTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDirectmonitorTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDirectmonitorTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDirectmonitorTaskResponse setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public CreateDirectmonitorTaskResponse setIsExistSimilar(Boolean isExistSimilar) {
        this.isExistSimilar = isExistSimilar;
        return this;
    }
    public Boolean getIsExistSimilar() {
        return this.isExistSimilar;
    }

    public CreateDirectmonitorTaskResponse setMonitorResultCount(Long monitorResultCount) {
        this.monitorResultCount = monitorResultCount;
        return this;
    }
    public Long getMonitorResultCount() {
        return this.monitorResultCount;
    }

}
