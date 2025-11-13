// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ProductSpecValue extends TeaModel {
    // 规格值
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("spec_value")
    public String specValue;

    // 规格图片key
    /**
     * <strong>example:</strong>
     * <p>/merchant/key</p>
     */
    @NameInMap("image_file_key")
    public String imageFileKey;

    // 规格图片http链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://merchant/key">http://merchant/key</a></p>
     */
    @NameInMap("large_image_file_key")
    public String largeImageFileKey;

    public static ProductSpecValue build(java.util.Map<String, ?> map) throws Exception {
        ProductSpecValue self = new ProductSpecValue();
        return TeaModel.build(map, self);
    }

    public ProductSpecValue setSpecValue(String specValue) {
        this.specValue = specValue;
        return this;
    }
    public String getSpecValue() {
        return this.specValue;
    }

    public ProductSpecValue setImageFileKey(String imageFileKey) {
        this.imageFileKey = imageFileKey;
        return this;
    }
    public String getImageFileKey() {
        return this.imageFileKey;
    }

    public ProductSpecValue setLargeImageFileKey(String largeImageFileKey) {
        this.largeImageFileKey = largeImageFileKey;
        return this;
    }
    public String getLargeImageFileKey() {
        return this.largeImageFileKey;
    }

}
