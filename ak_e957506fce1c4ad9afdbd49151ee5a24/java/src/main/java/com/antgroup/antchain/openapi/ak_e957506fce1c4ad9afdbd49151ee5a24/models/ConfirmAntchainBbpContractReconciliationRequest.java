// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_e957506fce1c4ad9afdbd49151ee5a24.models;

import com.aliyun.tea.*;

public class ConfirmAntchainBbpContractReconciliationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 确认时间
    @NameInMap("socre_date")
    @Validation(required = true)
    public String socreDate;

    // 确认类型：1、长城  2、服务方
    @NameInMap("confirm_type")
    @Validation(required = true)
    public String confirmType;

    // 确认者
    @NameInMap("confirmer")
    @Validation(required = true)
    public String confirmer;

    // 认证状态
    @NameInMap("confirm_status")
    @Validation(required = true)
    public String confirmStatus;

    public static ConfirmAntchainBbpContractReconciliationRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAntchainBbpContractReconciliationRequest self = new ConfirmAntchainBbpContractReconciliationRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAntchainBbpContractReconciliationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setSocreDate(String socreDate) {
        this.socreDate = socreDate;
        return this;
    }
    public String getSocreDate() {
        return this.socreDate;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setConfirmType(String confirmType) {
        this.confirmType = confirmType;
        return this;
    }
    public String getConfirmType() {
        return this.confirmType;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }
    public String getConfirmer() {
        return this.confirmer;
    }

    public ConfirmAntchainBbpContractReconciliationRequest setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

}
