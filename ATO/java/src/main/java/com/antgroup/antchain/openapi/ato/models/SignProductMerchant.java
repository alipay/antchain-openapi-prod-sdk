// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignProductMerchant extends TeaModel {
    // 商户商品spuId
    /**
     * <strong>example:</strong>
     * <p>s123123123123123</p>
     */
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 商户品牌
    /**
     * <strong>example:</strong>
     * <p>品牌</p>
     */
    @NameInMap("merchant_brand")
    public String merchantBrand;

    // 商户logo
    /**
     * <strong>example:</strong>
     * <p>filekey</p>
     */
    @NameInMap("merchant_logo")
    public String merchantLogo;

    // 商户logo
    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("large_merchant_logo")
    public String largeMerchantLogo;

    // 是否置灰
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("grayed")
    public Boolean grayed;

    public static SignProductMerchant build(java.util.Map<String, ?> map) throws Exception {
        SignProductMerchant self = new SignProductMerchant();
        return TeaModel.build(map, self);
    }

    public SignProductMerchant setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public SignProductMerchant setMerchantBrand(String merchantBrand) {
        this.merchantBrand = merchantBrand;
        return this;
    }
    public String getMerchantBrand() {
        return this.merchantBrand;
    }

    public SignProductMerchant setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
        return this;
    }
    public String getMerchantLogo() {
        return this.merchantLogo;
    }

    public SignProductMerchant setLargeMerchantLogo(String largeMerchantLogo) {
        this.largeMerchantLogo = largeMerchantLogo;
        return this;
    }
    public String getLargeMerchantLogo() {
        return this.largeMerchantLogo;
    }

    public SignProductMerchant setGrayed(Boolean grayed) {
        this.grayed = grayed;
        return this;
    }
    public Boolean getGrayed() {
        return this.grayed;
    }

}
