// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VehicleInfo extends TeaModel {
    // 流量方购物订单号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 订单[分期]金额，单位：元
    /**
     * <strong>example:</strong>
     * <p>199.88</p>
     */
    @NameInMap("trade_amount")
    public String tradeAmount;

    // 首付金额，单位：元
    /**
     * <strong>example:</strong>
     * <p>199.00</p>
     */
    @NameInMap("down_payment")
    public String downPayment;

    // 新车指导价，单位：元
    /**
     * <strong>example:</strong>
     * <p>199.88</p>
     */
    @NameInMap("guide_price")
    public String guidePrice;

    // 售价，单位：元
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("selling_price")
    public String sellingPrice;

    // 车驾号/SN码，车辆唯一标识
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("sn")
    public String sn;

    // SKU ID
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("sku")
    public String sku;

    // 品牌
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("brand")
    public String brand;

    // 车型
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("model")
    public String model;

    // 年款，yyyy
    /**
     * <strong>example:</strong>
     * <p>yyyy</p>
     */
    @NameInMap("model_year")
    public String modelYear;

    // 颜色
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("color")
    public String color;

    // 续航里程
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("range")
    public String range;

    // 配件信息
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("parts")
    public String parts;

    // 公里数，Odometer
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("odo")
    public String odo;

    // 首次上牌时间
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("first_reg_date")
    public String firstRegDate;

    // 过户次数，Ownership Transfer Records
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("otr")
    public String otr;

    public static VehicleInfo build(java.util.Map<String, ?> map) throws Exception {
        VehicleInfo self = new VehicleInfo();
        return TeaModel.build(map, self);
    }

    public VehicleInfo setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public VehicleInfo setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public VehicleInfo setDownPayment(String downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public String getDownPayment() {
        return this.downPayment;
    }

    public VehicleInfo setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
        return this;
    }
    public String getGuidePrice() {
        return this.guidePrice;
    }

    public VehicleInfo setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }
    public String getSellingPrice() {
        return this.sellingPrice;
    }

    public VehicleInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public VehicleInfo setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public VehicleInfo setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public VehicleInfo setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public VehicleInfo setModelYear(String modelYear) {
        this.modelYear = modelYear;
        return this;
    }
    public String getModelYear() {
        return this.modelYear;
    }

    public VehicleInfo setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public VehicleInfo setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public VehicleInfo setParts(String parts) {
        this.parts = parts;
        return this;
    }
    public String getParts() {
        return this.parts;
    }

    public VehicleInfo setOdo(String odo) {
        this.odo = odo;
        return this;
    }
    public String getOdo() {
        return this.odo;
    }

    public VehicleInfo setFirstRegDate(String firstRegDate) {
        this.firstRegDate = firstRegDate;
        return this;
    }
    public String getFirstRegDate() {
        return this.firstRegDate;
    }

    public VehicleInfo setOtr(String otr) {
        this.otr = otr;
        return this;
    }
    public String getOtr() {
        return this.otr;
    }

}
