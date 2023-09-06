// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class ImportResourceConsigneeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 收货地址
    @NameInMap("delivery_address")
    @Validation(required = true)
    public String deliveryAddress;

    // email
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 中奖人手机号
    @NameInMap("lucky_phone")
    @Validation(required = true)
    public String luckyPhone;

    // 单据号，幂等用
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static ImportResourceConsigneeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportResourceConsigneeinfoRequest self = new ImportResourceConsigneeinfoRequest();
        return TeaModel.build(map, self);
    }

    public ImportResourceConsigneeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportResourceConsigneeinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportResourceConsigneeinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportResourceConsigneeinfoRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ImportResourceConsigneeinfoRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public ImportResourceConsigneeinfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ImportResourceConsigneeinfoRequest setLuckyPhone(String luckyPhone) {
        this.luckyPhone = luckyPhone;
        return this;
    }
    public String getLuckyPhone() {
        return this.luckyPhone;
    }

    public ImportResourceConsigneeinfoRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
