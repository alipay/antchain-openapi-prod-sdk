// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListLogserviceDesenstypesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可配置的脱敏类型
    @NameInMap("desens_types")
    public java.util.List<String> desensTypes;

    public static ListLogserviceDesenstypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogserviceDesenstypesResponse self = new ListLogserviceDesenstypesResponse();
        return TeaModel.build(map, self);
    }

    public ListLogserviceDesenstypesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLogserviceDesenstypesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLogserviceDesenstypesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLogserviceDesenstypesResponse setDesensTypes(java.util.List<String> desensTypes) {
        this.desensTypes = desensTypes;
        return this;
    }
    public java.util.List<String> getDesensTypes() {
        return this.desensTypes;
    }

}
