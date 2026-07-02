// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplySceneProductMerchantInfo extends TeaModel {
    // 商户商品spuId
    /**
     * <strong>example:</strong>
     * <p>s12312312312</p>
     */
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    // 商户品牌
    /**
     * <strong>example:</strong>
     * <p>merchantBrand</p>
     */
    @NameInMap("merchant_brand")
    public String merchantBrand;

    // logo
    /**
     * <strong>example:</strong>
     * <p>logo</p>
     */
    @NameInMap("merchant_logo")
    public String merchantLogo;

    // logo
    /**
     * <strong>example:</strong>
     * <p>logo</p>
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

    // 是否勾选
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("choosed")
    public Boolean choosed;

    public static ApplySceneProductMerchantInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplySceneProductMerchantInfo self = new ApplySceneProductMerchantInfo();
        return TeaModel.build(map, self);
    }

    public ApplySceneProductMerchantInfo setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

    public ApplySceneProductMerchantInfo setMerchantBrand(String merchantBrand) {
        this.merchantBrand = merchantBrand;
        return this;
    }
    public String getMerchantBrand() {
        return this.merchantBrand;
    }

    public ApplySceneProductMerchantInfo setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
        return this;
    }
    public String getMerchantLogo() {
        return this.merchantLogo;
    }

    public ApplySceneProductMerchantInfo setLargeMerchantLogo(String largeMerchantLogo) {
        this.largeMerchantLogo = largeMerchantLogo;
        return this;
    }
    public String getLargeMerchantLogo() {
        return this.largeMerchantLogo;
    }

    public ApplySceneProductMerchantInfo setGrayed(Boolean grayed) {
        this.grayed = grayed;
        return this;
    }
    public Boolean getGrayed() {
        return this.grayed;
    }

    public ApplySceneProductMerchantInfo setChoosed(Boolean choosed) {
        this.choosed = choosed;
        return this;
    }
    public Boolean getChoosed() {
        return this.choosed;
    }

}
