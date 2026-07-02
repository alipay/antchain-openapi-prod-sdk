// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryOnlinepressuretestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产线压测任务对象
    @NameInMap("test_task")
    public OnlinePressureTestTask testTask;

    public static QueryOnlinepressuretestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOnlinepressuretestResponse self = new QueryOnlinepressuretestResponse();
        return TeaModel.build(map, self);
    }

    public QueryOnlinepressuretestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOnlinepressuretestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOnlinepressuretestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOnlinepressuretestResponse setTestTask(OnlinePressureTestTask testTask) {
        this.testTask = testTask;
        return this;
    }
    public OnlinePressureTestTask getTestTask() {
        return this.testTask;
    }

}
