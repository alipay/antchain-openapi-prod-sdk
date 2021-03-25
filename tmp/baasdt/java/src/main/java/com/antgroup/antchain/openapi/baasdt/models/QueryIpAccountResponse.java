// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 该用户的在外部系统的用户Id
    @NameInMap("external_user_id")
    public String externalUserId;

    // 该用户的在外部系统的用户名称
    @NameInMap("external_user_name")
    public String externalUserName;

    // 1:版权方 2: 版权采购商 
    @NameInMap("role")
    public Long role;

    // 用户状态(0:初始化, 1:申请流程中, 2:可用, 3:被冻结)
    // 买家: 链上账户注册成功即为可用状态。
    // 卖家: 链上账户注册成功为初始化状态, 申请期间涉及2层审核皆为审核流程中状态, 支付宝审核通过即为可用状态。
    @NameInMap("status")
    public Long status;

    public static QueryIpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpAccountResponse self = new QueryIpAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpAccountResponse setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public QueryIpAccountResponse setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
        return this;
    }
    public String getExternalUserName() {
        return this.externalUserName;
    }

    public QueryIpAccountResponse setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public QueryIpAccountResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
