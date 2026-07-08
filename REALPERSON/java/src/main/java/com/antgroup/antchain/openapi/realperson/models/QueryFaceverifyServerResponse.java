// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryFaceverifyServerResponse extends TeaModel {
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

    public static QueryFaceverifyServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceverifyServerResponse self = new QueryFaceverifyServerResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceverifyServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFaceverifyServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFaceverifyServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFaceverifyServerResponse setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

    public QueryFaceverifyServerResponse setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
        return this;
    }
    public String getMaterialInfo() {
        return this.materialInfo;
    }

    public QueryFaceverifyServerResponse setMaterialMatched(String materialMatched) {
        this.materialMatched = materialMatched;
        return this;
    }
    public String getMaterialMatched() {
        return this.materialMatched;
    }

    public QueryFaceverifyServerResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public QueryFaceverifyServerResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
