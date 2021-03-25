// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetPlanProgressResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // progress
    @NameInMap("progress")
    public String progress;

    public static GetPlanProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlanProgressResponse self = new GetPlanProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetPlanProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetPlanProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetPlanProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetPlanProgressResponse setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

}
