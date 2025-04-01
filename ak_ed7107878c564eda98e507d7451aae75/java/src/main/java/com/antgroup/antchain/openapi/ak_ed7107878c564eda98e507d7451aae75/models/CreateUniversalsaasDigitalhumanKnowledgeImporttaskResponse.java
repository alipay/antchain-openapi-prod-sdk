// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id
    @NameInMap("task_id")
    public Long taskId;

    public static CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse self = new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
