// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class StartFinanceWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货物运费险
    @NameInMap("cargo_insurance_money")
    public String cargoInsuranceMoney;

    // 车牌颜色
    @NameInMap("cart_badge_color")
    @Validation(required = true)
    public String cartBadgeColor;

    // 车牌号
    @NameInMap("cart_badge_no")
    @Validation(required = true)
    public String cartBadgeNo;

    // 承运商did
    @NameInMap("car_captain_did")
    public String carCaptainDid;

    // 司机分布式数字身份
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 起运时间，13位毫秒级时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static StartFinanceWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        StartFinanceWaybillRequest self = new StartFinanceWaybillRequest();
        return TeaModel.build(map, self);
    }

    public StartFinanceWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartFinanceWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartFinanceWaybillRequest setCargoInsuranceMoney(String cargoInsuranceMoney) {
        this.cargoInsuranceMoney = cargoInsuranceMoney;
        return this;
    }
    public String getCargoInsuranceMoney() {
        return this.cargoInsuranceMoney;
    }

    public StartFinanceWaybillRequest setCartBadgeColor(String cartBadgeColor) {
        this.cartBadgeColor = cartBadgeColor;
        return this;
    }
    public String getCartBadgeColor() {
        return this.cartBadgeColor;
    }

    public StartFinanceWaybillRequest setCartBadgeNo(String cartBadgeNo) {
        this.cartBadgeNo = cartBadgeNo;
        return this;
    }
    public String getCartBadgeNo() {
        return this.cartBadgeNo;
    }

    public StartFinanceWaybillRequest setCarCaptainDid(String carCaptainDid) {
        this.carCaptainDid = carCaptainDid;
        return this;
    }
    public String getCarCaptainDid() {
        return this.carCaptainDid;
    }

    public StartFinanceWaybillRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public StartFinanceWaybillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public StartFinanceWaybillRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StartFinanceWaybillRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
