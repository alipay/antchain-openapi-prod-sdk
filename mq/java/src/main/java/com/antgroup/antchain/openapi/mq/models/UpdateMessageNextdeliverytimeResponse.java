// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMessageNextdeliverytimeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 更新结果
    @NameInMap("update_results")
    public java.util.List<Long> updateResults;

    public static UpdateMessageNextdeliverytimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageNextdeliverytimeResponse self = new UpdateMessageNextdeliverytimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageNextdeliverytimeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateMessageNextdeliverytimeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMessageNextdeliverytimeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateMessageNextdeliverytimeResponse setUpdateResults(java.util.List<Long> updateResults) {
        this.updateResults = updateResults;
        return this;
    }
    public java.util.List<Long> getUpdateResults() {
        return this.updateResults;
    }

}
