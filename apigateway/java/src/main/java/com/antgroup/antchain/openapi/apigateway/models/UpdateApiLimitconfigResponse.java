// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateApiLimitconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public Boolean data;

    public static UpdateApiLimitconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiLimitconfigResponse self = new UpdateApiLimitconfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiLimitconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateApiLimitconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateApiLimitconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateApiLimitconfigResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
