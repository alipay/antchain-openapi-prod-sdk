// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class StartSlxfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回批次，JSON对象， 比如：{batchId:xxxxx}
    @NameInMap("data")
    public BatchInfo data;

    public static StartSlxfResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSlxfResponse self = new StartSlxfResponse();
        return TeaModel.build(map, self);
    }

    public StartSlxfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartSlxfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartSlxfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartSlxfResponse setData(BatchInfo data) {
        this.data = data;
        return this;
    }
    public BatchInfo getData() {
        return this.data;
    }

}
