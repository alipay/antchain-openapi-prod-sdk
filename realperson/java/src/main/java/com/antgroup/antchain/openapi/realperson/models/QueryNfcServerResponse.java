// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryNfcServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否通过，通过为T，不通过为F
    @NameInMap("passed")
    public String passed;

    // 业务失败原因
    @NameInMap("reason")
    public String reason;

    // 认证主体附件信息，一般的认证场景都是返回空
    @NameInMap("material_info")
    public String materialInfo;

    public static QueryNfcServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNfcServerResponse self = new QueryNfcServerResponse();
        return TeaModel.build(map, self);
    }

    public QueryNfcServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNfcServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNfcServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNfcServerResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public QueryNfcServerResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueryNfcServerResponse setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
        return this;
    }
    public String getMaterialInfo() {
        return this.materialInfo;
    }

}
