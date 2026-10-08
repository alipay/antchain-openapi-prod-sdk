// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class AmountlimitsAntdigitalWebttsDacTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 网络标识（不传默认为 DEFAULT）
    @NameInMap("network")
    public String network;

    // 代币
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    public static AmountlimitsAntdigitalWebttsDacTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        AmountlimitsAntdigitalWebttsDacTransactionRequest self = new AmountlimitsAntdigitalWebttsDacTransactionRequest();
        return TeaModel.build(map, self);
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

}
