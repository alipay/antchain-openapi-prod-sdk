// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class AddSupplierPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 云上租户id 
    @NameInMap("cloud_tenant_id")
    @Validation(required = true)
    public String cloudTenantId;

    // 打款金额，单位分
    @NameInMap("payment_amount")
    @Validation(required = true)
    public Long paymentAmount;

    // 服务商名称 - 即云租户名称，比如南京飞翰
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 打款日期
    @NameInMap("payment_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String paymentDate;

    // 唯一请求id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

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

    public AddSupplierPaymentRequest setCloudTenantId(String cloudTenantId) {
        this.cloudTenantId = cloudTenantId;
        return this;
    }
    public String getCloudTenantId() {
        return this.cloudTenantId;
    }

    public AddSupplierPaymentRequest setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public Long getPaymentAmount() {
        return this.paymentAmount;
    }

    public AddSupplierPaymentRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public AddSupplierPaymentRequest setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    public String getPaymentDate() {
        return this.paymentDate;
    }

    public AddSupplierPaymentRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
