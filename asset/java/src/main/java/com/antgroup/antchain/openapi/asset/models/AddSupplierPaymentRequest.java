// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class AddSupplierPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 打款记录集
    @NameInMap("payment_records")
    @Validation(required = true)
    public java.util.List<PaymentRecord> paymentRecords;

    public static AddSupplierPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSupplierPaymentRequest self = new AddSupplierPaymentRequest();
        return TeaModel.build(map, self);
    }

    public AddSupplierPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSupplierPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSupplierPaymentRequest setPaymentRecords(java.util.List<PaymentRecord> paymentRecords) {
        this.paymentRecords = paymentRecords;
        return this;
    }
    public java.util.List<PaymentRecord> getPaymentRecords() {
        return this.paymentRecords;
    }

}
