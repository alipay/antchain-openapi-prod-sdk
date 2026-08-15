// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOmngGenerationtaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    // 成功：success
    // 失败：fail
    @NameInMap("result")
    public String result;

    // 查询失败原因
    @NameInMap("fail_msg")
    public String failMsg;

    // 视频场景任务结果信息
    @NameInMap("task_result_info_dto")
    public TaskResultInfoDto taskResultInfoDto;

    public static QueryOmngGenerationtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOmngGenerationtaskResponse self = new QueryOmngGenerationtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryOmngGenerationtaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOmngGenerationtaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOmngGenerationtaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOmngGenerationtaskResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryOmngGenerationtaskResponse setFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }
    public String getFailMsg() {
        return this.failMsg;
    }

    public QueryOmngGenerationtaskResponse setTaskResultInfoDto(TaskResultInfoDto taskResultInfoDto) {
        this.taskResultInfoDto = taskResultInfoDto;
        return this;
    }
    public TaskResultInfoDto getTaskResultInfoDto() {
        return this.taskResultInfoDto;
    }

}
