// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class RegisterGeneralRightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 创建链上账户时指定的accountName
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 通过调用托管资源接口返回的资源id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 要铸造的数据资产数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 扩展参数
    @NameInMap("data")
    public String data;

    public static RegisterGeneralRightsRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterGeneralRightsRequest self = new RegisterGeneralRightsRequest();
        return TeaModel.build(map, self);
    }

    public RegisterGeneralRightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterGeneralRightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterGeneralRightsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RegisterGeneralRightsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public RegisterGeneralRightsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RegisterGeneralRightsRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RegisterGeneralRightsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
