// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListAkdfUserbizkeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链id
    @NameInMap("bizid")
    public String bizid;

    // 用户密钥信息
    @NameInMap("user_biz_key_info")
    public java.util.List<UserBizKeyInfo> userBizKeyInfo;

    public static ListAkdfUserbizkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAkdfUserbizkeyResponse self = new ListAkdfUserbizkeyResponse();
        return TeaModel.build(map, self);
    }

    public ListAkdfUserbizkeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAkdfUserbizkeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAkdfUserbizkeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAkdfUserbizkeyResponse setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ListAkdfUserbizkeyResponse setUserBizKeyInfo(java.util.List<UserBizKeyInfo> userBizKeyInfo) {
        this.userBizKeyInfo = userBizKeyInfo;
        return this;
    }
    public java.util.List<UserBizKeyInfo> getUserBizKeyInfo() {
        return this.userBizKeyInfo;
    }

}
