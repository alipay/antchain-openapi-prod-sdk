// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a4468d3c1cef4a6899d161ba86de1afb.models;

import com.aliyun.tea.*;

public class QueryDiRealpersonFacevrfServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证的主体信息，一般的认证场景返回为空
    @NameInMap("identity_info")
    public String identityInfo;

    // 认证主体附件信息，一般的认证场景都是返回空
    @NameInMap("material_info")
    public String materialInfo;

    // 认证材料哈希是否匹配
    @NameInMap("material_matched")
    public String materialMatched;

    // 是否通过，通过为T，不通过为F
    @NameInMap("passed")
    public String passed;

    // 业务失败原因
    @NameInMap("reason")
    public String reason;

    public static QueryDiRealpersonFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDiRealpersonFacevrfServerResponse self = new QueryDiRealpersonFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

    public QueryDiRealpersonFacevrfServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDiRealpersonFacevrfServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDiRealpersonFacevrfServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDiRealpersonFacevrfServerResponse setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

    public QueryDiRealpersonFacevrfServerResponse setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
        return this;
    }
    public String getMaterialInfo() {
        return this.materialInfo;
    }

    public QueryDiRealpersonFacevrfServerResponse setMaterialMatched(String materialMatched) {
        this.materialMatched = materialMatched;
        return this;
    }
    public String getMaterialMatched() {
        return this.materialMatched;
    }

    public QueryDiRealpersonFacevrfServerResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public QueryDiRealpersonFacevrfServerResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
