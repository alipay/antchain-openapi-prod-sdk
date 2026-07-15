// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractSignauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业/个人账号ID
    // 《平台方用户注册》返回的organizationId、userId
    @NameInMap("initiator_account_id")
    @Validation(required = true)
    public String initiatorAccountId;

    // 授权至经办人模式下的被授权人个人账号账号ID（平台方用户注册返回的userId）
    // 注意：若指定授权经办人模式时需传入，查询企业授权经办人的有效期。
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    public static QueryContractSignauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractSignauthRequest self = new QueryContractSignauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractSignauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractSignauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractSignauthRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public QueryContractSignauthRequest setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

}
