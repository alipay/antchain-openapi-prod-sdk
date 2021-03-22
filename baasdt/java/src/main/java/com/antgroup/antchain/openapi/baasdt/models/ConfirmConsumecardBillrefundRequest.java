// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmConsumecardBillrefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否接受退款申请，true同意退款，false拒绝退款
    @NameInMap("accept")
    @Validation(required = true)
    public Boolean accept;

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

    public static ConfirmConsumecardBillrefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConsumecardBillrefundRequest self = new ConfirmConsumecardBillrefundRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmConsumecardBillrefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmConsumecardBillrefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmConsumecardBillrefundRequest setAccept(Boolean accept) {
        this.accept = accept;
        return this;
    }
    public Boolean getAccept() {
        return this.accept;
    }

    public ConfirmConsumecardBillrefundRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmConsumecardBillrefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmConsumecardBillrefundRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
