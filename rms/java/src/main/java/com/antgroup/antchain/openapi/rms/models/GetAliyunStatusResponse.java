// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAliyunStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云开通状态
    @NameInMap("status")
    public AliyunOpenState status;

    public static GetAliyunStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunStatusResponse self = new GetAliyunStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAliyunStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAliyunStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAliyunStatusResponse setStatus(AliyunOpenState status) {
        this.status = status;
        return this;
    }
    public AliyunOpenState getStatus() {
        return this.status;
    }

}
