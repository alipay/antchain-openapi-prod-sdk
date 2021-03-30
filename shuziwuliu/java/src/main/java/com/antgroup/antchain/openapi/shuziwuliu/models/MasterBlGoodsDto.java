// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class MasterBlGoodsDto extends TeaModel {
    // 唛头
    @NameInMap("marks")
    public String marks;

    // 货物
    @NameInMap("goods")
    @Validation(required = true)
    public String goods;

    // 货物类型
    @NameInMap("goods_type")
    @Validation(required = true)
    public String goodsType;

    // 包装类型
    @NameInMap("package_type")
    public String packageType;

    // 委托件数
    @NameInMap("number")
    @Validation(required = true)
    public String number;

    // 委托重量
    @NameInMap("weight")
    @Validation(required = true)
    public String weight;

    // 委托体积
    @NameInMap("volume")
    @Validation(required = true)
    public String volume;

    public static MasterBlGoodsDto build(java.util.Map<String, ?> map) throws Exception {
        MasterBlGoodsDto self = new MasterBlGoodsDto();
        return TeaModel.build(map, self);
    }

    public MasterBlGoodsDto setMarks(String marks) {
        this.marks = marks;
        return this;
    }
    public String getMarks() {
        return this.marks;
    }

    public MasterBlGoodsDto setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public MasterBlGoodsDto setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public MasterBlGoodsDto setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public MasterBlGoodsDto setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public MasterBlGoodsDto setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

    public MasterBlGoodsDto setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
