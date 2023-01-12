// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupSlbmountprogressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行进度
    @NameInMap("executor_progress")
    public String executorProgress;

    public static QueryMachinegroupSlbmountprogressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMachinegroupSlbmountprogressResponse self = new QueryMachinegroupSlbmountprogressResponse();
        return TeaModel.build(map, self);
    }

    public QueryMachinegroupSlbmountprogressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMachinegroupSlbmountprogressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMachinegroupSlbmountprogressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMachinegroupSlbmountprogressResponse setExecutorProgress(String executorProgress) {
        this.executorProgress = executorProgress;
        return this;
    }
    public String getExecutorProgress() {
        return this.executorProgress;
    }

}
