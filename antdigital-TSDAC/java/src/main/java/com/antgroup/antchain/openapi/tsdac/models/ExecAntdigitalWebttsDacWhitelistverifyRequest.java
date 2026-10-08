// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class ExecAntdigitalWebttsDacWhitelistverifyRequest extends TeaModel {
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

    // 白名单订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 钱包签名结果
    @NameInMap("signature_result")
    @Validation(required = true)
    public String signatureResult;

    public static ExecAntdigitalWebttsDacWhitelistverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntdigitalWebttsDacWhitelistverifyRequest self = new ExecAntdigitalWebttsDacWhitelistverifyRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecAntdigitalWebttsDacWhitelistverifyRequest setSignatureResult(String signatureResult) {
        this.signatureResult = signatureResult;
        return this;
    }
    public String getSignatureResult() {
        return this.signatureResult;
    }

}
