// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckContractCourtdeductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 付款账户人姓名
    @NameInMap("payer_name")
    @Validation(required = true)
    public String payerName;

    // 付款人银行账户
    @NameInMap("payer_account")
    @Validation(required = true)
    public String payerAccount;

    // 银行类型：icbc(工行)
    @NameInMap("bank_type")
    @Validation(required = true)
    public String bankType;

    public static CheckContractCourtdeductRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckContractCourtdeductRequest self = new CheckContractCourtdeductRequest();
        return TeaModel.build(map, self);
    }

    public CheckContractCourtdeductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckContractCourtdeductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckContractCourtdeductRequest setPayerName(String payerName) {
        this.payerName = payerName;
        return this;
    }
    public String getPayerName() {
        return this.payerName;
    }

    public CheckContractCourtdeductRequest setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
        return this;
    }
    public String getPayerAccount() {
        return this.payerAccount;
    }

    public CheckContractCourtdeductRequest setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

}
