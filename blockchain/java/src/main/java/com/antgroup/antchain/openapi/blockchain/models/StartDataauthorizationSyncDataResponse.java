// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDataauthorizationSyncDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 待同步的数据总量
    @NameInMap("total")
    public Long total;

    // 最后一条数据的创建时间
    @NameInMap("last_create_time")
    public Long lastCreateTime;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    public static StartDataauthorizationSyncDataResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDataauthorizationSyncDataResponse self = new StartDataauthorizationSyncDataResponse();
        return TeaModel.build(map, self);
    }

    public StartDataauthorizationSyncDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDataauthorizationSyncDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDataauthorizationSyncDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDataauthorizationSyncDataResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public StartDataauthorizationSyncDataResponse setLastCreateTime(Long lastCreateTime) {
        this.lastCreateTime = lastCreateTime;
        return this;
    }
    public Long getLastCreateTime() {
        return this.lastCreateTime;
    }

    public StartDataauthorizationSyncDataResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
