// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetMydidcommunTaskTaskresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // FINISH 执行成功
    // CANCEL 执行失败
    // 只有FINISH 和CANCEL为最终状态，其他均为中间状态
    @NameInMap("status")
    public String status;

    // json序列化后的，任务执行结果，对不同的任务格式会有不同
    // 如：
    // - 代理VC的任务，返回值结构为{"vc":"1111111"}
    // - 获取数据的任务，返回值结构为{"response":{"output":"xxxx","status":"FINISH"}}
    @NameInMap("data_result")
    public String dataResult;

    public static GetMydidcommunTaskTaskresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMydidcommunTaskTaskresultResponse self = new GetMydidcommunTaskTaskresultResponse();
        return TeaModel.build(map, self);
    }

    public GetMydidcommunTaskTaskresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMydidcommunTaskTaskresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMydidcommunTaskTaskresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMydidcommunTaskTaskresultResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetMydidcommunTaskTaskresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetMydidcommunTaskTaskresultResponse setDataResult(String dataResult) {
        this.dataResult = dataResult;
        return this;
    }
    public String getDataResult() {
        return this.dataResult;
    }

}
