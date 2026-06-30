// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubheCustomerInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户姓名(可修改字段)
    @NameInMap("custom_name")
    public String customName;

    // 户籍所在地(可修改字段)
    @NameInMap("census_register")
    public String censusRegister;

    // 证件号码(可修改字段)
    @NameInMap("card_no")
    public String cardNo;

    // 手机号码(可修改字段)
    @NameInMap("mobile")
    public String mobile;

    // 客户编号(唯一不变)
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    public static UpdateDubheCustomerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubheCustomerInfoRequest self = new UpdateDubheCustomerInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDubheCustomerInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDubheCustomerInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDubheCustomerInfoRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public UpdateDubheCustomerInfoRequest setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
        return this;
    }
    public String getCensusRegister() {
        return this.censusRegister;
    }

    public UpdateDubheCustomerInfoRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public UpdateDubheCustomerInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateDubheCustomerInfoRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public UpdateDubheCustomerInfoRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
