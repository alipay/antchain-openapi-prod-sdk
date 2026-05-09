// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class QueryCertificationStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // 业务编号
    @NameInMap("biz_id")
    public String bizId;

    // 出证类型
    @NameInMap("type")
    public String type;

    // 任务状态：INIT/PROCESSING/SUCCESS/FAIL
    @NameInMap("status")
    public String status;

    // 错误信息（失败时）
    @NameInMap("erro_msg")
    public String erroMsg;

    public static QueryCertificationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertificationStatusResponse self = new QueryCertificationStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertificationStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCertificationStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCertificationStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCertificationStatusResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryCertificationStatusResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCertificationStatusResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryCertificationStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCertificationStatusResponse setErroMsg(String erroMsg) {
        this.erroMsg = erroMsg;
        return this;
    }
    public String getErroMsg() {
        return this.erroMsg;
    }

}
