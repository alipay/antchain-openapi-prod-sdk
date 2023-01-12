// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetServiceProgressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 进度
    @NameInMap("progress")
    public String progress;

    public static GetServiceProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProgressResponse self = new GetServiceProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetServiceProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetServiceProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetServiceProgressResponse setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

}
