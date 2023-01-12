// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 获取到的应用参数
    @NameInMap("data")
    public AppParam data;

    public static GetConfigAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigAppResponse self = new GetConfigAppResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigAppResponse setData(AppParam data) {
        this.data = data;
        return this;
    }
    public AppParam getData() {
        return this.data;
    }

}
