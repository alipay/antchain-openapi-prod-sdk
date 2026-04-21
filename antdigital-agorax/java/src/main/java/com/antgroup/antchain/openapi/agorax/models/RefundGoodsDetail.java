// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class RefundGoodsDetail extends TeaModel {
    // 商品编号
    /**
     * <strong>example:</strong>
     * <p>apple-01</p>
     */
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 该商品的退款总金额
    /**
     * <strong>example:</strong>
     * <p>19.50</p>
     */
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    public static RefundGoodsDetail build(java.util.Map<String, ?> map) throws Exception {
        RefundGoodsDetail self = new RefundGoodsDetail();
        return TeaModel.build(map, self);
    }

    public RefundGoodsDetail setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public RefundGoodsDetail setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

}
