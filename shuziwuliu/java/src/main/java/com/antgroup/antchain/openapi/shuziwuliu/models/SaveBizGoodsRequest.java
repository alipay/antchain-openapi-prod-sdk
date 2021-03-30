// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 预计备货时间 毫秒值单位
    @NameInMap("cargo_ready_date")
    public Long cargoReadyDate;

    // 危险品页号
    @NameInMap("dg_page_no")
    public String dgPageNo;

    // 危险品级别
    @NameInMap("dg_type")
    public String dgType;

    // 危险品闪点
    @NameInMap("flash_point")
    public String flashPoint;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 货物 业务必填	
    // 
    @NameInMap("goods")
    public String goods;

    // 中文品名
    @NameInMap("goods_cn")
    public String goodsCn;

    // 货物ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 货物类型（业务必填）
    @NameInMap("goods_type")
    public String goodsType;

    // HS CODE
    @NameInMap("hs_codes")
    public java.util.List<String> hsCodes;

    // 唛头
    @NameInMap("marks")
    public String marks;

    // 委托件数 业务必填	
    // 
    @NameInMap("number")
    public String number;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 包装类型
    @NameInMap("package_type")
    public String packageType;

    // 实际件数
    @NameInMap("real_number")
    public String realNumber;

    // 实际体积
    @NameInMap("real_volume")
    public String realVolume;

    // 实际重量
    @NameInMap("real_weight")
    public String realWeight;

    // 危险品联合国编号
    @NameInMap("un_no")
    public String unNo;

    // 委托体积（业务必填）
    @NameInMap("volume")
    public String volume;

    // 委托重量（业务必填）
    @NameInMap("weight")
    public String weight;

    public static SaveBizGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizGoodsRequest self = new SaveBizGoodsRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizGoodsRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizGoodsRequest setCargoReadyDate(Long cargoReadyDate) {
        this.cargoReadyDate = cargoReadyDate;
        return this;
    }
    public Long getCargoReadyDate() {
        return this.cargoReadyDate;
    }

    public SaveBizGoodsRequest setDgPageNo(String dgPageNo) {
        this.dgPageNo = dgPageNo;
        return this;
    }
    public String getDgPageNo() {
        return this.dgPageNo;
    }

    public SaveBizGoodsRequest setDgType(String dgType) {
        this.dgType = dgType;
        return this;
    }
    public String getDgType() {
        return this.dgType;
    }

    public SaveBizGoodsRequest setFlashPoint(String flashPoint) {
        this.flashPoint = flashPoint;
        return this;
    }
    public String getFlashPoint() {
        return this.flashPoint;
    }

    public SaveBizGoodsRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizGoodsRequest setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public SaveBizGoodsRequest setGoodsCn(String goodsCn) {
        this.goodsCn = goodsCn;
        return this;
    }
    public String getGoodsCn() {
        return this.goodsCn;
    }

    public SaveBizGoodsRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public SaveBizGoodsRequest setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public SaveBizGoodsRequest setHsCodes(java.util.List<String> hsCodes) {
        this.hsCodes = hsCodes;
        return this;
    }
    public java.util.List<String> getHsCodes() {
        return this.hsCodes;
    }

    public SaveBizGoodsRequest setMarks(String marks) {
        this.marks = marks;
        return this;
    }
    public String getMarks() {
        return this.marks;
    }

    public SaveBizGoodsRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public SaveBizGoodsRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizGoodsRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public SaveBizGoodsRequest setRealNumber(String realNumber) {
        this.realNumber = realNumber;
        return this;
    }
    public String getRealNumber() {
        return this.realNumber;
    }

    public SaveBizGoodsRequest setRealVolume(String realVolume) {
        this.realVolume = realVolume;
        return this;
    }
    public String getRealVolume() {
        return this.realVolume;
    }

    public SaveBizGoodsRequest setRealWeight(String realWeight) {
        this.realWeight = realWeight;
        return this;
    }
    public String getRealWeight() {
        return this.realWeight;
    }

    public SaveBizGoodsRequest setUnNo(String unNo) {
        this.unNo = unNo;
        return this;
    }
    public String getUnNo() {
        return this.unNo;
    }

    public SaveBizGoodsRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

    public SaveBizGoodsRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
