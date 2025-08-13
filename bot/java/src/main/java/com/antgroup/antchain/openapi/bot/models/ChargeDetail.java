// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ChargeDetail extends TeaModel {
    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("detail_start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String detailStartTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("detail_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String detailEndTime;

    // 时段电价，小数点后4位
    /**
     * <strong>example:</strong>
     * <p>10.1010</p>
     */
    @NameInMap("elec_price")
    public String elecPrice;

    // 时段服务费价格，小数点后4位
    /**
     * <strong>example:</strong>
     * <p>12.6222</p>
     */
    @NameInMap("service_price")
    public String servicePrice;

    // 时段充电量，单位：度，小数点后2位
    /**
     * <strong>example:</strong>
     * <p>12.12</p>
     */
    @NameInMap("detail_power")
    @Validation(required = true)
    public String detailPower;

    // 时段电费，小数点后2位
    /**
     * <strong>example:</strong>
     * <p>10.10</p>
     */
    @NameInMap("detail_elec_money")
    public String detailElecMoney;

    // 时段服务费，小数点后2位
    /**
     * <strong>example:</strong>
     * <p>10.10</p>
     */
    @NameInMap("detail_service_money")
    public String detailServiceMoney;

    public static ChargeDetail build(java.util.Map<String, ?> map) throws Exception {
        ChargeDetail self = new ChargeDetail();
        return TeaModel.build(map, self);
    }

    public ChargeDetail setDetailStartTime(String detailStartTime) {
        this.detailStartTime = detailStartTime;
        return this;
    }
    public String getDetailStartTime() {
        return this.detailStartTime;
    }

    public ChargeDetail setDetailEndTime(String detailEndTime) {
        this.detailEndTime = detailEndTime;
        return this;
    }
    public String getDetailEndTime() {
        return this.detailEndTime;
    }

    public ChargeDetail setElecPrice(String elecPrice) {
        this.elecPrice = elecPrice;
        return this;
    }
    public String getElecPrice() {
        return this.elecPrice;
    }

    public ChargeDetail setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
        return this;
    }
    public String getServicePrice() {
        return this.servicePrice;
    }

    public ChargeDetail setDetailPower(String detailPower) {
        this.detailPower = detailPower;
        return this;
    }
    public String getDetailPower() {
        return this.detailPower;
    }

    public ChargeDetail setDetailElecMoney(String detailElecMoney) {
        this.detailElecMoney = detailElecMoney;
        return this;
    }
    public String getDetailElecMoney() {
        return this.detailElecMoney;
    }

    public ChargeDetail setDetailServiceMoney(String detailServiceMoney) {
        this.detailServiceMoney = detailServiceMoney;
        return this;
    }
    public String getDetailServiceMoney() {
        return this.detailServiceMoney;
    }

}
