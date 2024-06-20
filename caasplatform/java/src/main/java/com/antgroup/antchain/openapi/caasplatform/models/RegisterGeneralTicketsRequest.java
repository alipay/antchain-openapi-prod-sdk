// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class RegisterGeneralTicketsRequest extends TeaModel {
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

    public static RegisterGeneralTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterGeneralTicketsRequest self = new RegisterGeneralTicketsRequest();
        return TeaModel.build(map, self);
    }

    public RegisterGeneralTicketsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterGeneralTicketsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterGeneralTicketsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RegisterGeneralTicketsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public RegisterGeneralTicketsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RegisterGeneralTicketsRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RegisterGeneralTicketsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
