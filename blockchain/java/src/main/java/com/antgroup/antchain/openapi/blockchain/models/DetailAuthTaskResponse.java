// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DetailAuthTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 历史任务信息
    @NameInMap("old_task_info")
    public OldTaskInfo oldTaskInfo;

    // 最新的任务信息
    @NameInMap("update_task_info")
    public UpdatedTaskInfo updateTaskInfo;

    // 是否有未完成的圈人任务
    @NameInMap("have_not_finished_crowd_task")
    public Boolean haveNotFinishedCrowdTask;

    public static DetailAuthTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAuthTaskResponse self = new DetailAuthTaskResponse();
        return TeaModel.build(map, self);
    }

    public DetailAuthTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAuthTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAuthTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAuthTaskResponse setOldTaskInfo(OldTaskInfo oldTaskInfo) {
        this.oldTaskInfo = oldTaskInfo;
        return this;
    }
    public OldTaskInfo getOldTaskInfo() {
        return this.oldTaskInfo;
    }

    public DetailAuthTaskResponse setUpdateTaskInfo(UpdatedTaskInfo updateTaskInfo) {
        this.updateTaskInfo = updateTaskInfo;
        return this;
    }
    public UpdatedTaskInfo getUpdateTaskInfo() {
        return this.updateTaskInfo;
    }

    public DetailAuthTaskResponse setHaveNotFinishedCrowdTask(Boolean haveNotFinishedCrowdTask) {
        this.haveNotFinishedCrowdTask = haveNotFinishedCrowdTask;
        return this;
    }
    public Boolean getHaveNotFinishedCrowdTask() {
        return this.haveNotFinishedCrowdTask;
    }

}
