// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class DetailRiskplusDubbridgeEcloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 合同号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 借据号
    @NameInMap("loan_no")
    public String loanNo;

    public static DetailRiskplusDubbridgeEcloanRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailRiskplusDubbridgeEcloanRequest self = new DetailRiskplusDubbridgeEcloanRequest();
        return TeaModel.build(map, self);
    }

    public DetailRiskplusDubbridgeEcloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailRiskplusDubbridgeEcloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailRiskplusDubbridgeEcloanRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public DetailRiskplusDubbridgeEcloanRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public DetailRiskplusDubbridgeEcloanRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public DetailRiskplusDubbridgeEcloanRequest setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

}
