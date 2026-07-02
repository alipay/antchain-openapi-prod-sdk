// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushRentHouseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 房源信息集合 数组
    @NameInMap("house_list")
    @Validation(required = true)
    public java.util.List<HouseInfo> houseList;

    // 企业(业主)身份识别码
    @NameInMap("merchant_id_card")
    @Validation(required = true)
    public String merchantIdCard;

    // 联系电话
    @NameInMap("phone")
    public String phone;

    // 联系人
    @NameInMap("contract")
    public String contract;

    // 对应会员用户id
    @NameInMap("user_id")
    public String userId;

    public static PushRentHouseRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRentHouseRequest self = new PushRentHouseRequest();
        return TeaModel.build(map, self);
    }

    public PushRentHouseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRentHouseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRentHouseRequest setHouseList(java.util.List<HouseInfo> houseList) {
        this.houseList = houseList;
        return this;
    }
    public java.util.List<HouseInfo> getHouseList() {
        return this.houseList;
    }

    public PushRentHouseRequest setMerchantIdCard(String merchantIdCard) {
        this.merchantIdCard = merchantIdCard;
        return this;
    }
    public String getMerchantIdCard() {
        return this.merchantIdCard;
    }

    public PushRentHouseRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public PushRentHouseRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public PushRentHouseRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
