// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ContainerGoodsParam extends TeaModel {
    // 预计备货时间
    /**
     * <strong>example:</strong>
     * <p>预计备货时间</p>
     */
    @NameInMap("cargo_ready_date")
    public Long cargoReadyDate;

    // 危险品页号
    /**
     * <strong>example:</strong>
     * <p>危险品页号</p>
     */
    @NameInMap("dg_page_no")
    public String dgPageNo;

    // 危险品级别
    /**
     * <strong>example:</strong>
     * <p>危险品级别</p>
     */
    @NameInMap("dg_type")
    public String dgType;

    // 危险品闪点
    /**
     * <strong>example:</strong>
     * <p>危险品闪点</p>
     */
    @NameInMap("flash_point")
    public String flashPoint;

    // 货物
    /**
     * <strong>example:</strong>
     * <p>货物</p>
     */
    @NameInMap("goods")
    public String goods;

    // 货物中文名
    /**
     * <strong>example:</strong>
     * <p>货物中文名</p>
     */
    @NameInMap("goods_cn")
    public String goodsCn;

    // 货物类型 业务必填
    /**
     * <strong>example:</strong>
     * <p>货物类型</p>
     */
    @NameInMap("goods_type")
    public String goodsType;

    // HS CODE
    /**
     * <strong>example:</strong>
     * <p>HS CODE</p>
     */
    @NameInMap("hs_codes")
    public java.util.List<String> hsCodes;

    // 唛头
    /**
     * <strong>example:</strong>
     * <p>唛头</p>
     */
    @NameInMap("marks")
    public String marks;

    // 件数 业务必填
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("number")
    public String number;

    // 包装类型
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("package_type")
    public String packageType;

    // 实际件数
    /**
     * <strong>example:</strong>
     * <p>实际件数</p>
     */
    @NameInMap("real_number")
    public String realNumber;

    // 实际体积
    /**
     * <strong>example:</strong>
     * <p>实际体积</p>
     */
    @NameInMap("real_volume")
    public String realVolume;

    // 实际重量
    /**
     * <strong>example:</strong>
     * <p>实际重量</p>
     */
    @NameInMap("real_weight")
    public String realWeight;

    // 危险品联合国编号
    /**
     * <strong>example:</strong>
     * <p>危险品联合国编号</p>
     */
    @NameInMap("un_no")
    public String unNo;

    // 体积 业务必填
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("volume")
    public String volume;

    // 毛重 业务必填
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("weight")
    public String weight;

    public static ContainerGoodsParam build(java.util.Map<String, ?> map) throws Exception {
        ContainerGoodsParam self = new ContainerGoodsParam();
        return TeaModel.build(map, self);
    }

    public ContainerGoodsParam setCargoReadyDate(Long cargoReadyDate) {
        this.cargoReadyDate = cargoReadyDate;
        return this;
    }
    public Long getCargoReadyDate() {
        return this.cargoReadyDate;
    }

    public ContainerGoodsParam setDgPageNo(String dgPageNo) {
        this.dgPageNo = dgPageNo;
        return this;
    }
    public String getDgPageNo() {
        return this.dgPageNo;
    }

    public ContainerGoodsParam setDgType(String dgType) {
        this.dgType = dgType;
        return this;
    }
    public String getDgType() {
        return this.dgType;
    }

    public ContainerGoodsParam setFlashPoint(String flashPoint) {
        this.flashPoint = flashPoint;
        return this;
    }
    public String getFlashPoint() {
        return this.flashPoint;
    }

    public ContainerGoodsParam setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public ContainerGoodsParam setGoodsCn(String goodsCn) {
        this.goodsCn = goodsCn;
        return this;
    }
    public String getGoodsCn() {
        return this.goodsCn;
    }

    public ContainerGoodsParam setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public ContainerGoodsParam setHsCodes(java.util.List<String> hsCodes) {
        this.hsCodes = hsCodes;
        return this;
    }
    public java.util.List<String> getHsCodes() {
        return this.hsCodes;
    }

    public ContainerGoodsParam setMarks(String marks) {
        this.marks = marks;
        return this;
    }
    public String getMarks() {
        return this.marks;
    }

    public ContainerGoodsParam setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ContainerGoodsParam setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public ContainerGoodsParam setRealNumber(String realNumber) {
        this.realNumber = realNumber;
        return this;
    }
    public String getRealNumber() {
        return this.realNumber;
    }

    public ContainerGoodsParam setRealVolume(String realVolume) {
        this.realVolume = realVolume;
        return this;
    }
    public String getRealVolume() {
        return this.realVolume;
    }

    public ContainerGoodsParam setRealWeight(String realWeight) {
        this.realWeight = realWeight;
        return this;
    }
    public String getRealWeight() {
        return this.realWeight;
    }

    public ContainerGoodsParam setUnNo(String unNo) {
        this.unNo = unNo;
        return this;
    }
    public String getUnNo() {
        return this.unNo;
    }

    public ContainerGoodsParam setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

    public ContainerGoodsParam setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
