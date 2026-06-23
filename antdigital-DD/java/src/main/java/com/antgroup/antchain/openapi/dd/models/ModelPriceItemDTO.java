// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ModelPriceItemDTO extends TeaModel {
    // 模型名称
    /**
     * <strong>example:</strong>
     * <p>qwen3.5-plus</p>
     */
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 定价详情
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("prices")
    @Validation(required = true)
    public java.util.List<PriceDetailDTO> prices;

    public static ModelPriceItemDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelPriceItemDTO self = new ModelPriceItemDTO();
        return TeaModel.build(map, self);
    }

    public ModelPriceItemDTO setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModelPriceItemDTO setPrices(java.util.List<PriceDetailDTO> prices) {
        this.prices = prices;
        return this;
    }
    public java.util.List<PriceDetailDTO> getPrices() {
        return this.prices;
    }

}
