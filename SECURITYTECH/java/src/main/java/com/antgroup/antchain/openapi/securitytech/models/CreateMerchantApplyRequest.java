// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreateMerchantApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一社会信用代码
    @NameInMap("usci")
    @Validation(required = true)
    public String usci;

    // 行业类型
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 二级类目
    @NameInMap("sub_category")
    @Validation(required = true)
    public String subCategory;

    // 入驻场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 商户信息
    @NameInMap("merchant_info")
    @Validation(required = true)
    public MaoMerchantInfo merchantInfo;

    public static CreateMerchantApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantApplyRequest self = new CreateMerchantApplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateMerchantApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMerchantApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMerchantApplyRequest setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public CreateMerchantApplyRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateMerchantApplyRequest setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public CreateMerchantApplyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateMerchantApplyRequest setMerchantInfo(MaoMerchantInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
        return this;
    }
    public MaoMerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

}
