// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CarLoss extends TeaModel {
    // 车牌号，车牌号和车架号至少填一个
    /**
     * <strong>example:</strong>
     * <p>皖C54322</p>
     */
    @NameInMap("car_mark")
    @Validation(maxLength = 20)
    public String carMark;

    // 车主姓名 
    /**
     * <strong>example:</strong>
     * <p>王大毛</p>
     */
    @NameInMap("car_owner_name")
    @Validation(maxLength = 200)
    public String carOwnerName;

    // 车主联系方式
    /**
     * <strong>example:</strong>
     * <p>17029990909</p>
     */
    @NameInMap("car_owner_contact")
    @Validation(maxLength = 20)
    public String carOwnerContact;

    // 车架号，车牌号和车架号至少填一个
    /**
     * <strong>example:</strong>
     * <p>DMQJ928881992</p>
     */
    @NameInMap("car_vin_no")
    @Validation(maxLength = 100)
    public String carVinNo;

    // 损失预估，单位（元），最多支持2位小数
    /**
     * <strong>example:</strong>
     * <p>1002.00</p>
     */
    @NameInMap("car_loss_estimate_amount")
    @Validation(required = true)
    public String carLossEstimateAmount;

    public static CarLoss build(java.util.Map<String, ?> map) throws Exception {
        CarLoss self = new CarLoss();
        return TeaModel.build(map, self);
    }

    public CarLoss setCarMark(String carMark) {
        this.carMark = carMark;
        return this;
    }
    public String getCarMark() {
        return this.carMark;
    }

    public CarLoss setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
        return this;
    }
    public String getCarOwnerName() {
        return this.carOwnerName;
    }

    public CarLoss setCarOwnerContact(String carOwnerContact) {
        this.carOwnerContact = carOwnerContact;
        return this;
    }
    public String getCarOwnerContact() {
        return this.carOwnerContact;
    }

    public CarLoss setCarVinNo(String carVinNo) {
        this.carVinNo = carVinNo;
        return this;
    }
    public String getCarVinNo() {
        return this.carVinNo;
    }

    public CarLoss setCarLossEstimateAmount(String carLossEstimateAmount) {
        this.carLossEstimateAmount = carLossEstimateAmount;
        return this;
    }
    public String getCarLossEstimateAmount() {
        return this.carLossEstimateAmount;
    }

}
