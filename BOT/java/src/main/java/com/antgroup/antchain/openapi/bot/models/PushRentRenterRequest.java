// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushRentRenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租客id
    @NameInMap("renter_id")
    @Validation(required = true)
    public String renterId;

    // 租客名称
    @NameInMap("renter_name")
    @Validation(required = true)
    public String renterName;

    // 租客联系电话
    @NameInMap("renter_phone")
    @Validation(required = true)
    public String renterPhone;

    // 租客身份证号
    @NameInMap("renter_id_card")
    public String renterIdCard;

    // 房源唯一ID
    @NameInMap("house_id")
    @Validation(required = true)
    public String houseId;

    // 租赁合同信息
    @NameInMap("rent_contract")
    @Validation(required = true)
    public RentContractInfo rentContract;

    // 企业(业主)身份识别码
    @NameInMap("merchant_id_card")
    @Validation(required = true)
    public String merchantIdCard;

    public static PushRentRenterRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRentRenterRequest self = new PushRentRenterRequest();
        return TeaModel.build(map, self);
    }

    public PushRentRenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRentRenterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRentRenterRequest setRenterId(String renterId) {
        this.renterId = renterId;
        return this;
    }
    public String getRenterId() {
        return this.renterId;
    }

    public PushRentRenterRequest setRenterName(String renterName) {
        this.renterName = renterName;
        return this;
    }
    public String getRenterName() {
        return this.renterName;
    }

    public PushRentRenterRequest setRenterPhone(String renterPhone) {
        this.renterPhone = renterPhone;
        return this;
    }
    public String getRenterPhone() {
        return this.renterPhone;
    }

    public PushRentRenterRequest setRenterIdCard(String renterIdCard) {
        this.renterIdCard = renterIdCard;
        return this;
    }
    public String getRenterIdCard() {
        return this.renterIdCard;
    }

    public PushRentRenterRequest setHouseId(String houseId) {
        this.houseId = houseId;
        return this;
    }
    public String getHouseId() {
        return this.houseId;
    }

    public PushRentRenterRequest setRentContract(RentContractInfo rentContract) {
        this.rentContract = rentContract;
        return this;
    }
    public RentContractInfo getRentContract() {
        return this.rentContract;
    }

    public PushRentRenterRequest setMerchantIdCard(String merchantIdCard) {
        this.merchantIdCard = merchantIdCard;
        return this;
    }
    public String getMerchantIdCard() {
        return this.merchantIdCard;
    }

}
