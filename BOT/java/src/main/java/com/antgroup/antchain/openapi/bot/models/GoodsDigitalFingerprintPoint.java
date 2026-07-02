// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintPoint extends TeaModel {
    // 鉴定点子项
    /**
     * <strong>example:</strong>
     * <p>正面</p>
     */
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 微观图片url
    /**
     * <strong>example:</strong>
     * <p><a href="http://1001">http://1001</a></p>
     */
    @NameInMap("micro_image_url")
    @Validation(required = true)
    public String microImageUrl;

    // 宏观图片url
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx1002">http://xxxx1002</a></p>
     */
    @NameInMap("macro_image_url")
    @Validation(required = true)
    public String macroImageUrl;

    public static GoodsDigitalFingerprintPoint build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintPoint self = new GoodsDigitalFingerprintPoint();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintPoint setSubPointName(String subPointName) {
        this.subPointName = subPointName;
        return this;
    }
    public String getSubPointName() {
        return this.subPointName;
    }

    public GoodsDigitalFingerprintPoint setMicroImageUrl(String microImageUrl) {
        this.microImageUrl = microImageUrl;
        return this;
    }
    public String getMicroImageUrl() {
        return this.microImageUrl;
    }

    public GoodsDigitalFingerprintPoint setMacroImageUrl(String macroImageUrl) {
        this.macroImageUrl = macroImageUrl;
        return this;
    }
    public String getMacroImageUrl() {
        return this.macroImageUrl;
    }

}
