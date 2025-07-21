// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SaleData extends TeaModel {
    // 摘要数据
    /**
     * <strong>example:</strong>
     * <p>摘要数据</p>
     */
    @NameInMap("sale_digiest_data")
    @Validation(required = true)
    public SaleDigestData saleDigiestData;

    public static SaleData build(java.util.Map<String, ?> map) throws Exception {
        SaleData self = new SaleData();
        return TeaModel.build(map, self);
    }

    public SaleData setSaleDigiestData(SaleDigestData saleDigiestData) {
        this.saleDigiestData = saleDigiestData;
        return this;
    }
    public SaleDigestData getSaleDigiestData() {
        return this.saleDigiestData;
    }

}
