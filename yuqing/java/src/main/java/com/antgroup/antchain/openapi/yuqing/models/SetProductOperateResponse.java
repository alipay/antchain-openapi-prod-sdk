// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SetProductOperateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 输出返回
    @NameInMap("output_json")
    public String outputJson;

    public static SetProductOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetProductOperateResponse self = new SetProductOperateResponse();
        return TeaModel.build(map, self);
    }

    public SetProductOperateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetProductOperateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetProductOperateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetProductOperateResponse setOutputJson(String outputJson) {
        this.outputJson = outputJson;
        return this;
    }
    public String getOutputJson() {
        return this.outputJson;
    }

}
