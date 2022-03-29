// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetLogserviceDesensconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已配置的脱敏类型
    @NameInMap("desens_types")
    public java.util.List<String> desensTypes;

    public static GetLogserviceDesensconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogserviceDesensconfigResponse self = new GetLogserviceDesensconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLogserviceDesensconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLogserviceDesensconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLogserviceDesensconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLogserviceDesensconfigResponse setDesensTypes(java.util.List<String> desensTypes) {
        this.desensTypes = desensTypes;
        return this;
    }
    public java.util.List<String> getDesensTypes() {
        return this.desensTypes;
    }

}
