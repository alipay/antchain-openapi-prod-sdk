// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GoodsInfo extends TeaModel {
    // 订单 id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
    @NameInMap("lease_id")
    @Validation(maxLength = 50)
    public String leaseId;

    // 订单包含的商品信息列表
    @NameInMap("goods_list")
    @Validation(required = true)
    public java.util.List<OrderGoodsModel> goodsList;

    public static GoodsInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsInfo self = new GoodsInfo();
        return TeaModel.build(map, self);
    }

    public GoodsInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GoodsInfo setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public GoodsInfo setGoodsList(java.util.List<OrderGoodsModel> goodsList) {
        this.goodsList = goodsList;
        return this;
    }
    public java.util.List<OrderGoodsModel> getGoodsList() {
        return this.goodsList;
    }

}
