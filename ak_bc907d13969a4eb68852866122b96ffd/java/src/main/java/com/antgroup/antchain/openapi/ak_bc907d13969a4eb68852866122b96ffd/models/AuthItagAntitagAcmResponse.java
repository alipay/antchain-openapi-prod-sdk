// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AuthItagAntitagAcmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息ID
    @NameInMap("reqmsgid")
    public String reqmsgid;

    // 结果码
    @NameInMap("resultcode")
    public String resultcode;

    // 结果消息
    @NameInMap("resultmsg")
    public String resultmsg;

    // 用户ID
    @NameInMap("userid")
    public String userid;

    // 授权码
    @NameInMap("accesstoken")
    public String accesstoken;

    public static AuthItagAntitagAcmResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthItagAntitagAcmResponse self = new AuthItagAntitagAcmResponse();
        return TeaModel.build(map, self);
    }

    public AuthItagAntitagAcmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthItagAntitagAcmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthItagAntitagAcmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthItagAntitagAcmResponse setReqmsgid(String reqmsgid) {
        this.reqmsgid = reqmsgid;
        return this;
    }
    public String getReqmsgid() {
        return this.reqmsgid;
    }

    public AuthItagAntitagAcmResponse setResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }
    public String getResultcode() {
        return this.resultcode;
    }

    public AuthItagAntitagAcmResponse setResultmsg(String resultmsg) {
        this.resultmsg = resultmsg;
        return this;
    }
    public String getResultmsg() {
        return this.resultmsg;
    }

    public AuthItagAntitagAcmResponse setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public AuthItagAntitagAcmResponse setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
        return this;
    }
    public String getAccesstoken() {
        return this.accesstoken;
    }

}
