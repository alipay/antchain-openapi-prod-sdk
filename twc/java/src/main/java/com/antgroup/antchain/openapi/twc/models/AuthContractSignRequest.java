// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AuthContractSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权人ID，即个人账号ID或机构账号ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
    @NameInMap("deadline")
    public String deadline;

    public static AuthContractSignRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthContractSignRequest self = new AuthContractSignRequest();
        return TeaModel.build(map, self);
    }

    public AuthContractSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthContractSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthContractSignRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AuthContractSignRequest setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

}
