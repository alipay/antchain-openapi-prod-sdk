// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DomesticTmGoodsInfo extends TeaModel {
    // 商品中文名称
    /**
     * <strong>example:</strong>
     * <p>汽车</p>
     */
    @NameInMap("goods_cn_name")
    public String goodsCnName;

    // 类似群编码
    /**
     * <strong>example:</strong>
     * <p>1210</p>
     */
    @NameInMap("similar_code")
    public String similarCode;

    public static DomesticTmGoodsInfo build(java.util.Map<String, ?> map) throws Exception {
        DomesticTmGoodsInfo self = new DomesticTmGoodsInfo();
        return TeaModel.build(map, self);
    }

    public DomesticTmGoodsInfo setGoodsCnName(String goodsCnName) {
        this.goodsCnName = goodsCnName;
        return this;
    }
    public String getGoodsCnName() {
        return this.goodsCnName;
    }

    public DomesticTmGoodsInfo setSimilarCode(String similarCode) {
        this.similarCode = similarCode;
        return this;
    }
    public String getSimilarCode() {
        return this.similarCode;
    }

}
