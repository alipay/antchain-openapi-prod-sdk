// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UpdateMerchantApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户号
    @NameInMap("merchant_id")
    public String merchantId;

    // 社会统代
    @NameInMap("usci")
    public String usci;

    // 行业类型
    @NameInMap("industry")
    public String industry;

    // 入驻场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 商户信息
    @NameInMap("modify_fields")
    @Validation(required = true)
    public MaoMerchantInfo modifyFields;

    public static UpdateMerchantApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMerchantApplyRequest self = new UpdateMerchantApplyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMerchantApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMerchantApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMerchantApplyRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateMerchantApplyRequest setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public UpdateMerchantApplyRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public UpdateMerchantApplyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateMerchantApplyRequest setModifyFields(MaoMerchantInfo modifyFields) {
        this.modifyFields = modifyFields;
        return this;
    }
    public MaoMerchantInfo getModifyFields() {
        return this.modifyFields;
    }

}
