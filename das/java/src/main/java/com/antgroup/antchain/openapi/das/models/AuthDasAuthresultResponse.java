// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthDasAuthresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 被授权企业ID
    @NameInMap("be_authed_person_id")
    public String beAuthedPersonId;

    // 被授权企业接入应用ID
    @NameInMap("be_authed_person_app_id")
    public String beAuthedPersonAppId;

    // 授权实例ID
    @NameInMap("auth_instance_id")
    public String authInstanceId;

    // 授权详情ID
    @NameInMap("auth_result_id")
    public String authResultId;

    // VC 完整信息
    @NameInMap("vc")
    public String vc;

    public static AuthDasAuthresultResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthDasAuthresultResponse self = new AuthDasAuthresultResponse();
        return TeaModel.build(map, self);
    }

    public AuthDasAuthresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthDasAuthresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthDasAuthresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthDasAuthresultResponse setBeAuthedPersonId(String beAuthedPersonId) {
        this.beAuthedPersonId = beAuthedPersonId;
        return this;
    }
    public String getBeAuthedPersonId() {
        return this.beAuthedPersonId;
    }

    public AuthDasAuthresultResponse setBeAuthedPersonAppId(String beAuthedPersonAppId) {
        this.beAuthedPersonAppId = beAuthedPersonAppId;
        return this;
    }
    public String getBeAuthedPersonAppId() {
        return this.beAuthedPersonAppId;
    }

    public AuthDasAuthresultResponse setAuthInstanceId(String authInstanceId) {
        this.authInstanceId = authInstanceId;
        return this;
    }
    public String getAuthInstanceId() {
        return this.authInstanceId;
    }

    public AuthDasAuthresultResponse setAuthResultId(String authResultId) {
        this.authResultId = authResultId;
        return this;
    }
    public String getAuthResultId() {
        return this.authResultId;
    }

    public AuthDasAuthresultResponse setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

}
