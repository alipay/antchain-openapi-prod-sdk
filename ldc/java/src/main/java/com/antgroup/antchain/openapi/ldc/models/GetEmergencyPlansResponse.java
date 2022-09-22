// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetEmergencyPlansResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预案id
    @NameInMap("id")
    public String id;

    // 预案名称	
    @NameInMap("name")
    public String name;

    // 预案参数
    @NameInMap("params")
    public java.util.List<TemplateParam> params;

    public static GetEmergencyPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmergencyPlansResponse self = new GetEmergencyPlansResponse();
        return TeaModel.build(map, self);
    }

    public GetEmergencyPlansResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEmergencyPlansResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEmergencyPlansResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEmergencyPlansResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetEmergencyPlansResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetEmergencyPlansResponse setParams(java.util.List<TemplateParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<TemplateParam> getParams() {
        return this.params;
    }

}
