// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class CallbackRightsprodStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益编码
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 券码
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 券变更状态
    // V_USE（使用）
    // V_REFUND（退款）
    // V_EXPIRE（过期）
    // V_INVALID（作废）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static CallbackRightsprodStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackRightsprodStatusRequest self = new CallbackRightsprodStatusRequest();
        return TeaModel.build(map, self);
    }

    public CallbackRightsprodStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackRightsprodStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackRightsprodStatusRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public CallbackRightsprodStatusRequest setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public CallbackRightsprodStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
