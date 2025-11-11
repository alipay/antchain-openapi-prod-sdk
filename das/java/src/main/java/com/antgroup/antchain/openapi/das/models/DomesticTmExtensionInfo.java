// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DomesticTmExtensionInfo extends TeaModel {
    // 商标logo URL地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://logo.png">http://logo.png</a></p>
     */
    @NameInMap("tm_logo_url")
    public String tmLogoUrl;

    // 商品与服务信息列表
    @NameInMap("goods_info")
    public java.util.List<DomesticTmGoodsInfo> goodsInfo;

    public static DomesticTmExtensionInfo build(java.util.Map<String, ?> map) throws Exception {
        DomesticTmExtensionInfo self = new DomesticTmExtensionInfo();
        return TeaModel.build(map, self);
    }

    public DomesticTmExtensionInfo setTmLogoUrl(String tmLogoUrl) {
        this.tmLogoUrl = tmLogoUrl;
        return this;
    }
    public String getTmLogoUrl() {
        return this.tmLogoUrl;
    }

    public DomesticTmExtensionInfo setGoodsInfo(java.util.List<DomesticTmGoodsInfo> goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public java.util.List<DomesticTmGoodsInfo> getGoodsInfo() {
        return this.goodsInfo;
    }

}
