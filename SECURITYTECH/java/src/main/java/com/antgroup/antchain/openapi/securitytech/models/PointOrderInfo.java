// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PointOrderInfo extends TeaModel {
    // 订单号（子）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>猫粮</p>
     */
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品条码
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("goods_num")
    @Validation(required = true)
    public String goodsNum;

    // 商品类型
    // 货物：GOODS
    // 服务：SERVICE
    /**
     * <strong>example:</strong>
     * <p>GOODS</p>
     */
    @NameInMap("goods_type")
    @Validation(required = true)
    public String goodsType;

    // 商品积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("goods_point")
    @Validation(required = true)
    public String goodsPoint;

    // 商品供应方信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("supplier_info")
    public PointSupplierInfo supplierInfo;

    public static PointOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        PointOrderInfo self = new PointOrderInfo();
        return TeaModel.build(map, self);
    }

    public PointOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PointOrderInfo setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public PointOrderInfo setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
        return this;
    }
    public String getGoodsNum() {
        return this.goodsNum;
    }

    public PointOrderInfo setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public PointOrderInfo setGoodsPoint(String goodsPoint) {
        this.goodsPoint = goodsPoint;
        return this;
    }
    public String getGoodsPoint() {
        return this.goodsPoint;
    }

    public PointOrderInfo setSupplierInfo(PointSupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
        return this;
    }
    public PointSupplierInfo getSupplierInfo() {
        return this.supplierInfo;
    }

}
