// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GoodsOrderInfo extends TeaModel {
    // 商城订单号
    /**
     * <strong>example:</strong>
     * <p>2023343380112</p>
     */
    @NameInMap("goods_order_no")
    @Validation(required = true)
    public String goodsOrderNo;

    // 消费金额
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static GoodsOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsOrderInfo self = new GoodsOrderInfo();
        return TeaModel.build(map, self);
    }

    public GoodsOrderInfo setGoodsOrderNo(String goodsOrderNo) {
        this.goodsOrderNo = goodsOrderNo;
        return this;
    }
    public String getGoodsOrderNo() {
        return this.goodsOrderNo;
    }

    public GoodsOrderInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}
