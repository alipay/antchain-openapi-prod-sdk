// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PoiMallPointOrderInfo extends TeaModel {
    // 订单号
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
     * <p>3</p>
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
    public PoiMallPointSupplierInfo supplierInfo;

    public static PoiMallPointOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        PoiMallPointOrderInfo self = new PoiMallPointOrderInfo();
        return TeaModel.build(map, self);
    }

    public PoiMallPointOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PoiMallPointOrderInfo setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public PoiMallPointOrderInfo setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
        return this;
    }
    public String getGoodsNum() {
        return this.goodsNum;
    }

    public PoiMallPointOrderInfo setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public PoiMallPointOrderInfo setGoodsPoint(String goodsPoint) {
        this.goodsPoint = goodsPoint;
        return this;
    }
    public String getGoodsPoint() {
        return this.goodsPoint;
    }

    public PoiMallPointOrderInfo setSupplierInfo(PoiMallPointSupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
        return this;
    }
    public PoiMallPointSupplierInfo getSupplierInfo() {
        return this.supplierInfo;
    }

}
