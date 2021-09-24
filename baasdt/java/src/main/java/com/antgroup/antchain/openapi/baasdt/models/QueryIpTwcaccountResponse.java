// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpTwcaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机构账号
    @NameInMap("organization_id")
    public String organizationId;

    // 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
    @NameInMap("user_id")
    public String userId;

    // 是否签署了静默授权
    @NameInMap("silently_sign")
    public Boolean silentlySign;

    // 账户链上ID
    @NameInMap("account_id")
    public String accountId;

    public static QueryIpTwcaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpTwcaccountResponse self = new QueryIpTwcaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpTwcaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpTwcaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpTwcaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpTwcaccountResponse setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public QueryIpTwcaccountResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIpTwcaccountResponse setSilentlySign(Boolean silentlySign) {
        this.silentlySign = silentlySign;
        return this;
    }
    public Boolean getSilentlySign() {
        return this.silentlySign;
    }

    public QueryIpTwcaccountResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
