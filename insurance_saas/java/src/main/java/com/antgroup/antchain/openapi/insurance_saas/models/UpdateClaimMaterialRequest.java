// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class UpdateClaimMaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报案单号（蚂蚁内部）
    @NameInMap("claim_notification_form_no_inner")
    @Validation(required = true)
    public String claimNotificationFormNoInner;

    // 报案号（保司）
    @NameInMap("claim_notification_no")
    @Validation(required = true)
    public String claimNotificationNo;

    // 报案材料列表
    @NameInMap("material_list")
    @Validation(required = true)
    public String materialList;

    // 不传值，默认（1-已完毕）
    // 0：未完毕
    // 1：已完毕
    @NameInMap("is_finished")
    public String isFinished;

    public static UpdateClaimMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClaimMaterialRequest self = new UpdateClaimMaterialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClaimMaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateClaimMaterialRequest setClaimNotificationFormNoInner(String claimNotificationFormNoInner) {
        this.claimNotificationFormNoInner = claimNotificationFormNoInner;
        return this;
    }
    public String getClaimNotificationFormNoInner() {
        return this.claimNotificationFormNoInner;
    }

    public UpdateClaimMaterialRequest setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
        return this;
    }
    public String getClaimNotificationNo() {
        return this.claimNotificationNo;
    }

    public UpdateClaimMaterialRequest setMaterialList(String materialList) {
        this.materialList = materialList;
        return this;
    }
    public String getMaterialList() {
        return this.materialList;
    }

    public UpdateClaimMaterialRequest setIsFinished(String isFinished) {
        this.isFinished = isFinished;
        return this;
    }
    public String getIsFinished() {
        return this.isFinished;
    }

}
