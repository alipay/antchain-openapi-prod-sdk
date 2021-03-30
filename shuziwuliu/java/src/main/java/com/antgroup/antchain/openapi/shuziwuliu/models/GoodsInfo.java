// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class GoodsInfo extends TeaModel {
    // 货物ID [业务必填]
    @NameInMap("goods_id")
    public String goodsId;

    // 唛头
    // 
    // 
    @NameInMap("marks")
    public String marks;

    // 货物名称
    @NameInMap("goods")
    public String goods;

    // 货物类型
    @NameInMap("goods_type")
    public String goodsType;

    // 货物重量
    @NameInMap("weight")
    public String weight;

    // 件数
    @NameInMap("number")
    public String number;

    public static GoodsInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsInfo self = new GoodsInfo();
        return TeaModel.build(map, self);
    }

    public GoodsInfo setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GoodsInfo setMarks(String marks) {
        this.marks = marks;
        return this;
    }
    public String getMarks() {
        return this.marks;
    }

    public GoodsInfo setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public GoodsInfo setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public GoodsInfo setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

    public GoodsInfo setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
