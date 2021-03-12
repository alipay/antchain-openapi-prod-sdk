// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDigitalassetExchangeAccountmapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 用户联系方式
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 业务方用户账号
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    // 业务方用户名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CreateDigitalassetExchangeAccountmapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalassetExchangeAccountmapRequest self = new CreateDigitalassetExchangeAccountmapRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalassetExchangeAccountmapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalassetExchangeAccountmapRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalassetExchangeAccountmapRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public CreateDigitalassetExchangeAccountmapRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateDigitalassetExchangeAccountmapRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public CreateDigitalassetExchangeAccountmapRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
