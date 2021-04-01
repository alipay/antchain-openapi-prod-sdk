// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmConsumecardBillcreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 账单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 附言(不要超过500个字符)
    @NameInMap("remark")
    public String remark;

    // 账单创建是否确认成功。true为成功，false为失败
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static ConfirmConsumecardBillcreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConsumecardBillcreateRequest self = new ConfirmConsumecardBillcreateRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmConsumecardBillcreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmConsumecardBillcreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmConsumecardBillcreateRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmConsumecardBillcreateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmConsumecardBillcreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ConfirmConsumecardBillcreateRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
