// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ChatAiotdatalinkAskdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务Id
    @NameInMap("job_id")
    public String jobId;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // 任务状态， ACCEPTED 提交，RESOLVING_MODEL 解析寓意，INTERPRETING 生成SQL，SQL_VALIDATING sql 校验，EXECUTING 执行查询，ANALYZING 保存结果，COMPLETE 任务完成，FAILED 任务失败，CANCELLED 任务取消
    @NameInMap("status")
    public String status;

    // json 格式字符串
    @NameInMap("data")
    public String data;

    // 数据总条数
    @NameInMap("row_num")
    public Long rowNum;

    public static ChatAiotdatalinkAskdataResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatAiotdatalinkAskdataResponse self = new ChatAiotdatalinkAskdataResponse();
        return TeaModel.build(map, self);
    }

    public ChatAiotdatalinkAskdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ChatAiotdatalinkAskdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChatAiotdatalinkAskdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ChatAiotdatalinkAskdataResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ChatAiotdatalinkAskdataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatAiotdatalinkAskdataResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChatAiotdatalinkAskdataResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ChatAiotdatalinkAskdataResponse setRowNum(Long rowNum) {
        this.rowNum = rowNum;
        return this;
    }
    public Long getRowNum() {
        return this.rowNum;
    }

}
