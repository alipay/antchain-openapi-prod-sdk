// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpAccountsettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方的链上id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 开通的渠道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 审批意见，refuse,不同意开通，agree，同意开通，默认为agree，本期暂不支持不同意开通
    @NameInMap("approve_comment")
    @Validation(required = true)
    public String approveComment;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static ConfirmIpAccountsettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpAccountsettlementRequest self = new ConfirmIpAccountsettlementRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpAccountsettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpAccountsettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpAccountsettlementRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpAccountsettlementRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfirmIpAccountsettlementRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ConfirmIpAccountsettlementRequest setApproveComment(String approveComment) {
        this.approveComment = approveComment;
        return this;
    }
    public String getApproveComment() {
        return this.approveComment;
    }

    public ConfirmIpAccountsettlementRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
