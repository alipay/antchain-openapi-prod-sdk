// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelBclInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁宝plus订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 保险单号
    @NameInMap("bcl_insurance_record_id")
    @Validation(required = true, maxLength = 64)
    public String bclInsuranceRecordId;

    // 人保退保时必填
    @NameInMap("renbao_ext_info")
    public RenbaoExtInfo renbaoExtInfo;

    // 保司code，枚举值 HZ_RENBAO: 杭州人保
    @NameInMap("insurance_code")
    @Validation(required = true, maxLength = 32)
    public String insuranceCode;

    public static CancelBclInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBclInsuranceRequest self = new CancelBclInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public CancelBclInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBclInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBclInsuranceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelBclInsuranceRequest setBclInsuranceRecordId(String bclInsuranceRecordId) {
        this.bclInsuranceRecordId = bclInsuranceRecordId;
        return this;
    }
    public String getBclInsuranceRecordId() {
        return this.bclInsuranceRecordId;
    }

    public CancelBclInsuranceRequest setRenbaoExtInfo(RenbaoExtInfo renbaoExtInfo) {
        this.renbaoExtInfo = renbaoExtInfo;
        return this;
    }
    public RenbaoExtInfo getRenbaoExtInfo() {
        return this.renbaoExtInfo;
    }

    public CancelBclInsuranceRequest setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
        return this;
    }
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

}
