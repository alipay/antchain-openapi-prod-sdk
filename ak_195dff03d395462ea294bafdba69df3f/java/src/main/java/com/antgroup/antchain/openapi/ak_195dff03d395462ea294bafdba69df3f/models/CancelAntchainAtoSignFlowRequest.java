// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CancelAntchainAtoSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署合同单号
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 默认:“撤销”，最大长度50
    @NameInMap("revoke_reason")
    public String revokeReason;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    @NameInMap("operator_id")
    public String operatorId;

    public static CancelAntchainAtoSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAntchainAtoSignFlowRequest self = new CancelAntchainAtoSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public CancelAntchainAtoSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAntchainAtoSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAntchainAtoSignFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public CancelAntchainAtoSignFlowRequest setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
        return this;
    }
    public String getRevokeReason() {
        return this.revokeReason;
    }

    public CancelAntchainAtoSignFlowRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
