// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeCustomerInfoRequest extends TeaModel {
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

    // 身份证有效期
    @NameInMap("id_valid_date")
    public String idValidDate;

    public static UpdateDubbridgeCustomerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeCustomerInfoRequest self = new UpdateDubbridgeCustomerInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeCustomerInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDubbridgeCustomerInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDubbridgeCustomerInfoRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public UpdateDubbridgeCustomerInfoRequest setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
        return this;
    }
    public String getCensusRegister() {
        return this.censusRegister;
    }

    public UpdateDubbridgeCustomerInfoRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public UpdateDubbridgeCustomerInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateDubbridgeCustomerInfoRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public UpdateDubbridgeCustomerInfoRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UpdateDubbridgeCustomerInfoRequest setIdValidDate(String idValidDate) {
        this.idValidDate = idValidDate;
        return this;
    }
    public String getIdValidDate() {
        return this.idValidDate;
    }

}
